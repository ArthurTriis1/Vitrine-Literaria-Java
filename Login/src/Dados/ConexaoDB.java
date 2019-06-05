/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class ConexaoDB {

    public static Connection conexaoDB;
    public static Statement statementDB;
    /**
     *
     */
    

    


    /**
     * Conecta a um banco de dados (cria o banco se ele não existir)
     *
     * @return
     */
    public static boolean conectarBD(){
            
               
        try {
            String url = "jdbc:sqlite:BD_biblio/banco_sqlite.db";
            conexaoDB = DriverManager.getConnection(url);
            
                        statementDB = conexaoDB.createStatement();
                        statementDB.execute("CREATE TABLE IF NOT EXISTS LIVROS("+
                                " COD_LIVRO INTEGER,"+
                                " TITULO VARCHAR,"+
                                " AUTOR VARCHAR,"+
                                " EDICAO VARCHAR,"+
                                " ANO INTEGER "+
                                " EDITORA VARCHAR,"+
                                " IMAGEM VARCHAR,"+
                                " QNTDD INTEGER,"+
                                " QNTDD_ALUG INTEGER"+
                                " )");
                        
                        statementDB.execute("INSERT INTO RC_TEST"+
                                            "( ID, NOME)"+
                                            " VALUES "+
                                            "(1, 'Wolmir'), (2, 'Garbin')");
                        
                        System.out.println("conectou!!!");
                        
                        
                        
                       
                         
        
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }
    
     
    
     

    public static boolean desconectarBD() {

        try {
            if (conexaoDB.isClosed() == false) {
                conexaoDB.close();
            }

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("desconectou!!!");
        return true;

    }
    
    
    
}
