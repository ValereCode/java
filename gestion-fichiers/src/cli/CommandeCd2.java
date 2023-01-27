/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeCd2 extends Commande{

    public CommandeCd2(String[] arguments) {
        super("cd2", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        if(arguments.length == 1){
            String[] cheminTab = arguments[0].split("/");
            for(int i=0; i<cheminTab.length; i++){
                
                Repertoire cible = nav.getRepCourant().getSousRepertoire(cheminTab[i]);
                if (cible == null) {
                    System.out.println("Le chemin spécifié n'existe pas dans le dossier courant\n");
                    return;
                }
                nav.setRepCourant(cible);
                
            }
            return;
        }
        System.out.println("La commande cd2 n' attend qu'un argument!");
        return;
    }
    
}
