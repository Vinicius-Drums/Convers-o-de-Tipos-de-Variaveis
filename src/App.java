public class App {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numeroInteiro = 7;          // Variável do tipo int
        double numeroDouble = 6.34;     // Variável do tipo double

        // Conversão do valor da variável int para double
        double numeroInteiroConvertido = (double) numeroInteiro;

        // Soma dos dois valores
        double resultado = numeroInteiroConvertido + numeroDouble;

        // Imprime o resultado
        System.out.println("Resultado da soma: " + resultado);
    }
}
