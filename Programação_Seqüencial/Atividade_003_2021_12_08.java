package Programa��o_Seq�encial;

import java.util.Scanner;

public class Atividade_003_2021_12_08 {
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int minutos = 0, horas = 0, tempo;
		
		System.out.println("Qual o tempo de produ��o em segundo? ");
		tempo = scanner.nextInt();
		
		while (tempo >= 60) {
			minutos++;
			tempo = tempo - 60;
		}
		while (minutos >= 60) {
			horas++;
			minutos = minutos - 60;
		}
		
		System.out.println("tempo de produ��o � de " + horas + " horas, " + minutos + " minutos, " + tempo + " segundos.");
		
		scanner.close();
	}
}
