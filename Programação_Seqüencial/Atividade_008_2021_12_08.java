package Programa��o_Seq�encial;

import java.util.Scanner;

public class Atividade_008_2021_12_08 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
			double fabricar, distribuidor, imposto, valorLiquido;
			
			System.out.println("Digite o valor de fabrica��o do carro? ");
			fabricar = scanner.nextDouble();
			
			distribuidor = (fabricar * 0.28) + fabricar;
			imposto = (distribuidor * 0.45) + fabricar;
			valorLiquido = imposto;
			
			System.out.println("O valor do carro � de " + fabricar + " reais");
			System.out.println("O valor liquido do carro � de " + valorLiquido + " reais.");
			
			scanner.close();
	}		
}
