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
public class Voyage extends Produit {

    private Date date_depart;
    private Date date_arrive;
    private int nbre_personne;
    private String destination;

    public Voyage(String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque, Date date_depart, Date date_arrive, int nbre_personne, String destination) {
        super(ref_produit, titre, categorie, prix_initial, prix_reduction, date_depot, date_expiration, marque);
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.nbre_personne = nbre_personne;
        this.destination = destination;
    }

    public Voyage(Date date_depart, Date date_arrive, int nbre_personne, String destination) {
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
        this.nbre_personne = nbre_personne;
        this.destination = destination;
    }




    public Date getDate_arrive() {
        return date_arrive;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public int getNbre_personne() {
        return nbre_personne;
    }

    public String getDestination() {
        return destination;
    }


    public void setDate_arrive(Date date_arrive) {
        this.date_arrive = date_arrive;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public void setNbre_personne(int nbre_personne) {
        this.nbre_personne = nbre_personne;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }





}
