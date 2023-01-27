/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Fichier;

/**
 *
 * @author setodji
 */
public class CommandeMv extends Commande{

    public CommandeMv(String[] arguments) {
        super("mv", arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        if(arguments.length != 2){
            System.out.println("La commande mv attend exactement deux arguments!\n");
            return;
        }
        
        for(Fichier fic: nav.getRepCourant().getFichiers()){
            if(fic.getNom().equals(arguments[0])){
                for(Fichier f: nav.getRepCourant().getFichiers()){
                    if(f.getNom().equals(arguments[1])){
                        System.out.println("Le nouveau Fichier existe déja\n");
                        return;
                    }
                }
                fic.setNom(arguments[1]);
                return;
            }
        }
        System.out.println("Le Fichier à renomer n'existe pas!\n");
        return;
    }
    
}
