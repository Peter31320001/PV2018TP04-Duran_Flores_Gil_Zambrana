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
public class ContenedorNum {
    public class ContenedorNumero {
    private int numero;
    private int menor;
    private int mayor;
    
    public ContenedorNumero() {
    }

    public ContenedorNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

 
    
    public void cargarNumero(int n , ArrayList<Integer> lista){
       this.numero=n;
       lista.add(numero);
       
    }
    public int calcularMenor(ArrayList<Integer> lista){
      menor=lista.get(0);
      for(int i : lista)
      {
          if(i<menor)
          menor=i;
      }
    return menor;
    }
    public int calcularMayor(ArrayList<Integer> lista){
     mayor=lista.get(0);
     for(int i : lista)
      {
       if(i>mayor)
        mayor=i;
             
      }
      return mayor;
    }
    public double calcularPromedio(ArrayList<Integer> lista){
      
      int suma=0;
      for(int i : lista)
      {
        suma=suma+i;
      }
      return suma/lista.size();
    }
    
}
    
}
