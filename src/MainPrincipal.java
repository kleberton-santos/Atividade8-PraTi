import exercicio1.Main1;
import exercicio2.Main2;
import exercicio3.Main3;
import exercicio4.Main4;
import exercicio5.Main5;
import exercicio6.Main6;
import exercicio7.Main7;

import java.util.Scanner;

public class MainPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu de Exercícios:");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Main1.main(args);
                    break;
                case 2:
                    Main2.main(args);
                    break;
                case 3:
                    Main3.main(args);
                    break;
                case 4:
                    Main4.main(args);
                    break;
                case 5:
                    Main5.main(args);
                    break;
                case 6:
                    Main6.main(args);
                    break;
                case 7:
                    Main7.main(args);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
