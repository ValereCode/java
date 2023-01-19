/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Fichier;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeRm extends Commande{

    public CommandeRm(String[] arguments) {
        super("rm", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        
        Repertoire courant = nav.getRepCourant();
        if (arguments.length == 0) {
            System.out.println("La commande rm attend au moins un argument");
            return;
        }  
        if (arguments.length > 1) {
            System.out.println("La commande rm n'attend qu'un seul argument");
            return;
        } 
        
        Fichier suppr = null;
        for(Fichier fic: courant.getFichiers()){
            if(fic.getNom().equals(arguments[0])){
                suppr = fic;
            }
        }
        
        if(suppr == null){
            System.out.println("Le Fichier à supprimer n'existe pas !!!");
        } else if(suppr instanceof Repertoire) {
            courant.getFichiers().remove(suppr);
            System.out.println("Le Repertoire est supprimer avec succès");
        } else {
            courant.getFichiers().remove(suppr);
            System.out.println("Le fichier est supprimer avec succès");
        }
        
    }
    
}
