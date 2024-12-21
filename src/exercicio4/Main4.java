package exercicio4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroInversor inversor = new NumeroInversor();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int numeroInvertido = inversor.inverterNumero(numero);
        System.out.println("O número invertido é: " + numeroInvertido);

    }
}
