package br.com.alura.ejerciciojava.herencia;

import java.security.spec.RSAOtherPrimeInfo;

public class Cachorro extends Animal {


    @Override
    public void emitirSom() {
//        super.emitirSom();
        System.out.println("Guau");
    }
    public void abanarRabo(){
        System.out.println("El cachorro mueve la colita");
    }
}
