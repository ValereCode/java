/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author setodji
 */
public class CommandeQ extends Commande{

    public CommandeQ(String[] arguments) {
        super("q", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        if(arguments.length == 0){
            System.exit(0);
        }
        System.out.println("La commande q n'attend pas d'arguments!\n");
        return;
    }
    
}
