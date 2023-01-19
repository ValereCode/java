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
public abstract class Fichier {

    protected String nom;
    protected Date date;
    protected Repertoire repertoire;

    //==========================================================================
    protected Fichier() {

    }

    protected Fichier(String nom, Date date, Repertoire r) {
        this.nom = nom;
        this.date = date;
        this.repertoire = r;
        r.addInRepertoire(this);
    }

    protected Fichier(String nom, Date date) {
        this.nom = nom;
        this.date = date;
    }

    protected Fichier(String nom, Repertoire r) {
        this(nom, new Date(), r);
    }

    protected Fichier(String nom) {
        this(nom, new Date());
    }

    protected Fichier(Fichier f) {
        this.nom = f.nom;
        this.date = f.date;
    }
    //==========================================================================

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    protected abstract double getTaille();

    public Repertoire getRepertoire() {
        return repertoire;
    }

    public String getUrl() { 
        if (this.repertoire == null) {
            return this.nom;
        }
        return this.repertoire.getUrl() + "/" + this.nom;
    }

    public String getCaracteristiques() { // Pour prendre les caractéristiques
        return this.nom + " => URL: " + this.getUrl() + " | Taille: " + this.getTaille() + "KO | Date: " + this.date;
    }

    public void printUrl() { // Afficher l'url complet
        System.out.println(this.getCaracteristiques());
    }

    protected abstract void printStructure();  // Pour faire l'affichage des URL

    public String prefixe() {  // Pour faire une tabulation pour les fichiers
        if (this.repertoire == null) {
            return "";
        }
        return this.repertoire.prefixe() + "\t";
    }

}
