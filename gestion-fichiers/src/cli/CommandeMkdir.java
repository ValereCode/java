/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import java.util.Date;
import metier.Fichier;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeMkdir extends Commande{

    public CommandeMkdir(String[] arguments) {
        super("mkdir", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        
        Repertoire courant = nav.getRepCourant();
        if (arguments.length == 0) {
            System.out.println("La commande mkdir attend au moins un argument");
            return;
        }  
        if (arguments.length > 1) {
            System.out.println("La commande mkdir n'attend qu'un seul argument");
            return;
        } 
        for(Fichier fic: courant.getFichiers()){
            if(fic.getNom().equals(arguments[0]) && fic instanceof Repertoire){
                System.out.println("Ce repertoire existe déja !!!");
                return;
            }
        }
        
        Repertoire repertoire = new Repertoire(arguments[0], new Date(), courant);
        
    }
    
}
