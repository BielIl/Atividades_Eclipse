package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_001_2021_12_08 {
	
		public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
		
			int dias,meses,idade;
		
			System.out.println("Qual sua idade? ");
			idade = scanner.nextInt();
			System.out.println("Quantos meses? ");
			meses = scanner.nextInt();
			
		
			dias = idade * 365;
			dias = dias + (meses*12);
			
			System.out.println("Você tem " + dias + " de vida");
				
			scanner.close();
		}
}
