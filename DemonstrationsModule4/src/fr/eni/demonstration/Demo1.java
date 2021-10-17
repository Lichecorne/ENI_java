package fr.eni.demonstration;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un entier :");
		int premierEntier = scanner.nextInt();
		
		System.out.println("Veuillez saisir un second entier :");
		int secondEntier = scanner.nextInt();
		
		int somme = premierEntier + secondEntier;
		
		System.out.println("La somme des saisies est égale à " + somme);
	}

}
