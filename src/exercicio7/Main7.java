package exercicio7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContadorDePalavras contador = new ContadorDePalavras();

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroDePalavras = contador.contarPalavras(frase);
        System.out.println("A frase contém " + numeroDePalavras + " palavras.");

    }
}
