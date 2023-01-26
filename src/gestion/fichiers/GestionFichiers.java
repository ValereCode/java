/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.fichiers;

import cli.CommandeLs;
import cli.Navigateur;
import cli.PasseurDeCommande;
import cli.Commande;
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
    public static void main(String[] args) {
		
	Repertoire Root = new Repertoire("");
	FichierSimple fic1 = new FichierSimple("fichier1", 120, Root);
	FichierSimple fic2 = new FichierSimple("fichier2", 120, Root);
        
	Repertoire dossier1 = new Repertoire("dossier1", Root);		
	FichierSimple fic3 = new FichierSimple("fichier1.1", 120, dossier1);
	FichierSimple fic4 = new FichierSimple("fichier1.2", 120, dossier1);
		
	Repertoire dossier2 = new Repertoire("dossier2", Root);	
	FichierSimple fic5 = new FichierSimple("fichier2.1", 120, dossier2);
	FichierSimple fic6 = new FichierSimple("fichier2.2", 120, dossier2);
	FichierSimple fic7 = new FichierSimple("fichier2.3", 120, dossier2);
		
	FichierSimple fic8 = new FichierSimple("fichier8", Root);
		
	Repertoire dossier3 = new Repertoire("Dossier2.1", dossier2);
	FichierSimple fic9 = new FichierSimple("fichier2.1.1", dossier3);
	FichierSimple fic10 = new FichierSimple("fichier2.1.2", dossier3);
	FichierSimple fic11 = new FichierSimple("fichier2.1.3", dossier3);
		
	//System.out.println(Root.toString());
        /*
        String[] Ls = {"ls", "a"};
        CommandeLs c1 = new CommandeLs(Ls);
        Navigateur nav = new Navigateur(dossier3);
        PasseurDeCommande ps = new PasseurDeCommande();
        c1 = (CommandeLs) ps.parser(Ls);
        c1.executer(nav);
        */
        
        Scanner scanner = new Scanner(System.in);
        Navigateur nav = new Navigateur(Root);
        PasseurDeCommande passeur = new PasseurDeCommande();
        boolean b = true;
        while (b) {
            System.out.print(nav.getRepCourant().getNom() + "> ");
            String[] commande = scanner.nextLine().split(" ");
            Commande cmd = passeur.parser(commande);
            if (cmd != null) {
                cmd.traiter(nav);
            } else {
                System.out.println("Commande non reconnue");
            }
        }
    }
    
}
   
