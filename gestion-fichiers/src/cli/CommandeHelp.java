/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author setodji
 */
public class CommandeHelp extends Commande{

    public CommandeHelp(String[] arguments) {
        super(arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        System.out.println("ls : argument[-a , all] pour lister les fichiers et repertoires dans le dossier courant");
        System.out.println("cd : argument[nouveau dossier] pour changer de repertoire");
    }
    
    
}
