package Orientação_a_Objetos;

public class Atividade_002_2021_12_14 {

	public static void main(String[] args) {
		
		Atividade_002_Avião_2021_12_14 avião = new Atividade_002_Avião_2021_12_14();
				
		System.out.println("Modelo avião: " + avião.modeloAviãoCliente("boeing 777"));
		System.out.println("Velocidade Maxima do Avião: " + avião.velocidadeMaxCliente(950) + " km/h.");
		System.out.println("Passageiros Maximos: " + avião.passageiroMaxCliente(368) + " passageiros.");
		System.out.println("Autonomia Maxima: " + avião.autonomiaMaxCliente(17395) + " km.");

	}

}
