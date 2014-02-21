/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.entities;

/**
 *
 * @author djosefils
 */
public class Hotel extends Produit {

    @Override
    public String toString() {
        return super.toString()+"Hotel{" + "nbre_jour=" + nbre_jour + ", pension=" + pension + ", type_chambre=" + type_chambre + ", nbre_etoile=" + nbre_etoile + '}';
    }

    public int getNbre_jour() {
        return nbre_jour;
    }

    public void setNbre_jour(int nbre_jour) {
        this.nbre_jour = nbre_jour;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getType_chambre() {
        return type_chambre;
    }

    public void setType_chambre(String type_chambre) {
        this.type_chambre = type_chambre;
    }

    public int getNbre_etoile() {
        return nbre_etoile;
    }

    public void setNbre_etoile(int nbre_etoile) {
        this.nbre_etoile = nbre_etoile;
    }

    public Hotel() {
    }

    public Hotel(int nbre_jour, String pension, String type_chambre, int nbre_etoile, String ref_produit, String titre, String categorie, Float prix_initial, Float prix_reduction, String date_depot, String date_expiration, String marque) {
        super(ref_produit, titre, categorie, prix_initial, prix_reduction, date_depot, date_expiration, marque);
        this.nbre_jour = nbre_jour;
        this.pension = pension;
        this.type_chambre = type_chambre;
        this.nbre_etoile = nbre_etoile;
    }

    
    private int nbre_jour;
    private String   pension;
    private String  type_chambre;
    private int nbre_etoile;



}
