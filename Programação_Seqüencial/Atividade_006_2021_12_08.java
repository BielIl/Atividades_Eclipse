package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_006_2021_12_08 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x, x1, x2, y, y1, y2, z;
		
		System.out.println("Difite o valor d3 X1? ");
		x1 = scanner.nextDouble();
		
		System.out.println("Digite o valor de X2? ");
		x2 = scanner.nextDouble();
		
		System.out.println("Digite o valor de Y1? ");
		y1 = scanner.nextDouble();
		
		System.out.println("Digite o valor de Y2? ");
		y2 = scanner.nextDouble();
		
		x = (x1 * x1) - (x2 * x2);
		y = (y1 * y1) - (y2 * y2);
		z = x + y;
		Math.sqrt(z);
		
		System.out.println("O valor da raiz é de " + z);
		
		scanner.close();
	}
}
