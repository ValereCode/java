/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deuxiemeversion;

/**
 *
 * @author setodji
 */
public class Pokemon {
    // Les attributs de la classe Pockemon
    protected String nom;
    protected double hp;
    protected double atk;
    
    // Les constructeurs de notre classe
    
    public Pokemon(){/**Constructeur par défaut**/
    }

    public Pokemon(String nom, double hp, double atk) {
        /**Constructeur d'initialisation**/
        this.nom= nom;
        this.hp= hp;
        this.atk= atk;
    }
    
    public Pokemon(Pokemon p) {
        /**Constructeur par recopie**/
        this.nom= p.nom;
        this.hp= p.hp;
        this.atk= p.atk;
    }
    
    // L'ajout des getteurs
    public String getNom() {
        return nom;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }
    
    // Méthode qui vérifie si le pokemon est mort ou pas
    public boolean isDead() {
        return hp == 0; // En fait la condition hp == 0 donne un booléen
    }
    
    /** 
    Méthode qui au pokemon appelant(notre pokemon) 
    d'attaquer le pokemon en paramettre
    */
    public void attaquer(Pokemon p) {
        p.hp -= this.atk;  // On soustrait le hp du pokemon passer en parametre
    }
    
    // La methode qui affiche les informations du pokemon
    public void afficher() {
        System.out.println("Pokemon { Nom = " + this.nom + " helth poin(hp) = " + this.hp + " force d'attaque(atk) = " + this.atk);
    }
}
