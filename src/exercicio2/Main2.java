package exercicio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Palindromo checker = new Palindromo();

            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            boolean ehPalindromo = checker.isPalindromo(palavra);

            if (ehPalindromo) {
                System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
            } else {
                System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
            }

        }

}
