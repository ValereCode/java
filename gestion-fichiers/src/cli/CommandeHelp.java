/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

/**
 *
 * @author setodji
 */
public class CommandeHelp extends Commande{

    public CommandeHelp(String[] arguments) {
        super(arguments);
    }

    @Override
    public void executer(Navigateur nav) {
        System.out.println("\tls <nom_de_repertoire> : liste le contenu d’un répertoire. Si aucun répertoire\n" +
"n’est précisé, le contenu du répertoire courant est listé.\n");
        System.out.println("\tcd " +
"<nom_de repertoire> : remplace le répertoire courant par son parent\n" +
"direct.\n");
        System.out.println("\tmkdir <nom_de_repertoire> : crée un répertoire du nom spécifié dans le\n" +
"répertoire courant.\n");
        System.out.println("\ttouch <nom_de_fichier_simple> : crée un fichier du nom spécifié dans le\n" +
"répertoire courant\n");
        System.out.println("\trm <nom_de_fichier> : supprime le fichier ou le répertoire du nom spécifié.\n");
        System.out.println("\tmv <ancien_nom_de_fichier> <nouveau_nom_de_fichier> : renomme le\n" +
"fichier ou le répertoire au nom spécifié.\n");
        System.out.println("\tq : arrête l’exécution du programme.\n");
        System.out.println("\thelp : affiche l’aide.\n");
        System.out.println("\tlr : donne un aperçu global et visuel de tout le système de fichier.\n");
    }
    
    
}
