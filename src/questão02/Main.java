package questão02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        sc.close();

        int primeiro = 0, segundo = 1, proximo;

        while (primeiro <= num) {
            if (primeiro == num) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
                return;
            }
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(num + " não pertence à sequência de Fibonacci.");
    }
}

