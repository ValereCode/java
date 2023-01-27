/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;


/**
 *
 * @author setodji
 */
public class PasseurDeCommande {

    public Commande parser(String[] mots) { // Pour connaitre la commande et savoir quoi faire
        String nom = mots[0];
        String[] argument = new String[mots.length - 1];
        System.arraycopy(mots, 1, argument, 0, mots.length-1);

        return switch (nom) {
            case "ls" ->
                new CommandeLs(argument);
            case "cd" ->
                new CommandeCd(argument);
            case "mkdir" ->
                new CommandeMkdir(argument);
            case "touch" ->
                new CommandeTouch(argument);
            case "rm" ->
                new CommandeRm(argument);
            case "lr" ->
                new CommandeLr(argument);
            case "mv" ->
                new CommandeMv(argument);
            case "q" ->
                new CommandeQ(argument);
            case "cd2" ->
                new CommandeCd2(argument);
            case "touch2" ->
                new CommandeTouch2(argument);
            case "help" ->
                new CommandeHelp(argument);
            default ->
                new CommandeAide(argument);
        };
    }
    
    public Commande parser( String chaine){
        return parser(chaine.split(" "));
    }

}
