package Exercícios_Herança_Polimorfismo;

import java.util.ArrayList;

public class Atividade_003_2021_12_16 {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("HotDog");
		food.add("Kiwi");
		
		food.set(0, "Sushi");
		food.remove(2);
		//food.clear();
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}