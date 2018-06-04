/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.modelo.Libro;
import aplicacion.modelo.Autor;
import aplicacion.modelo.ListaLibro;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */

@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro libro;
    private ListaLibro listaLibro;
    private int isbn;
    private String tit;
    private double pre;
    private ArrayList<Autor> aut;
    private String unAutor;
    
    public void registrarLibro(){
        setLibro(new Libro(getIsbn(),getTit(),getUnAutor(),getPre()));
        getListaLibro().getListadoLibro().add(getLibro());
    }
    
    /**
     * Creates a new instance of LibroBean
     */
    public LibroFormBean() {
        listaLibro=new ListaLibro();
        aut=new ArrayList();
        aut.add(new Autor("45675674","Luciano","Ayala"));
        aut.add(new Autor("42324232","Papi","Funes"));
        aut.add(new Autor("42378964","Benja","Flores"));
        aut.add(new Autor("42910280","Petusi","Emci"));
        aut.add(new Autor("42569032","Demente","Parker"));
    }

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
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
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the tit
     */
    public String getTit() {
        return tit;
    }

    /**
     * @param tit the tit to set
     */
    public void setTit(String tit) {
        this.tit = tit;
    }

    /**
     * @return the pre
     */
    public double getPre() {
        return pre;
    }

    /**
     * @param pre the pre to set
     */
    public void setPre(double pre) {
        this.pre = pre;
    }

    /**
     * @return the aut
     */
    public ArrayList<Autor> getAut() {
        return aut;
    }

    /**
     * @param aut the aut to set
     */
    public void setAut(ArrayList<Autor> aut) {
        this.aut = aut;
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
