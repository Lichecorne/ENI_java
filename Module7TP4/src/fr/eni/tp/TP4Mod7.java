package fr.eni.tp;

import java.util.Scanner;

public class TP4Mod7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir un nombre entier entre 0 et 256");
		int nombre = scan.nextInt();
		while(nombre < 0 || nombre > 256) {
			System.out.println("Erreur de saisie : saisir un nombre entier entre 0 et 256");
			nombre = scan.nextInt();
		}
		int resultat;
		int reste;
		int nbCalcul;
		String binaire;
		
		resultat = nombre / 2;
		reste = nombre % 2;
		binaire = String.valueOf(reste);
		nbCalcul = resultat;
		while(resultat != 0) {
			resultat = nbCalcul / 2;
			reste = nbCalcul % 2;
			binaire = String.valueOf(reste) + binaire;
			nbCalcul = resultat;
		}
		
		System.out.println("La représentation binaire de " + nombre + " est : " + binaire);
		scan.close();

	}

}
