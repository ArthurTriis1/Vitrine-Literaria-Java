/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author arthu
 */
public class Dados {
    
    public static String login = "padrão";
    private static int cod_livro_select;

  
    private static ObservableList allBookList = FXCollections.observableArrayList();

    public static ObservableList getObooklist() {
        
        allBookList.clear();
        allBookList.add(new Livro("Jordan Helps" , "Pequeno Principe", "2", "2000", "intrinsica", 13, 5,1, "capa1"));
        allBookList.add(new Livro("Stephen King" , "A incendiaria", "3", "2001", "C&A das letras", 78, 5,2,"capa2"));
        allBookList.add(new Livro("Eric Ries" , "O estilo startup", "4", "2002", "Panini", 5, 1,3,"capa3"));
        allBookList.add(new Livro("Michael Phelps" , "Mafalda", "5", "2003", "GloboLivros", 10, 5,4,"capa4"));
        
        return allBookList;
    }

    public static void setObooklist(ObservableList Obooklist) {
        Dados.allBookList = Obooklist;
    }

      public static int getCod_livro_select() {
        return cod_livro_select;
    }

    public static void setCod_livro_select(int cod_livro_select) {
        Dados.cod_livro_select = cod_livro_select;
    }
    
    
    
    
}
