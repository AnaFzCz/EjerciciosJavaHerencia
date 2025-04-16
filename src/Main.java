import br.com.alura.ejerciciojava.herencia.*;
import br.com.alura.ejerciciojava.herencia.ContaBancaria;
import br.com.alura.ejerciciojava.herencia.ContaCorrente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /// //////////////1

        System.out.println("Ejercicio 1");
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el Modelo: ");
        String modelo = scanner.nextLine();

        carro.obtenerModelo(modelo);
        System.out.println("Ingresa los 3 precios que consideres relevantes: ");
        double precio1 = scanner.nextDouble();
        double precio2 = scanner.nextDouble();
        double precio3 = scanner.nextDouble();
        carro.obtenerPrecios(precio1, precio2, precio3);
        carro.obtenerPrecioMenor();
        carro.obtenerPrecioMayor();

        ModeloCarro modeloCarro = new ModeloCarro();
/// //////////////2
        System.out.println("\nEjercicio 2");
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

//////////////////3
        System.out.println("\nEjercicio 3");
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaCorrente contaCorrente = new ContaCorrente();
        contaBancaria.setNombre("Ana Fernandez");
        contaBancaria.setCuenta(963939658);
        contaBancaria.setSaldo(1200.45);

        contaBancaria.consultarSaldo();
        contaBancaria.depositar(2000);
        contaBancaria.sacar(1000);

        contaCorrente.setNombre("Erick Vasquez");
        contaCorrente.depositar(1000);
        contaCorrente.sacar(20);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
/// ///////4

        System.out.println("\nEjercicio 4");
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeneradorPrimos gerador = new GeneradorPrimos();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(40);


    }
}