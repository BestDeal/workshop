/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.util;

import java.util.Date;

/**
 *
 * @author djosefils
 */
public class testConnexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyConnection.getInstance();



       Date date = new Date();

       // display time and date using toString()
       System.out.println(date.toString());

     
        
        // TODO code application logic here
    }

}
