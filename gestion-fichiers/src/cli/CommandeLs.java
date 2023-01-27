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

    public CommandeLs(String[] arguments) {
        super("ls", arguments);
    }

    @Override
    public void executer(Navigateur nav) throws IllegalArgumentException{ // Produit de la commande ls

        if(arguments.length == 1) {
            if (arguments[0].equals("-a") || arguments[0].equals("--all")) {
                nav.getRepCourant().printStructure();
                return;
            } else {
                System.out.println("L'argument n'est pas reconnu par ls\n");
                return;
            }
            
        }
        else if (arguments.length > 1) {
            System.out.println("La commande ls n'attend qu'un seul argument\n");
            return;
        }
        nav.getRepCourant().afficher();
        System.out.println("\n");
    }

}
