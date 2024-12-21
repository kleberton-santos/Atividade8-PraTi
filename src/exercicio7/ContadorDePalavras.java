package exercicio7;

public class ContadorDePalavras {
    public int contarPalavras(String frase) {

        frase = frase.trim();

        if (frase.isEmpty()) {
            return 0;
        }

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
