package laço_de_decisão;

import java.util.Scanner;

public class Atividade_001_2021_12_09 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
			int x1, x2, x3, maior = 0;
			
			System.out.println("Qual o primeiro valor? ");
			x1 = scanner.nextInt();
			System.out.println("Qual o segundo valor? ");
			x2 = scanner.nextInt();
			System.out.println("Qual o terceiro valor? ");
			x3 = scanner.nextInt();
			
			if (maior < x1)
				maior = x1;
			
			if (maior < x2)
				maior = x2;
			
			if (maior < x3)
				maior = x3;
			
			System.out.println("O maior valor é " + maior);
		
			scanner.close();
	}
}
