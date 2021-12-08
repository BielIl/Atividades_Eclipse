package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_005_2021_12_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
			double nota1, nota2, nota3, media;
			
			System.out.println("Difite o valor da primeira nota? ");
			nota1 = scanner.nextDouble();
			
			System.out.println("Digite o valor da segunda nota? ");
			nota2 = scanner.nextDouble();
			
			System.out.println("Digite o valor da terceira nota? ");
			nota3 = scanner.nextDouble();
			
			nota1 = nota1 * 2;
			nota2 = nota2 * 3;
			nota3 = nota3 * 5;
			
			media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("O valor da media é de " + media);
		
		scanner.close();
		
	}

}
