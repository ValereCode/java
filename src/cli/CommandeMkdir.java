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
public class CommandeMkdir extends Commande{

    private String nom;
    
    public CommandeMkdir(String[] argument) {
        this.nom = argument[0];
        
    }
    
    @Override
    public void executer(Navigateur nav) { // Produit de la commande mkdir
        
        Repertoire rep = new Repertoire(this.nom, nav.getRepCourant());
        nav.getRepCourant().addInRepertoire(rep);
        
        System.out.println("\n");
    }
    
}
