package exercicio6;

import java.util.Random;

public class JogoAdivinhacao {
    private int numeroSecreto;

    public JogoAdivinhacao() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(50) + 1;
    }

    public boolean verificarPalpite(int palpite) {
        return palpite == numeroSecreto;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}
