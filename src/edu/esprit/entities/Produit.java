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
public class Produit {

    protected String ref_produit;
    protected String titre;
    protected String categorie;
    protected Float prix_initial;
    protected Float prix_reduction;
    protected String date_depot;
    protected String date_expiration;
    protected String marque;

    public Produit() {
    }

    public Produit(String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque) {
        this.ref_produit = ref_produit;
        this.titre = titre;
        this.categorie = categorie;
        this.prix_initial = prix_initial;
        this.prix_reduction = prix_reduction;
        this.date_depot = date_depot;
        this.date_expiration = date_expiration;
        this.marque = marque;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDate_depot() {
        return date_depot;
    }

    public String getDate_expiration() {
        return date_expiration;
    }

    public String getMarque() {
        return marque;
    }

    public Float getPrix_initial() {
        return prix_initial;
    }

    public Float getPrix_reduction() {
        return prix_reduction;
    }

    public String getRef_produit() {
        return ref_produit;
    }

    public String getTitre() {
        return titre;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDate_depot(String date_depot) {
        this.date_depot = date_depot;
    }

    public void setDate_expiration(String date_expiration) {
        this.date_expiration = date_expiration;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix_initial(Float prix_initial) {
        this.prix_initial = prix_initial;
    }

    public void setPrix_reduction(Float prix_reduction) {
        this.prix_reduction = prix_reduction;
    }

    public void setRef_produit(String ref_produit) {
        this.ref_produit = ref_produit;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }



}
   
   