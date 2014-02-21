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
public class Sport extends Produit{

    public Sport() {
    }

    private String type_sport;
    private int nbre_sceance;
    private String adresse_sport;

    public Sport(String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque, String type_sport, int nbre_sceance, String adresse_sport) {
        super(ref_produit, titre, categorie, prix_initial, prix_reduction, date_depot, date_expiration, marque);
        this.type_sport = type_sport;
        this.nbre_sceance = nbre_sceance;
        this.adresse_sport = adresse_sport;
    }

    public Sport(String type_sport, int nbre_sceance, String adresse_sport) {
        this.type_sport = type_sport;
        this.nbre_sceance = nbre_sceance;
        this.adresse_sport = adresse_sport;
    }

    public String getAdresse_sport() {
        return adresse_sport;
    }

    public int getNbre_sceance() {
        return nbre_sceance;
    }

    public String getType_sport() {
        return type_sport;
    }

    public void setAdresse_sport(String adresse_sport) {
        this.adresse_sport = adresse_sport;
    }

    public void setNbre_sceance(int nbre_sceance) {
        this.nbre_sceance = nbre_sceance;
    }

    public void setType_sport(String type_sport) {
        this.type_sport = type_sport;
    }





}
