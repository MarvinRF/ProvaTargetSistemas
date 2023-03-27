package questão04;

public class Main {

	public static void main(String[] args) {
        double faturamentoTotal = 0.0;
        double[] faturamentoEstados = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        
        // calcula o faturamento total
        for (double faturamento : faturamentoEstados) {
            faturamentoTotal += faturamento;
        }
        
        // imprime o percentual de representação de cada estado
        for (int i = 0; i < estados.length; i++) {
            double percentual = (faturamentoEstados[i] / faturamentoTotal) * 100.0;
            System.out.printf("%s - %.2f%%\n", estados[i], percentual);
        }
    }
}

