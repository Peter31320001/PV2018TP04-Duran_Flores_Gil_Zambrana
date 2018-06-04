/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.Auto;
import aplicacion.modelo.ListaAuto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ezequiel
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable{
    private ListaAuto autos;
    private Auto auto;
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String combustible;

    public AutoFormBean(ListaAuto autos, Auto auto, String patente, String marca, String modelo, String color, String combustible) {
        this.autos = autos;
        this.auto = auto;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
    }

    
    /**
     * Creates a new instance of AutoFormBean
     */
    public AutoFormBean() {
        autos = new ListaAuto();
    }
    public void agregarAuto(){
        auto = new Auto(getPatente(),getMarca(),getModelo(),getColor(),getCombustible());
        autos.agregarAutos(auto);
    }
    public void establecerAuto(Auto unAuto){
        setAuto(unAuto);
    }
    public void modificarAuto(){
        autos.modificarAutos(auto);
    }
    public void eliminarAuto(){
        autos.eliminarAutos(auto);
    }

    /**
     * @return the autos
     */
    public ListaAuto getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(ListaAuto autos) {
        this.autos = autos;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
}
