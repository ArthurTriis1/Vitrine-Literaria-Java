/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import static Dados.ConexaoDB.conectarBD;
import static Dados.ConexaoDB.conexaoDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author arthu
 */
public class NewClass {
    
    
     public static void main(String[] args) {
        
         
          conectarBD();
          
          
          
           
         try {
             PreparedStatement stmt;
             stmt = conexaoDB.prepareStatement("select * from RC_TEST");
                  ResultSet resultSet = stmt.executeQuery();
                         while (resultSet.next()) {
                             Integer id = resultSet.getInt("ID");
                             String nome = resultSet.getString("NOME");

                             System.out.println( id + " - " + nome);
                         }
         } catch (SQLException ex) {
             Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
         }
                    

     }
     
}
