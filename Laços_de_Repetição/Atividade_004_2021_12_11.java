package Laços_de_Repetição;

import java.util.Scanner;

public class Atividade_004_2021_12_11 {

	public static void main(String[] args) {
		
		int pessoas = 0, pergunta1, pergunta2, pergunta3;
		int media1 = 0, media2 = 0, media3 = 0, media4 = 0, media5 = 0, media6 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (pessoas <= 150) {
			
			System.out.println("Digite a sua idade? ");
			pergunta1 = scanner.nextInt();
			
			System.out.println("qual o sexo? ");
			System.out.println("digite (1-feminino / 2-masculino / 3-Outros)");
			pergunta2 = scanner.nextInt();
			
			System.out.println("Qual você se identifica? ");
			System.out.println("digite \n(1- se você era calma) \n(2- se você era nervosa) \n(3- se você era agressiva)");
			pergunta3 = scanner.nextInt();
			
			pessoas++;
			
			if (pergunta3 == 1) {
				media1++;
			}
			
			if (pergunta2 == 1 & pergunta3 == 2) {
				media2++;
			}
			if (pergunta2 == 2 & pergunta3 == 3) {
				media3++;
			}
			if (pergunta2 ==3 & pergunta3 == 1) {
				media4++;
			}
			if (pergunta1 >= 40 & pergunta3 == 2) {
				media5++;
			}
			if (pergunta1 <=18 & pergunta3 == 1) {
				media6++;
			}
		}
		
		System.out.println("o número de pessoas calmas: " + media1);
		System.out.println("o número de mulheres nervosas: " + media2);
		System.out.println("o número de homens agressivos: " + media3);
		System.out.println("o número de outros calmos: " + media4);
		System.out.println("o número de pessoas nervosas com mais de 40 anos: " + media5);
		System.out.println("o número de pessoas calmas com menos de 18 anos: " + media6);
		
		scanner.close();
	}
}