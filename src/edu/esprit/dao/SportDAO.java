/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import edu.esprit.entities.Sport;
import edu.esprit.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Clubiste
 */
public class SportDAO {
    public void insertSport(Sport s) throws ParseException{
        String requete = "insert into Produit (ref_produit,titre,categorie,prix_initial,prix_reduction,marque,date_depot,date_expiration,type_sport,nbre_seance,adresse_sport) values (?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getRef_produit());
            ps.setString(2, s.getTitre());
            ps.setString(3, "Sport");
            ps.setFloat(4, s.getPrix_initial());
            ps.setFloat(5, s.getPrix_reduction());
            ps.setString(6, s.getMarque());
            
            
            
          
           ps.setString(7, s.getDate_depot());
           
           ps.setString(8, s.getDate_expiration());


            ps.setString(9,s.getType_sport());
            ps.setInt(10, s.getNbre_sceance());
            ps.setString(11, s.getAdresse_sport());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    public void updateSport(Sport s){
        String requete = "update Produit set ref_produit=?, titre=?,marque=?, prix_initial=?,prix_reduction=?,date_depot=?,date_expiration=?,type_sport=?,nbre_seance=?,adresse_sport=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, s.getRef_produit());
            ps.setString(2, s.getTitre());
            ps.setString(3, s.getMarque());
            ps.setFloat(4, s.getPrix_initial());
            ps.setFloat(5,s.getPrix_reduction());
            
            ps.setString(6, s.getDate_depot());
            ps.setString(7,s.getDate_expiration());
            ps.setString(8,s.getType_sport());
            ps.setInt(9, s.getNbre_sceance());
            ps.setString(10, s.getAdresse_sport());

                    
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
    
    
  

}
