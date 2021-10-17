package fr.eni.tp;

import java.util.Scanner;

/*
L'objectif de ce TP est de créer un jeu pour chercher un nombre compris en 0 et n.

Deux modes sont proposés :
 
1. Trouver un nombre : Le but est de trouver un nombre tiré au sort dans une fourchette allant de 0 à n. La valeur n est choisie par le joueur. En
cas d'erreur, le système signale si le nombre tiré au sort est plus grand ou plus petit afin de guider le joueur.

2. Proposer un nombre : Proposer un nombre dans une plage 0..n afin que le système essaie de le deviner. 
Il faudra lui indiquer si c'est plus ou moins en cas d'erreur. Le système devra être optimisé pour trouver la solution avec le moins d'essais possibles.
 */


public class TP0aN {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//demande de la limite à l'utilisateur
		int limite = choixLim(scan);
		System.out.println(limite);
		
		//choix de la methode de jeu
		int mode = choixModeJeu(scan);
		System.out.println(mode);
		
		//tirer un nb au hasard
		if (mode == 1 ) {
			trouverNombre(scan, limite);
		}
		else {
			proposerNombre(scan, limite);
		}
		
		
		scan.close();

	}

	private static void proposerNombre(Scanner scan, int limite) {
		int limInf = 0;
		int limSup = limite;
		char reponse;
		int cpt = 0;
		do {
			int essai = (int)(limSup+limInf)/2;
			System.out.println("Je propose le nombre " + essai);
			cpt++;
			do {
				System.out.println("Indiquer si le nombre à trouver est supérieur (+), inférieur (-) ou égal (=) à la proposition");
				reponse = scan.next().charAt(0);
			} while (reponse != '+' && reponse != '-' && reponse != '=');
			switch (reponse) {
			case '=':
				System.out.println("J'ai trouvé en " + cpt + " essais.");
				break;
			case '+':
				limInf = essai;
				break;
			case '-':
				limSup = essai;
				break;
			}
		} while (reponse != '=');
		
	}

	private static void trouverNombre(Scanner scan, int limite) {
		int nbATrouver = (int)(Math.random()*limite);
		int proposition;
		int limInf = 0;
		int limSup = limite;
		do {
			do {
				System.out.println("Proposez un nombre entre " + limInf + " et " + limSup);
				proposition = scan.nextInt();
			} while (proposition < 0 || proposition > limite);
			if (proposition == nbATrouver) {
				System.out.println("Bravo vous avez trouvé le nombre");
			}
			else if (proposition < nbATrouver) {
				System.out.println("Le nombre est supérieur à " + proposition);
				limInf = proposition;
			}
			else {
				System.out.println("Le nombre est inférieur à " + proposition);
				limSup = proposition;
			}
		} while (proposition != nbATrouver);
	}

	private static int choixModeJeu(Scanner scan) {
		System.out.println("Choisissez le mode de jeu (1- Trouver un nombre / 2- Proposer un nombre)");
		int choix;
		do {
			choix = scan.nextInt();
		} while(choix != 1 && choix != 2);
		return choix;
	}

	private static int choixLim(Scanner scan) {
		System.out.println("Choisissez la limite de jeu");
		int limite;
		do {
			limite = scan.nextInt();
		} while (limite <= 0);
		return limite;
	}

}
