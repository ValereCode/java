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
public class CommandeTouch extends Commande{

    public CommandeTouch(String[] arguments) {
        super("touch", arguments);
    }

    @Override
    public void executer(Navigateur nav) {

        Repertoire courant = nav.getRepCourant();
        if (arguments.length == 0) {
            System.out.println("La commande touch attend au moins un argument");
            return;
        }  
        if (arguments.length > 1) {
            System.out.println("La commande touch n'attend qu'un seul argument");
            return;
        } 
        for(Fichier fic: courant.getFichiers()){
            if(fic.getNom().equals(arguments[0]) && fic instanceof FichierSimple){
                System.out.println("Ce fichier existe déja !!!");
                return;
            }
        }
        
        FichierSimple fic = new FichierSimple(arguments[0], new Date(), courant);
        
    }
    
}
