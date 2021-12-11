package Laços_de_Repetição;

import java.util.Scanner;

public class Atividade_005_2021_12_11 {

	public static void main(String[] args) {
		
		int digito = 0, somatoria = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor? ");
			System.out.println("Digite 0 (Zero) para encerrar");
			digito = scanner.nextInt();
			
			somatoria = somatoria + digito;
			
		} while (digito != 0);
		
		System.out.println("A soma dos numeros são " + somatoria);
		
		scanner.close();
	}
}
