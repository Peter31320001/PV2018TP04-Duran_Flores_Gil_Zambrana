/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Judith Aldonate
 */
public class ListaLibro {
    private ArrayList <Libro> listadoLibro;

    public ListaLibro() {
        listadoLibro=new ArrayList();
    }


    public ArrayList <Libro> getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ArrayList <Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }
    

    
}
