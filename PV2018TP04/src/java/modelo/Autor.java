/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@RequestScoped
public class Autor {
    private String dni;
    private String nombre;
    private String apellido;
    /**
     * Creates a new instance of Autor
     */
    public Autor() {
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof Autor)&&(dni != null)? dni.equals(((Autor)other).dni):(other==this); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return (dni != null)?(this.getClass().hashCode()+dni.hashCode()):super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("Autor:[%s,%s]",apellido,nombre); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public Autor(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    
    
}
