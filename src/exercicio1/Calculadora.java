package exercicio1;

public class Calculadora {
    public double calcular(double numero1, double numero2, char operador) throws IllegalArgumentException {
        switch (operador) {
            case '+':
                return numero1 + numero2;
            case '-':
                return numero1 - numero2;
            case '*':
                return numero1 * numero2;
            case '/':
                if (numero2 == 0) {
                    throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
                }
                return numero1 / numero2;
            default:
                throw new IllegalArgumentException("Erro: Operador inválido.");
        }
    }
}
