package fi.eni.demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("#####################");
		System.out.println("######Bienvenue######");
		System.out.println("#####################");
		
		System.out.println("#####################");
		System.out.println("##Demande de saisie##");
		System.out.println("#####################");
		
		System.out.println("Veuillez faire un choix : ");
		System.out.println("1 - Afficher 10 fois Bonjour");
		System.out.println("2 - Afficher les 10 premiers nombres pairs");
		System.out.println("3 - Afficher des couleurs");
		
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		
		
		if(saisie == 1) {
			System.out.println("#####################");
			System.out.println("###10 fois bonjour###");
			System.out.println("#####################");
			for (int i = 0; i<10;i++) {
				System.out.println("Bonjour");
			}
		}

		if(saisie == 2) {
			System.out.println("#####################");
			System.out.println("#10 premiers nb pairs#");
			System.out.println("#####################");
			for (int i = 0; i<10;i++) {
				System.out.println(i*2);
			}
		}
		
		if(saisie == 3) {
			System.out.println("#####################");
			System.out.println("#######couleurs######");
			System.out.println("#####################");
			
			System.out.println("ROUGE, JAUNE, BLEU");
		}
		
		scan.close();

	}

}
