package exercicio2;

public class Palindromo {
    public boolean isPalindromo(String palavra) {
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = palavraFormatada.length() - 1;

        while (inicio < fim) {
            if (palavraFormatada.charAt(inicio) != palavraFormatada.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
