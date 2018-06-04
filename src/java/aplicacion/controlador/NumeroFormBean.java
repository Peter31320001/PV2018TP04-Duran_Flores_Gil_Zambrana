/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Numero;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private Numero numero;
    private int num;
    private boolean deshabilitador;

    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numero=new Numero();
        deshabilitador=true;
    }
    
    public void ingresarNumero(){
        setDeshabilitador(false);
        getNumero().agregarNumeros(getNum());
    }
    
    public void limpiar(){
        numero=new Numero();
        setDeshabilitador(true);
    }

    /**
     * @return the numero
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    /**
     * @return the deshabilitador
     */
    public boolean isDeshabilitador() {
        return deshabilitador;
    }

    /**
     * @param deshabilitador the deshabilitador to set
     */
    public void setDeshabilitador(boolean deshabilitador) {
        this.deshabilitador = deshabilitador;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    
}
