/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Autor;
import modelo.Libro;
import modelo.ListaLibro;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@RequestScoped
public class LibrosFormBeans {
    private Libro unLibro;
    private ListaLibro listaLibro;
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private ArrayList <Autor> auto;
    private String unAutor;
    
       public LibrosFormBeans() {
        listaLibro =new ListaLibro();
    }

    public LibrosFormBeans(Libro unLibro, ListaLibro listaLibro, String isbn, String titulo, String autor, double precio ) {
        this.unLibro = unLibro;
        this.listaLibro = listaLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;      
    }
       
       public void registrarLibro(){
        setUnLibro(new Libro(getIsbn(),getTitulo(),getAutor(),getPrecio()));
        setUnLibro(new Libro(getIsbn(),getTitulo(),getUnAutor(),getPrecio()));
         getListaLibro().getListadoLibro().add(getUnLibro());
     }
   
     public Libro crearLibro(String isbnn,String tit,String aut, double pre){
         Libro libro =new Libro();
         libro.setIsbn(isbnn);
         libro.setTitulo(tit);
         libro.setAutor(aut);
         libro.setPrecio(pre);
         return libro;
     }
     public void agregarLibro (){
         Scanner sc=new Scanner(System.in);
         String isbnn,tit,aut;
         double pre;
         int num;
         System.out.println("Ingrese ISBN");
         isbnn=sc.next();
         System.out.println("Ingrese Titulo");
         tit=sc.next();
         System.out.println("Ingrese Autor");
         aut=sc.next();
         System.out.println("Ingrese Precio");
         pre=sc.nextDouble();
         listaLibro.getListadoLibro().add(crearLibro(isbnn,tit,aut,pre));
     }

    /**
     *
     */
    public LibrosFormBean(){
         setListaLibro(new ListaLibro());
        auto=new ArrayList();
        auto.add(new Autor("12355555","Santi","Xanax"));
        auto.add(new Autor("99996993","Cheya","Topo"));
        auto.add(new Autor("22223333","Papi","Flores"));
        auto.add(new Autor("77777755","Joshua","Wall"));
       
     }
    /**
     * Creates a new instance of LibrosFormBeans
     */
 

    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the listaLibro
     */
    public ListaLibro getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibro listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the unAutor
     */
    public String getUnAutor() {
        return unAutor;
    }

    /**
     * @param unAutor the unAutor to set
     */
    public void setUnAutor(String unAutor) {
        this.unAutor = unAutor;
    }
    
}
