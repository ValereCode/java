/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Fichier;
import metier.FichierSimple;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeCat extends Commande{

    public CommandeCat(String[] arguments) {
        super("cat", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        
        Repertoire courant = nav.getRepCourant();
        if (arguments.length == 0) {
            System.out.println("La commande cat attend un argument");
            return;
        }  
        if (arguments.length > 1) {
            System.out.println("La commande touch n'attend qu'un seul argument");
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
        } else if (suppr instanceof FichierSimple) {
            String contenu;
            contenu = ((FichierSimple) suppr).lireFichier(suppr.getUrl());
            System.out.println(contenu);
        } else {
            System.out.println("La commande cat ne peut être utilisée que pour les fichiers simples");
        }
    }
    
}
