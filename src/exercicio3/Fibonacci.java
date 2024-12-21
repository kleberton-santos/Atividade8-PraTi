package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> calcularFibonacci(int n) {
        List<Integer> sequencia = new ArrayList<>();

        if (n <= 0) {
            return sequencia;
        }

        sequencia.add(0);

        if (n > 1) {
            sequencia.add(1);
        }

        for (int i = 2; i < n; i++) {
            int novoNumero = sequencia.get(i - 1) + sequencia.get(i - 2);
            sequencia.add(novoNumero);
        }

        return sequencia;
    }
}
