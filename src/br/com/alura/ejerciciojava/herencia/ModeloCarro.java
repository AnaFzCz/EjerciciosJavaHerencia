package br.com.alura.ejerciciojava.herencia;

import br.com.alura.ejerciciojava.herencia.Carro;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ModeloCarro extends Carro {
    private double precioFinal;
    private double descuento = 10;

    public double getPrecioFinal() {
        return precioFinal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }



}
