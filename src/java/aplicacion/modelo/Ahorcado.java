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
 * @author PC-Gamer
 */

public class Ahorcado implements Serializable{
    private String palabraAdivinar;
    private char[] palabraAhorcado;
    private int intentos;
    private String imagen;

    public Ahorcado() {
        palabraAdivinar = new String();
        palabraAhorcado = new char[10];
        intentos = 5;
    }
    public void empezarJuego(String palabra){
        setPalabraAdivinar(palabra);
    }
    public ArrayList<String> getPalabraAhorcadoFormato(){
        ArrayList<String> caracteresPalabra = new ArrayList();
        for (int i=0;i<getPalabraAdivinar().length();i++){
            caracteresPalabra.add(String.valueOf(getPalabraAhorcado()[i]));
            
        }
        return caracteresPalabra;
    }
    public boolean buscarLetra(char c){
        boolean encontrado = false;
        for(int i =0;i<getPalabraAdivinar().length();i++){
            if(c==getPalabraAdivinar().charAt(i)){
                encontrado=true;
                palabraAhorcado[i]=c; 
            }   
        }
        if(encontrado==false){
            setIntentos(getIntentos()-1);
            switch(getIntentos()){
                case 5: setImagen("/images/a.png");
                    break;
                case 4: setImagen("/images/a1.png");
                    break;
                case 3: setImagen("/images/a2.png");
                    break;
                case 2: setImagen("/images/a3.png");
                    break;
                case 1: setImagen("/images/a4.png");
                    break;
                case 0: setImagen("/images/a5.png");
                    break;
                default: break;
            }
        }

        return encontrado;
    }
    public boolean juegoGanado(){
        boolean ganador=true;
        for(int i=0;i<getPalabraAdivinar().length();i++){
            if(getPalabraAdivinar().charAt(i)!= palabraAhorcado[i]){
                ganador=false;
            }
        }
        return ganador;
    }
    
    public Ahorcado(String palabraAdivinar, char[] palabraAhorcado, int intentos) {
        this.palabraAdivinar = palabraAdivinar;
        this.palabraAhorcado = palabraAhorcado;
        this.intentos = intentos;
    }
    
    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
