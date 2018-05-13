/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable {
    private double temperatura;
    private char tipo;
    private double temperaturaConvertida;

    /**
    * Creates a new instance of TemperaturaFormBean
    */
        
    public TemperaturaFormBean() {
        temperatura = 0;
        tipo = '\u0000';
        temperaturaConvertida = 0;
    }

    public void convertirFarenheit() {
        switch (getTipo()) {
            case 'c':
                setTemperaturaConvertida((getTemperatura() * 1.8) + 32);
                break;
            case 'f':
                setTemperaturaConvertida(getTemperatura());
                break;
            case 'k':
                setTemperaturaConvertida((getTemperatura() * 1.8) - 459.67);
                break;
            }
	}

    public void convertirCelcius() {
        switch (getTipo()) {
            case 'c':
		setTemperaturaConvertida(getTemperatura());
		break;
            case 'f':
		setTemperaturaConvertida((getTemperatura() - 32) / 1.8);
		break;
            case 'k':
		setTemperaturaConvertida(getTemperatura() - 273.15);
		break;
            }
    }

    public void convertirKelvin() {
	switch (getTipo()) {
            case 'c':
		setTemperaturaConvertida(getTemperatura() + 273.15);
		break;
            case 'f':
		setTemperaturaConvertida((getTemperatura() + 459.67) / 1.8);
		break;
            case 'k':
		setTemperaturaConvertida(getTemperatura());
		break;
	}
    }

    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the temperaturaConvertida
     */
    public double getTemperaturaConvertida() {
        return temperaturaConvertida;
    }

    /**
     * @param temperaturaConvertida the temperaturaConvertida to set
     */
    public void setTemperaturaConvertida(double temperaturaConvertida) {
        this.temperaturaConvertida = temperaturaConvertida;
    }

}
