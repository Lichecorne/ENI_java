package fr.eni.demo;

public class DemoEnum {
	
	enum Couleurs { VERT, JAUNE, ORANGE, ROUGE }
	
	public static void main(String[] args) {
		
		System.out.println(Couleurs.ORANGE);
		
		Couleurs var = Couleurs.ROUGE;
		System.out.println(var);
		
		if(var == Couleurs.ROUGE) {
			System.out.println("OK");
		}
		
		for(Couleurs i : Couleurs.values()) {
			System.out.println(i.name() + " " + i.ordinal());
		}
		
	}
}
