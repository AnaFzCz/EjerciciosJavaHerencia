package br.com.alura.ejerciciojava.herencia;

public class Carro {
    private String modelo;
    private int ano;
    private double precioProm1;
    private double precioProm2;
    private double precioProm3;
    private double precioFinal;

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecioProm1() {
        return precioProm1;
    }

    public void setPrecioProm1(double precioProm1) {
        this.precioProm1 = precioProm1;
    }

    public double getPrecioProm2() {
        return precioProm2;
    }

    public void setPrecioProm2(double precioProm2) {
        this.precioProm2 = precioProm2;
    }

    public double getPrecioProm3() {
        return precioProm3;
    }

    public void setPrecioProm3(double precioProm3) {
        this.precioProm3 = precioProm3;
    }

    public void obtenerModelo(String modelo) {
        this.setModelo(modelo);
        System.out.println("Modelo: " + getModelo());
    }

    public void obtenerPrecios(double precio1, double precio2, double precio3) {
        this.setPrecioProm1(precio1);
        this.setPrecioProm2(precio2);
        this.setPrecioProm3(precio3);
        System.out.println("Los precios indicados son los siguientes: ");
        System.out.println("Año 1 precio R$: " + getPrecioProm1());
        System.out.println("Año 2 precio R$: " + getPrecioProm2());
        System.out.println("Año 3 precio R$: " + getPrecioProm3());
    }

    public void obtenerPrecioMenor() {
        if (this.precioProm1 < this.precioProm2 && this.precioProm1 < this.precioProm3) {
            System.out.println("El menor precio es la opción 1");
           System.out.println(getPrecioProm1());
        } else if (this.precioProm2 < this.precioProm1 && this.precioProm2 < this.precioProm3) {
            System.out.println("El menor precio es la opción 2");
            System.out.println(getPrecioProm2());
        } else if (this.precioProm3 < this.precioProm1 && this.precioProm3 < this.precioProm2) {
            System.out.println("El menor precio es la opción 3");
            System.out.println(getPrecioProm3());
        }
    }

    public void obtenerPrecioMayor() {
        if (this.precioProm1 > this.precioProm2 && this.precioProm1 > this.precioProm3) {
            System.out.println("El mayor precio es la opción 1");
            System.out.println(getPrecioProm1());
        } else if (this.precioProm2 > this.precioProm1 && this.precioProm2 > this.precioProm3) {
            System.out.println("El mayor precio es la opción 2");
            System.out.println(getPrecioProm2());
        } else if (this.precioProm3 > this.precioProm1 && this.precioProm3 > this.precioProm2) {
            System.out.println("El mayor precio es la opción 3");
            System.out.println(getPrecioProm3());
        }
    }



}
