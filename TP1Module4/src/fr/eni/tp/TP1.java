package fr.eni.tp;

import java.util.Scanner;

public class TP1 {

	public static void main(String[] args) {
		final int MINUTE = 60;
		final float B_BLEU = 10/500f;
		final float B_AP = 17/500f;
		final float B_BC = 25/500f;
		final float P_BLEU = 15/400f;
		final float P_AP = 25/400f;
		final float P_BC = 40/400f;
		final int BOEUF = 1;
		final int PORC = 2;
		final int BLEU = 1;
		final int APOINT = 2;
		final int BIEN_CUIT = 3;
		
		Scanner scanInt = new Scanner(System.in);

		System.out.println("Quel viande voulez vous cuire ?");
		System.out.println(BOEUF + " - Boeuf");
		System.out.println(PORC + " - Porc");
		int viande = scanInt.nextInt();
		
		System.out.println("Quel type de cuisson voulez vous ?");
		System.out.println(BLEU + " - Bleu");
		System.out.println(APOINT + " - A point");
		System.out.println(BIEN_CUIT + " - Bien cuit");
		int cuisson = scanInt.nextInt();
		
		Scanner scanFloat = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le poids de votre viande en g");
		float poids = scanFloat.nextFloat();
		
		if(viande == BOEUF){
			switch (cuisson) {
			case BLEU:System.out.println("Pour une cuisson bleue de " + poids + "g de boeuf, cuire " + poids*B_BLEU*MINUTE + " secondes");;break;
			case APOINT:System.out.println("Pour une cuisson à point de " + poids + "g de boeuf, cuire " + poids*B_AP*MINUTE + " secondes");;break;
			case BIEN_CUIT:System.out.println("Pour une cuisson bien cuit de " + poids + "g de boeuf, cuire " + poids*B_BC*MINUTE + " secondes");;break;
			default:System.out.println("Type de cuisson non valable");
				break;
			}
		}
		else if(viande == PORC){
			switch (cuisson) {
			case BLEU:System.out.println("Pour une cuisson bleue de " + poids + "g de porc, cuire " + poids*P_BLEU*MINUTE + " secondes");;break;
			case APOINT:System.out.println("Pour une cuisson à point de " + poids + "g de porc, cuire " + poids*P_AP*MINUTE + " secondes");;break;
			case BIEN_CUIT:System.out.println("Pour une cuisson bien cuit de " + poids + "g de porc, cuire " + poids*P_BC*MINUTE + " secondes");;break;
			default:System.out.println("Type de cuisson non valable");
				break;
			}
		}
		else {
			System.out.println("Type de viande non valable");
		}
		
		scanInt.close();
		scanFloat.close();
	}

}
