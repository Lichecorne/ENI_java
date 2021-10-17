package fr.eni.tp;

import java.util.Scanner;

/**
 * Classe en charge de 
 * @author Julien
 * version TPCuisson.java v1.0
 * @date 15 juin 2020
 */

public class CorrectionTP1 {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		//Les variables du programme
		int typeViande;//Pour stocker le type de la viande concernée 1:BOEUF et 2:PORC
		int poids;//Poids de la viande en grammes
		int modeCuisson;//Mode de cuisson 1: BLEU, 2: A POINT et 3: BIEN CUIT
		int tempsDeCuisson = 0;//Résultat du calcul du temps de cuisson en secondes
				
		//Mise en place d'un scanner pour récupérer les données de l'utilisateur
		Scanner sc = new Scanner(System.in);
				
		//Message d'accueil
		System.out.println("********************************");
		System.out.println("*******    TP CUISSON    *******");
		System.out.println("********************************");
				
		//Première étape : Connaitre le type de viande 
		System.out.println("Quel est le type de viande ? (1: Boeuf et 2: Porc)");
		typeViande = sc.nextInt();
				
				
		//Seconde étape : Connaitre le poids de la viande
		System.out.println("Quel est le poids de la viande ? (en grammes)");
		poids = sc.nextInt();
				
		//Troisième étape : Connaitre le mode de cuisson de la viande
		System.out.println("Quel est le mode cuisson choisi ? (1: Bleu, 2: A point et 3: Bien cuit)");
		modeCuisson = sc.nextInt();
				
				
				
		//********Calcul du temps de cuisson********
		/*
		 * La formule du calcul du temps de cuisson est : 
		 * poids récupéré par le scanner 
		 * x temps en minutes prévu en fonction du mode de cuisson 
		 * x 60 (pour convertir en secondes) 
		 * / le poids de référence
		 * 
		 * */
						
		//Condition en fonction du type de viande
		switch (typeViande) {
		//Cas n°1 :  BOEUF
		case 1:
			//Condition en fonction du type de cuisson
			switch (modeCuisson) {
			
			//Cas n°1 : BLEU
			case 1:
				tempsDeCuisson = poids * 10 * 60 / 500;
				break;
						
			//Cas n°2 : A POINT
			case 2:
				tempsDeCuisson = poids * 17 * 60 / 500;
				break;
						
			//Cas n°3 : BIEN CUIT
			case 3:
				tempsDeCuisson = poids * 25 * 60 / 500;
				break;
					
			//Cas par défaut : si le choix n'est pas 1, 2 ou 3	
			default:
				System.out.println("Le mode de cuisson est invalide !");
				break;
			}
			break;
					
		//Cas n°2 : PORC	
		case 2:
			//Condition en fonction du type de cuisson
			switch (modeCuisson) {
			
			//Cas n°1 : BLEU
			case 1:
				tempsDeCuisson = poids * 15 * 60 / 400;
				break;
				
			//Cas n°2 : A POINT	
			case 2:
				tempsDeCuisson = poids * 25 * 60 / 400;
				break;
				
			//Cas n°3 : BIEN CUIT
			case 3:
				tempsDeCuisson = poids * 40 * 60 / 400;
				break;
							
			//Cas par défaut : si le choix n'est pas 1, 2 ou 3
			default:
				System.out.println("Le mode de cuisson est invalide !");
				break;
			}
			break;

		//Cas par défaut : si le choix n'est pas 1 ou 2	
		default:
			System.out.println("Le type de viande n'est pas correct !");
			break;
		}
				
				
		//Affichage du résultat obtenu 
		System.out.println("Le temps de cuisson est de " + tempsDeCuisson + " secondes");
				
				
		//Il est recommandé de fermer le scanner lorsque celui-ci n'est plus utilisé
		sc.close();

	}

}
