package br.com.alura.ejerciciojava.herencia;
public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal=2;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
