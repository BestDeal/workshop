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
public class ProduitDeBeaute extends Produit{
private String sexe;
private String couleur;
private String taille;

    public ProduitDeBeaute(String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque, String sexe, String couleur, String taille) {
        super(ref_produit, titre, categorie, prix_initial, prix_reduction, date_depot, date_expiration, marque);
        this.sexe = sexe;
        this.couleur = couleur;
        this.taille = taille;
    }

    public ProduitDeBeaute(String sexe, String couleur, String taille) {
        this.sexe = sexe;
        this.couleur = couleur;
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getSexe() {
        return sexe;
    }

    public String getTaille() {
        return taille;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }



}
