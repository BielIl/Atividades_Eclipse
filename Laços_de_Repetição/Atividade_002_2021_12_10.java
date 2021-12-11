package Laços_de_Repetição;

import java.util.Scanner;

public class Atividade_002_2021_12_10 {

	public static void main(String[] args) {
	
		double par = 0, impar = 0, numeros, zero = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int A = 1; A <= 10; A++) {
			System.out.println("Quais os valores? ");
			numeros = scanner.nextDouble();
			
			if (numeros %2 == 0) {
				par++;
				
		}
			else if (numeros == 0) {
				zero++;
			}
				
			else {
				impar++;
			}
			
		}
		
		System.out.println("O total de numeros pares são: " + par);
		System.out.println("O total de numeros impares são: " + impar);
		System.out.println("Valor zero foi digitado " + zero);
		scanner.close();
	}

}
