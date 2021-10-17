package fr.eni.tp;

import java.util.Scanner;

public class TP3Mod5 {
	
	public static float max(float a, float b) {
		float max;			//cf correction : possible d'écire directement if(a<b) return b;
		if(a<b) {
			max = b;
		}
		else {
			max = a;
		}
		return max;
	}
	
	public static int compare(float a, float b) {
		int compare;
		if(a==b) {
			compare = 0;
		}
		else if(a>b) {
			compare = 1;
		}
		else {
			compare = -1;
		}
		return compare;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir un premier nombre");
		float nb1 = scan.nextFloat();
		System.out.println("Saisie un deuxième nombre");
		float nb2 = scan.nextFloat();
		
		float max = max(nb1, nb2);
		int compare = compare(nb1, nb2);
		
		System.out.println("le chiffre le plus grand est : " + max);
		switch (compare) {
		case 0:
			System.out.println(nb1 + " est égal à " + nb2);
			break;
		case 1:
			System.out.println(nb1 + " est plus grand que " + nb2);
			break;
		default:
			System.out.println(nb1 + " est plus petit que " + nb2);
			break;
		}
		
		scan.close();
	}
}
