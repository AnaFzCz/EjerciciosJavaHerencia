package br.com.alura.ejerciciojava.herencia;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
//        super.emitirSom();
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("El gatito araña los muebles");

    }
}
