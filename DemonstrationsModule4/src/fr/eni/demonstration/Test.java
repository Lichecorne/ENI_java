package fr.eni.demonstration;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le jour de la semaine :");
		int jour = scanner.nextInt();
		
		switch (jour) {
		case 1:
			System.out.println("Lundi");
			break;
		case 2: System.out.println("Mardi");break;
		case 3: System.out.println("Mercredi");break;
		case 4: System.out.println("Jeudi");break;
		case 5: System.out.println("Vendredi");break;
		case 6: System.out.println("Samedi");break;
		case 7: System.out.println("Dimanche");break;
		default: System.out.println("Erreur");
			break;
			*/
		
		int i = 10;
		int j = 10;
		
		while(i<10) {
			i++;
			System.out.println("i = " + i);
		}
		
		do {
			j++;
			System.out.println("j = " + j);
		}while(j<10);
		
		for(int k = 0;k<5;k++) {
			System.out.println("k = " + k);
		}
	}

}
