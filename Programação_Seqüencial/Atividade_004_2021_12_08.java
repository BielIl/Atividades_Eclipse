package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_004_2021_12_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x1, x2, x3, y, x, z;
		
		System.out.println("Digite o valor da primeira variavel? ");
		x1 = scanner.nextInt();
		
		System.out.println("Digite o valor da segunda variavel? ");
		x2= scanner.nextInt();
		
		System.out.println("Digite o valor da terceira variavel? ");
		x3= scanner.nextInt();
		
		x = x1 + x2;
		x = x * x;
		y = x2 + x3;
		y = y * y;
		z = (x + y) / 2;
		
		System.out.println("O valor é de " + z);
		
		scanner.close();
	}

}
