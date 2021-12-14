package Exercícios_com_Vetores_e_Matrizes;

import java.util.Scanner;

public class Atividade_003_2021_12_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[][] N1 = new double[2][2],N2 = new double[2][2],M1 = new double[2][2],M2 = new double[2][2];
		int tamanhoLinha = 2, tamanhoColuna = 2;
		
		for (int L = 0; L < tamanhoLinha; L++) {
			for (int C = 0; C < tamanhoColuna; C++) {
				System.out.println("Digite o valor de N1? ");
					N1[L][C] = scanner.nextDouble();
			
			}
		}
		
		for (int L = 0; L < tamanhoLinha; L++){
			for (int C = 0; C < tamanhoColuna; C++){
				System.out.println("Digite o valor de N2? ");
					N2[L][C] = scanner.nextDouble();
			
			}
		}
			System.out.println();
			for (int L = 0; L < tamanhoLinha; L++){
				System.out.print(" | ");
				for (int C = 0; C < tamanhoColuna; C++){
					M1[L][C] = N1[L][C] + N2[L][C];
							System.out.print(M1[L][C] + " | ");
					
			}
				System.out.println();
		}
			for (int L = 0; L < tamanhoLinha; L++){
				System.out.println();
				System.out.print(" | ");
				for (int C = 0; C < tamanhoColuna; C++){
					M2[L][C] = N1[L][C] - N2[L][C];
					System.out.print(M2[L][C] + " | ");

				}

			}
			scanner.close();
	}
}
