/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.dao;


import edu.esprit.entities.ProduitDeBeaute;
import edu.esprit.util.MyConnection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;



/**
 *
 * @author djosefils
 */
public class ProduitDeBeauteDAO {

      public void insertStock(ProduitDeBeaute pdb){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into produit (ref_produit,titre,catgorie,prix_initiale,prix_reduction,date_depot,date-expiration,marque,sexe,couleur,taille) values (?,?,?,?,?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, pdb.getRef_produit());
            ps.setString(2, pdb.getTitre());

            ps.setString(3,pdb.getCategorie() );
            ps.setFloat(4,pdb.getPrix_initial() );
            ps.setFloat(5,pdb.getPrix_reduction() );
              ps.setString(6,pdb.getMarque());
            ps.setString(7, pdb.getDate_depot());
            ps.setString(8, pdb.getDate_expiration());

             ps.setString(19,pdb.getSexe());
             ps.setString(20,pdb.getCouleur());
             ps.setString(21,pdb.getTaille());/// a reeeevoirrr
              ps.executeUpdate();



            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


}
