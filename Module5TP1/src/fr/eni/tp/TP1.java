package fr.eni.tp;

import java.util.Scanner;

public class TP1 {

	public static boolean premier(int nombre) {
		int compteur = 0;
			for(int i = 1;i<=nombre;i++) {
				if(nombre % i == 0) {
					compteur++;
				}
			}
		return compteur == 2;
	}
	
	public static int choixLim() {
		Scanner scan = new Scanner(System.in);
		int limite;
		do {
			System.out.println("saisir la limite de la recherche de nombre entiers :");
			limite = scan.nextInt();
		} while(limite <= 0);
		scan.close();
		return limite;
	}
	
	public static void main(String[] args) {
		
		int limite = choixLim();
		
		for(int i = 0;i<=limite;i++) {
			boolean estPremier = premier(i);
			if(estPremier) {
				System.out.println(i);
			}
		}
		
	}
}
