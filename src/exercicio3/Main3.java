package exercicio3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci calculator = new Fibonacci();

        System.out.print("Digite a quantidade de números da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
            System.out.println(calculator.calcularFibonacci(n));
        }
    }
}
