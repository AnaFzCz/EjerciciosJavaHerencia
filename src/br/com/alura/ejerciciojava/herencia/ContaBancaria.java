package br.com.alura.ejerciciojava.herencia;

//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancaria {

    private String nombre;
    private int cuenta;
    protected double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito >= 0) {
            this.saldo += valorDeposito;
            System.out.println("Transacción DEPOSITO de un valor R$" + valorDeposito);
            System.out.println("Saldo Final: R$" + getSaldo());
        } else {
            System.out.println("Ingrese un valor válido");
        }
    }

    public void sacar(double valorExtraer) {
        if (valorExtraer <= this.saldo) {
            this.saldo -= valorExtraer;
            System.out.println("Transacción TRANSFERENCIA de un valor R$" + valorExtraer);
            System.out.println("Saldo Final: R$"+ getSaldo());
        }
       else{
            System.out.println("La operación no puede ser realizada, verifique su saldo");
        }
    }


    public void consultarSaldo() {
        System.out.println("Cliente: "+ this.getNombre());
        System.out.println("Cuenta corriente: " + this.getCuenta());
        System.out.println("Saldo Actual: R$" + this.getSaldo());

    }


}
