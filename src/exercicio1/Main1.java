package exercicio1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Executando exercício 1...");
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        try {

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.next().charAt(0);

            double resultado = calculadora.calcular(numero1, numero2, operador);

            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}
