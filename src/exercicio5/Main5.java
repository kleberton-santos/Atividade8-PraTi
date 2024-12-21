package exercicio5;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anagrama checker = new Anagrama();

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        boolean resultado = checker.saoAnagramas(palavra1, palavra2);

        if (resultado) {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são anagramas.");
        } else {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são anagramas.");
        }

    }
}
