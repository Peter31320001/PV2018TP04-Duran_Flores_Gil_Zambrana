/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Numero implements Serializable{
    private ArrayList<Integer> numeros;

    public Numero(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
    
    public Numero() {
        numeros=new ArrayList();
    }

    public void agregarNumeros(int unNumero){
        getNumeros().add(unNumero);
    }

    /**
     * @return the numeros
     */
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }
}