package Laços_de_Repetição;

public class Atividade_001_2021_12_10 {
	
	public static void main(String[] args) {
		
	double numero;
	
	for (int A = 1000; A <= 1999; A++) {
	
		numero = A %11;
		
		if (numero == 5) {
		System.out.println("N: " + A);
			}
		}
	}
}