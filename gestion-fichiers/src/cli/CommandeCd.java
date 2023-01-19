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
public class CommandeCd extends Commande{

    public CommandeCd(String[] arguments) {
        super("cd", arguments);
    }
    
    @Override
    public void executer(Navigateur nav) {
        if(arguments.length == 0) {
            nav.setRepCourant(Repertoire.getRoot());
            return;
        } else if(arguments[0].equals("..")){
            nav.setRepCourant(nav.getRepCourant().getRepertoire());
            return;
        }
        else if (arguments.length != 1) {
            System.out.println("La commande 'cd' attend un seul argument");
            return;
        }
        Repertoire cible = nav.getRepCourant().getSousRepertoire(arguments[0]);
        if (cible == null) {
            System.out.println("Ce repertoire n'existe pas dans le dossier courant");
            return;
        }
        nav.setRepCourant(cible);
    }
    
}
