package fr.eni.tp;

import java.util.Scanner;

/**
 * Classe en charge de 
 * @author Julien
 * version TPMaxEtCompare.java v1.0
 * @date 16 juin 2020
 */
public class CorrectionTP3 {

	public static void main(String[] args) {
		double val1, val2, maximum;
		int resultat;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer une première valeur");
		val1 = sc.nextDouble();
		System.out.println("Entrer une seconde valeur");
		val2 = sc.nextDouble();
		
		//tester la fonction de max
		maximum = max(val1, val2);
		System.out.println("Le maximum de " + val1 + " et " + val2 + " est " + maximum);
		//tester la fonction de comparaison
		resultat =  compare(val1, val2);
		if (resultat == 0)
			System.out.println("Les deux valeurs sont égales");
		else if (resultat > 0)
			System.out.println("La première valeur est la plus grande");
		else
			System.out.println("La seconde valeur est la plus grande");

	}
	
	/**
	 * Compare deux valeurs et retourne la plus grande des deux
	 * @param val1
	 * @param val2
	 * @return
	 */
	private static double max(double val1, double val2) {
		
		if(val1 >= val2) return val1;
		else return val2;
	}

	/**
	 * Compare deux valeurs et retourne le résultat de la
	 * comparaison
	 * @param val1
	 * @param val2
	 * @return 	0 si les 2 valeurs sont égales
	 * 			1 si la première valeur est plus grande
	 * 			-1 si la première valeur est plus petite
	 */
	private static int compare(double val1, double val2) {
		
		if(val1 > val2) return 1;
		else if(val1 < val2) return -1;
		else return 0;
	}

}
