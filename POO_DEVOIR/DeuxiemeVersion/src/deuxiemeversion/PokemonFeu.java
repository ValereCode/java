/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deuxiemeversion;

/**
 *
 * @author setodji
 */
public class PokemonFeu extends Pokemon{ //J' ai fais une héritage
   
    /**
     * Deuxieme Version
     * Utilisation de polymorphisme et surcharge
     * Décrivons sa manière d'attaquer : 
     * 
     */ 
    
    @Override
    public void attaquer(Pokemon p){
        p.hp -= this.atk; // Attaque normal
    }
    
    public void attaquer(PokemonEau p){
        p.hp -= this.atk * 0.5;  // Peu efficace
    }
    
    public void attaquer(PokemonPlante p){
        p.hp -= this.atk * 2; // Deux fois plus de dégats
    }
    public void attaquer(PokemonFeu p){
        p.hp -= this.atk * 0.5;  // Peu efficace
    }
    
    
}
