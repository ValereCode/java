/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import java.util.List;
import metier.Fichier;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class CommandeCD extends Commande {
    String[] commande;
    
    public CommandeCD(String[] argument) {
        this.commande = argument;
        for(String elt: argument){
            System.out.println(elt);
        }
    }
    
    @Override
    public void executer(Navigateur nav) { // Produit de la commande cd
        Repertoire destination = null;
        List<Fichier> liste = nav.getRepCourant().fichiers;
        for( Fichier fic: liste){
            if(fic.getNom().equals(this.commande[0])){
                destination = (Repertoire) fic;
            }
        }
        if(liste.contains(destination)){
            nav.setRepCourant(destination);
        } else {
            System.out.println("Pas de dossier de ce nom");
        }
         
        System.out.println("\n");
    }
    
}
