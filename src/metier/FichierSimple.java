/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.Date;

/**
 *
 * @author setodji
 */
public class FichierSimple extends Fichier {

    private double taille;

    //==========================================================================
    public FichierSimple(String nom, Date date, Repertoire r) {
        super(nom, date, r);
    }

    public FichierSimple(String nom, Repertoire r) {
        super(nom, r);
    }

    public FichierSimple(String nom, Date date, double taille, Repertoire r) {
        this(nom, date, r);
        this.taille = taille;
    }

    public FichierSimple(String nom, double taille, Repertoire r) {
        this(nom, r);
        this.taille = taille;
    }
    //==========================================================================
    
    @Override
    public double getTaille() {
        return taille;
    }

    @Override
    protected void printStructure() {
        this.printUrl();
    }

    @Override
    public String toString() {
        return "- " + this.nom;
    }
}
