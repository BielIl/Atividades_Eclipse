package Orienta��o_a_Objetos;

public class Atividade_002_2021_12_14 {

	public static void main(String[] args) {
		
		Atividade_002_Avi�o_2021_12_14 avi�o = new Atividade_002_Avi�o_2021_12_14();
				
		System.out.println("Modelo avi�o: " + avi�o.modeloAvi�oCliente("boeing 777"));
		System.out.println("Velocidade Maxima do Avi�o: " + avi�o.velocidadeMaxCliente(950) + " km/h.");
		System.out.println("Passageiros Maximos: " + avi�o.passageiroMaxCliente(368) + " passageiros.");
		System.out.println("Autonomia Maxima: " + avi�o.autonomiaMaxCliente(17395) + " km.");

	}

}
