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

    public PasseurDeCommande() {
        
    }

    public Commande parser(String[] mots) { // Pour connaitre la commande et savoir quoi faire
        String nom = mots[0];
        String[] argument = { };
        System.arraycopy(mots, 1, argument, 0, 0);
        
        return switch (nom) {
            case "ls" ->
                new CommandeLs(argument);
            case "cd" ->
                new CommandeCD(argument);
            case "mkdir" ->
                new CommandeMkdir(argument);
            default ->
                null;
        };
    }

}
