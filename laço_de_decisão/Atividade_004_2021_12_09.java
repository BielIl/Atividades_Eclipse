package laço_de_decisão;

import java.util.Scanner;

public class Atividade_004_2021_12_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			double numeros;
		
			System.out.println("Digite o valor? ");
			numeros = scanner.nextDouble();
		
			if (numeros %2 == 0) {
					System.out.println("O valor digitado é par e a raiz dele é " + Math.sqrt(numeros));
			}
			else {
				System.out.println("O valor digitado é impar");
			}
		scanner.close();
	}

}