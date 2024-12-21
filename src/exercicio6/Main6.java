package exercicio6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoAdivinhacao jogo = new JogoAdivinhacao();

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 50.");

        boolean acertou = false;
        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (jogo.verificarPalpite(palpite)) {
                System.out.println("Parabéns! Você adivinhou o número secreto: " + jogo.getNumeroSecreto());
                acertou = true;
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }

    }
}
