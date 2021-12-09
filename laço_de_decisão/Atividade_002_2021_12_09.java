package laço_de_decisão;

import java.util.Scanner;

public class Atividade_002_2021_12_09 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x1, x2, x3;
		
		System.out.println("Digite o primeiro? ");
			x1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo? ");
			x2 = scanner.nextDouble();
		
		System.out.println("Digite o terceiro? ");
			x3 = scanner.nextDouble();
			
		System.out.print("A ordem crecente é ");
			for (int x = 2; x >= 0; x--) {
		
				if (x1 < x2 & x1 < x3) {
					System.out.print(" " + x1);
					x1 = x1 * 1000;
				}
				else if (x2 < x1 & x2 < x3) {
					System.out.print(", " + x2);
					x2 = x2 * 1000;
				}
				else if (x3 < x1 & x3 < x2) {
					System.out.print(", " + x3);
					x3 = x3 * 1000;
			}
		}
		
		scanner.close();
	}
}