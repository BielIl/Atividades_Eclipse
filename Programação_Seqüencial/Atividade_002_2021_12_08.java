package Programação_Seqüencial;

import java.util.Scanner;

public class Atividade_002_2021_12_08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dias,meses,idade,anos;
		
		System.out.println("Quantos dias de vida? ");
		idade = scanner.nextInt();
		
		anos = idade / 365;
		meses = anos / 12;
		dias = idade % 365;
		
			while (dias > 30) {
				meses++;
				dias = dias - 30;
				
			}
		
		System.out.println("você viveu " + anos + " anos, " + meses + " meses, " + dias + " dias.");
		
		scanner.close();

	}

}