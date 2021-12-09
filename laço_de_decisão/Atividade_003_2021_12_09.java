package laço_de_decisão;

import java.util.Scanner;

public class Atividade_003_2021_12_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = scanner.nextInt();
		
		if (idade >= 10 && idade <= 14 ) 
			System.out.println("esta na categoria infantil");
		
		
		else if (idade >= 15 && idade <= 17) 
			System.out.println("esta na categoria juvenil");
		
		
		else if (idade >= 18 && idade <= 25) 
			System.out.println("esta na categoria adulto");
		
		else 
			System.out.println("Idade invalida");
		
		scanner.close();

	}

}
