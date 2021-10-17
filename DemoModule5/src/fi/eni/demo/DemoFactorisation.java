package fi.eni.demo;

import java.util.Scanner;

public class DemoFactorisation {
	
	public static void afficher(String phrase) {
		System.out.println("#####################");
		System.out.println(phrase);
		System.out.println("#####################");
	}
	
	public static void bonjour() {
		for (int i = 0; i<10;i++) {
			System.out.println("Bonjour");
		}
	}
	
	public static void nbPairs() {
		for (int i = 0; i<10;i++) {
			System.out.println(i*2);
		}
	}
	
	private static void couleurs() {
		System.out.println("ROUGE");
		System.out.println("JAUNE");
		System.out.println("BLEU");
	}
	
	public static void main(String[] args) {

		afficher("Bienvenue");
		
		afficher("Demande de saisie");
				
		System.out.println("Veuillez faire un choix : ");
		System.out.println("1 - Afficher 10 fois Bonjour");
		System.out.println("2 - Afficher les 10 premiers nombres pairs");
		System.out.println("3 - Afficher des couleurs");
		
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		
		switch (saisie) {
		case 1:
			afficher("10 fois bonjour");
			bonjour();
			break;
		case 2:
			afficher("10 premiers nb pairs");
			nbPairs();
			break;
		case 3:
			afficher("couleurs");
			couleurs();
			break;
		default:System.out.println("Erreur");
			break;
		}
				
		scan.close();

	}

}
