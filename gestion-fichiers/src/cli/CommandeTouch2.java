/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import java.util.Date;
import metier.Fichier;
import metier.FichierSimple;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeTouch2 extends Commande{

    public CommandeTouch2(String[] arguments) {
        super("touch2", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        Repertoire ici = nav.getRepCourant();
        String[] cheminTab = arguments[0].split("/");
        int longue = cheminTab.length;
            Repertoire cible = null;
            for(int i=0; i<cheminTab.length -1; i++){
                
                cible = nav.getRepCourant().getSousRepertoire(cheminTab[i]);
                if (cible == null) {
                    System.out.println("Le chemin spécifié n'existe pas dans le dossier courant\n");
                    return;
                }
                nav.setRepCourant(cible);
                
                for(Fichier fic: cible.getFichiers()){
                    if(fic.getNom().equals(cheminTab[0]) && fic instanceof FichierSimple){
                        System.out.println("Ce fichier existe déja !!!\n");
                        return;
                    }
                }
                FichierSimple fic = new FichierSimple(cheminTab[longue - 1], new Date(), cible);
                
            }
        
        nav.setRepCourant(ici);
    }
    
}
