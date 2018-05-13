/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ContenedorNum;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@ViewScoped
public class ContenedorFormBeans {
    public class ContenedorManagebeans {
   private int n=0;
   private ContenedorNum calculos= new ContenedorNum();
   private int mayor;
   private int menor;
   private double promedio;
   ArrayList<Integer> listaNumeros = new ArrayList<>();
 private int nn;
   
    public ContenedorManagebeans() {
        
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    
    public int getNn() {
        return nn;
    }

    public void setNn(int nn) {
        this.nn = nn;
    }
    
    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
   public ContenedorNum getCalculos() {
        return calculos;
    }
    public void setCalculos(ContenedorNum calculos) {
        this.calculos = calculos;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void calcular(){
      mayor=calculos.calcularMayor(listaNumeros);
      menor=calculos.calcularMenor(listaNumeros);
      promedio=calculos.calcularPromedio(listaNumeros);
    }
    public void registrarNumero(){
      calculos.cargarNumero(n, listaNumeros);
      nn=listaNumeros.size();
      }
  

    }
}
