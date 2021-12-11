package Laços_de_Repetição;

import java.util.Scanner;

public class Atividade_003_2021_12_10 {

	public static void main(String[] args) {
		
		double idade = 0.0, menor21 = 0.0,maior50 = 0.0,meio = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (idade >= -98) {
			
			System.out.println("Digite a idade? ");
			idade = scanner.nextInt();
			
			if (idade <= 21) {
				menor21++;
			}
			else if(idade >= 21 & idade < 50) {
				meio++;
			}
			else {
				maior50++;
			}
		}
		System.out.println("Total de pessoas menores que 21 " + menor21);
		System.out.println("Total de pessoas maiores que 21 " + meio);
		System.out.println("Total de pessoas menores que 21 " + maior50);
		
		scanner.close();
	}
}
