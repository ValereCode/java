/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import gestion.fichiers.GestionFichiers;

/**
 *
 * @author setodji
 */
public class CommandeLr extends Commande{

    public CommandeLr(String[] arguments) {
        super("lr", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        if(arguments.length == 0){
            GestionFichiers.initialiser().printStructure();
            return;
        }
        System.out.println("La commande lr n'attend pas argument!\n");
        return;
    }
    
}
