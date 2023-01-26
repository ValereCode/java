/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author setodji
 */
public class CommandeLs extends Commande {

    public CommandeLs(String[] argument) {
    }

    @Override
    public void executer(Navigateur nav) { // Produit de la commande ls
        nav.getRepCourant().afficher();
        System.out.println("\n");
    }

}
