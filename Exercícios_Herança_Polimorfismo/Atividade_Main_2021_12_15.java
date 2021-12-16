package Exercícios_Herança_Polimorfismo;

public class Atividade_Main_2021_12_15 {

	public static void main(String[] args) {
		
	Atividade_Cachorro_2021_12_15 Cachorro = new Atividade_Cachorro_2021_12_15();
	Atividade_Cavalo_2021_12_15 Cavalo = new Atividade_Cavalo_2021_12_15();
	Atividade_Preguica_2021_12_15 Preguica = new Atividade_Preguica_2021_12_15();
	
		Cachorro.setNome("Gato");
		Cachorro.setIdade(6);
		Cachorro.setCorrida("Correndo que nem um jato na sua canela");
		Cachorro.setSom("Latino por pouco tempo, Pois logo está na sua canela");
		
		Cavalo.setNome("Cavalo de 3 pernas");
		Cavalo.setIdade(4);
		Cavalo.setCorrida("Galopando pra longe");
		Cavalo.setSom("relinchar pra longe até você não o ver mais");
		
		Preguica.setNome("Siddy");
		Preguica.setIdade(8);
		Preguica.setCorrida("Ela foi dormir");
		Preguica.setSom("Ela está dormindo, Shhhh!");
		
		System.out.println("Nome do Cachorro: " + Cachorro.getNome());
		System.out.println("Idade do Cachorro: " + Cachorro.getIdade());
		System.out.println("Cuidado com o Cachorro: " + Cachorro.getCorrida());
		System.out.println("Som do Cachorro: " + Cachorro.getSom());
		
		System.out.println();
		System.out.println("Nome do Cavalo: " + Cavalo.getNome());
		System.out.println("Idade do Cavalo: " + Cavalo.getIdade());
		System.out.println("Corrida do Cavalo: " + Cavalo.getCorrida());
		System.out.println("Som do Cavalo: " + Cavalo.getSom());
		
		System.out.println();
		System.out.println("Nome da Preguica: " + Preguica.getNome());
		System.out.println("Idade da Preguica: " + Preguica.getIdade());
		System.out.println("Corrida da Preguica: " + Preguica.getCorrida());
		System.out.println("Som da Preguica: " + Preguica.getSom());
		
	}

}
