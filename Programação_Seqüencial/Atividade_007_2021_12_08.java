package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_007_2021_12_08 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3, x, y;
		
		System.out.println("Difite o valor da primeira variavel? ");
		x1 = scanner.nextDouble();
		
		System.out.println("Digite o valor da segunda variavel? ");
		x2 = scanner.nextDouble();
		
		System.out.println("Digite o valor da terceira variavel? ");
		x3 = scanner.nextDouble();
		
		System.out.println("Difite o valor da quarta variavel? ");
		y1 = scanner.nextDouble();
		
		System.out.println("Digite o valor da quinta variavel? ");
		y2 = scanner.nextDouble();
		
		System.out.println("Digite o valor da sexta variavel? ");
		y3 = scanner.nextDouble();
		
		x = ((x3 * y2) - (x2 * y3)) / ((x1 * y2) - (x2 * y1));
		y = ((x1 * y3) - (x3 * y1)) / ((x1 * y2) - (x2 * y1));
		
		System.out.println("O valor de X é de " + x + ", O valor de Y é de " + y);
		
		scanner.close();
	}
}
