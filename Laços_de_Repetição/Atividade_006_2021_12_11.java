package Laços_de_Repetição;

import java.util.Scanner;

public class Atividade_006_2021_12_11 {

	public static void main(String[] args) {
		
		int digito = 0, media = 0, terceira = 3,totaldedigitos = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor? ");
			System.out.println("Digite 0 (Zero) para encerrar");
			digito = scanner.nextInt();
			
			if (digito %terceira == 0) {
			
				totaldedigitos++;
				media = media + digito;
			}
		} while (digito != 0);
		
		totaldedigitos--;
		media = media /totaldedigitos;
		
		System.out.println("Numeros multiplos de 3: " + totaldedigitos);
		System.out.println("A media dos numeros é: " + media);
		
		scanner.close();
	}
}