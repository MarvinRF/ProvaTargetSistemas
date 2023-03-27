package questão03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		
        // Ler os valores de faturamento diário a partir do arquivo JSON ou XML fornecido
		
        String jsonString = new String(Files.readAllBytes(Paths.get("faturamento.json")));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        double[] faturamentoDiario = new double[jsonNode.size()];
        for (int i = 0; i < jsonNode.size(); i++) {
            faturamentoDiario[i] = jsonNode.get(i).asDouble();
        }

        // Calcular o menor e o maior valor de faturamento ocorrido em um dia do mês
        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        for (double faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
        }

        // Calcular a média mensal de faturamento, ignorando os dias sem faturamento
        
        double somaFaturamento = 0.0;
        int numDiasComFaturamento = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                somaFaturamento += faturamento;
                numDiasComFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / numDiasComFaturamento;

        // Contar o número de dias no mês em que o valor de faturamento diário foi superior à média mensal
        
        int numDiasAcimaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                numDiasAcimaMedia++;
            }
        }

        // Exibir os resultados
        
        System.out.println("Menor faturamento: R$" + menorFaturamento);
        System.out.println("Maior faturamento: R$" + maiorFaturamento);
        System.out.println("Média mensal de faturamento: R$" + mediaMensal);
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaMedia);
    }
}
