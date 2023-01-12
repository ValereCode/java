/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli;

import metier.Repertoire;

/**
 *
 * @author setodji
 */
public class Navigateur {

    private Repertoire repCourant;

    public Navigateur(Repertoire repCourant) {
        this.repCourant = repCourant;
    }

    public Repertoire getRepCourant() {
        return repCourant;
    }

    public void setRepCourant(Repertoire repCourant) {
        this.repCourant = repCourant;
    }

}
