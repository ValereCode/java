/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author setodji
 */
public class Repertoire extends Fichier {

    private double taille = 0;

    public List<Fichier> getFichiers() {
        return fichiers;
    }
    private List<Fichier> fichiers = new ArrayList<Fichier>();

    //==========================================================================
    public Repertoire(String nom, Date date, Repertoire r) {
        super(nom, date, r);
    }

    public Repertoire(String nom, Repertoire r) {
        super(nom, r);
    }

    public Repertoire(String nom) {
        super(nom);
    }
    //==========================================================================

    @Override
    public double getTaille() {
        for (Fichier f : fichiers) {
            this.taille += f.getTaille();
        }
        return taille;
    }

    public void addInRepertoire(Fichier f) {
        this.fichiers.add(f);
    }

    @Override
    public void printStructure() { // Pour afficher la structure du repertoire courant
        System.out.println("\n\nSTRUCTURE DU DOSSIER " + this.nom + '\n');
        for (Fichier f : fichiers) {
            System.out.println("\t" + f.getCaracteristiques());
            if (f.getClass().getSimpleName().equals("Repertoire")) { // S'il sagit d'un repertoire
                f.printStructure();
            }
            System.out.println("******************************************************************");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String string = "- " + this.nom;
        for (Fichier f : fichiers) {
            string += "\n" + this.prefixe() + f.toString();
        }
        return string;
    }

    public void afficher() {
        for (Fichier fichier : fichiers) {
            System.out.print("\t " + fichier.nom);
        }
    }
    
    //==========================================================================

    public Repertoire getSousRepertoire(String argument) {
        
        for (Fichier f : fichiers) {
            if (f instanceof Repertoire && f.nom.equals(argument)) {
                return (Repertoire) f;
            }
        }
        return null;
        
    }
    
    static Repertoire Root = new Repertoire("");
    public static Repertoire getRoot() {
        return Root;
    }

    public void clarifier() {
        for (Fichier fichier : fichiers) {
            System.out.println("\t " + fichier.nom + ":\t" + fichier.getUrl() + "\t" + fichier.getTaille());
        }
    }
    
}
