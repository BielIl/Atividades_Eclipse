package Exercícios_com_Vetores_e_Matrizes;

import java.util.Scanner;

public class Atividade_001_2021_12_13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valor[] = new double [5];
		double valorMaior = 0;
		
		for (int i = 0; i < valor.length; i++) {
			
			System.out.println("Digite a " + (i+1) + " pontuação: ");
			valor[i] = scanner.nextDouble();
			
				if (valor[i] > valorMaior) {
					valorMaior = valor[i];
			}
				
		}
		System.out.println("O maior valor é " + valorMaior);
		scanner.close();
	}

}
