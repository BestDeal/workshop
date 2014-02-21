/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

import java.util.Date;

/**
 *
 * @author djosefils
 */
public class Restaurant extends Produit{

    private int nbre_fourchete;
    private String menu;

    public Restaurant(String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque, int nbre_fourchete, String menu) {
        super(ref_produit, titre, categorie, prix_initial, prix_reduction, date_depot, date_expiration, marque);
        this.nbre_fourchete = nbre_fourchete;
        this.menu = menu;
    }

    public Restaurant(int nbre_fourchete, String menu) {
        this.nbre_fourchete = nbre_fourchete;
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public int getNbre_fourchete() {
        return nbre_fourchete;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setNbre_fourchete(int nbre_fourchete) {
        this.nbre_fourchete = nbre_fourchete;
    }





}
