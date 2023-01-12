/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.fichiers;

import cli.Commande;
import cli.CommandeLs;
import cli.Navigateur;
import cli.PasseurDeCommande;
import java.util.Arrays;
import java.util.Scanner;
import metier.FichierSimple;
import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class GestionFichiers {

    /**
     * @param args the command line arguments
     */
    
    public static Repertoire initialiser() {
        	
	FichierSimple fic1 = new FichierSimple("fichier1", 120, Repertoire.getRoot());
	FichierSimple fic2 = new FichierSimple("fichier2", 120, Repertoire.getRoot());
        
	Repertoire dossier1 = new Repertoire("dossier1", Repertoire.getRoot());		
	FichierSimple fic3 = new FichierSimple("fichier1.1", 120, dossier1);
	FichierSimple fic4 = new FichierSimple("fichier1.2", 120, dossier1);
		
	Repertoire dossier2 = new Repertoire("dossier2", Repertoire.getRoot());	
	FichierSimple fic5 = new FichierSimple("fichier2.1", 120, dossier2);
	FichierSimple fic6 = new FichierSimple("fichier2.2", 120, dossier2);
	FichierSimple fic7 = new FichierSimple("fichier2.3", 120, dossier2);
		
	FichierSimple fic8 = new FichierSimple("fichier8", Repertoire.getRoot());
		
	Repertoire dossier3 = new Repertoire("Dossier2.1", dossier2);
	FichierSimple fic9 = new FichierSimple("fichier2.1.1", dossier3);
	FichierSimple fic10 = new FichierSimple("fichier2.1.2", dossier3);
	FichierSimple fic11 = new FichierSimple("fichier2.1.3", dossier3);
        
        return Repertoire.getRoot();
    }
        
    public static void main(String[] args) {
		
	// System.out.println(Repertoire.getRoot().toString());
        
        Scanner scanner = new Scanner(System.in);
        Navigateur nav = new Navigateur(initialiser());
        PasseurDeCommande passeur = new PasseurDeCommande();
        
        while (true) {
            System.out.print(nav.getRepCourant().getUrl() + "$ ");
            String commande = scanner.nextLine().trim();
            Commande cmd = passeur.parser(commande); 
            cmd.traiter(nav);
        }
        
    }
    
}
   
