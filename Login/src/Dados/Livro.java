/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author arthu
 */
public class Livro {
    
    private String autor;
    private String titulo;
    private String edição;
    private String ano;
    private String editora;
    private int qntdd;
    private int qntdd_aluga;
    private int cod_livro;
    private String capa;

    public Livro(String autor, String titulo, String edição, String ano, String editora, int qntdd, int qntdd_aluga, int cod_livro, String capa) {
        this.autor = autor;
        this.titulo = titulo;
        this.edição = edição;
        this.ano = ano;
        this.editora = editora;
        this.qntdd = qntdd;
        this.qntdd_aluga = qntdd_aluga;
        this.cod_livro = cod_livro;
        this.capa = capa;
    }

    

    
    
    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    
    public String getEdição() {
        return edição;
    }

    public void setEdição(String edição) {
        this.edição = edição;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQntdd() {
        return qntdd;
    }

    public void setQntdd(int qntdd) {
        this.qntdd = qntdd;
    }

    public int getQntdd_aluga() {
        return qntdd_aluga;
    }

    public void setQntdd_aluga(int qntdd_aluga) {
        this.qntdd_aluga = qntdd_aluga;
    }

    

    

    @Override
    public String toString() {
        return " " + autor + "\n " + titulo;
    }
    
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
    
    
    
}
