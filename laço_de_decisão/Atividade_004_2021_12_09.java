package la�o_de_decis�o;

import java.util.Scanner;

public class Atividade_004_2021_12_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			double numeros;
		
			System.out.println("Digite o valor? ");
			numeros = scanner.nextDouble();
		
			if (numeros %2 == 0) {
					System.out.println("O valor digitado � par e a raiz dele � " + Math.sqrt(numeros));
			}
			else {
				System.out.println("O valor digitado � impar");
			}
		scanner.close();
	}

}