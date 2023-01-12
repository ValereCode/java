/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author setodji
 */
public class CommandeAide extends Commande{

    public CommandeAide(String[] argument) {
        super(argument);
    }

    @Override
    public void executer(Navigateur nav) {
        System.out.println("Commande introuvable");
        System.out.println("Taper la commande help pour voir la liste de nos commandes");
    }
    
}
