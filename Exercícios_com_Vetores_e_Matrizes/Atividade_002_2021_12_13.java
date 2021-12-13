package Exercícios_com_Vetores_e_Matrizes;

import java.util.Scanner;

public class Atividade_002_2021_12_13 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double media = 0, dado[] = new double[10];
		
		for (int i = 0; i < dado.length; i++) {
			
			System.out.println("Digite o valor do dado de 1 a 6? ");
			dado[i] = scanner.nextDouble();
			
			if (dado[i] == 6) {
				media++;
			}
			else if (dado[i] > 6 || dado[i] <= 0) {
				System.out.println("Valor não corresponde a um D6");
				break;
			}
		}
		System.out.println("Total de vezes que deu 6 " + media);
		scanner.close();
	}
}
