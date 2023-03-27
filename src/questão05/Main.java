package questão05;

public class Main {
	public static void main(String[] args) {
        String str = "Olá, Target Sistemas!"; // string a ser invertida
        String strInvertida = "";

        // percorre a string da direita para a esquerda e adiciona cada caractere à nova string invertida
        
        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }

        // imprime a string invertida
        System.out.println("String invertida: " + strInvertida);
    }
}
