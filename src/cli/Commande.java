/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import java.util.Arrays;

/**
 *
 * @author setodji
 */
public abstract class Commande {

    protected String nom;
    protected String[] arguments;

    //==========================================================================
    protected Commande() {
    }

    protected Commande(String[] arguments) {
        this.arguments = arguments;
    }

    protected Commande(String nom, String[] arguments) {
        this.nom = nom;
        this.arguments = arguments;
    }
    //==========================================================================
    
    public void traiter(Navigateur nav) {
        this.executer(nav);
    }

    public abstract void executer(Navigateur nav);

    //==========================================================================
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String[] getArguments() {
        return arguments;
    }

    public void setArguments(String[] arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "Commande{" + "nom=" + nom + ", arguments=" + Arrays.toString(arguments) + '}';
    }

}
