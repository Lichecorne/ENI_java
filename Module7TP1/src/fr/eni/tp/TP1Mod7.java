package fr.eni.tp;

import java.util.Arrays;
import java.util.Scanner;

public class TP1Mod7 {
	
	public static char[][] decoupage(String phrase) {
		String[] tab = phrase.split(" ");
		char[][] matrice = new char[tab.length][];
		for(int i=0; i<tab.length;i++) {
			matrice[i] = tab[i].toCharArray();
		}
		
		return matrice;
	}
	
	public static char[] melange(char[] mot) {
		
		char[] motMel = new char[mot.length];
		Arrays.fill(motMel, ' ');
		motMel[0] = mot[0];
		motMel[mot.length-1] = mot[mot.length-1];
		for(int i=1;i<mot.length-1;i++) {
			boolean check = false;
			while(check == false) {
				int random = (int)(Math.random()*mot.length);
				if(motMel[random] == ' ') {
					motMel[random] = mot[i];
					check = true;
				}
			}
		}
		return motMel;
		
		//essais inaboutis d'utilisation de shuffle
		//List<char> liste = new ArrayList<>();
		//liste = Arrays.asList(mot);
		//Collections.shuffle(liste);
		//char[] motMel = liste.toArray(new char[liste.size()]);
		
	}
	
	public static String phrase(String[] tab) {
		String phraseMel;
		phraseMel = tab[0];
		for(int i=1; i<tab.length;i++) {
			phraseMel += " ";
			phraseMel += tab[i];
		}	
		return phraseMel;
	}
	

	public static void main(String[] args) {
		
		// saisie de la phrase
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir une phrase");
		String phrase = scan.nextLine();
		
		//appel de la fonction qui va découper la phrase en mots puis chaque mot sera convertit en tableau de caractères et placé dans une matrice
		char[][] matrice = decoupage(phrase);
		
		//affichage test
		//for(char[] element : matrice) {
		//	System.out.println(Arrays.toString(element));
		//}
		
		//boucle pour mélanger chaque mot - appel d'une fonction permettant de mélanger un tableau
		char[][] matriceMel = new char[matrice.length][];
		
		for(int i=0; i<matrice.length;i++) {
			if(matrice[i].length > 3) {
				matriceMel[i] = melange(matrice[i]);
			}
			else {
				matriceMel[i] = matrice[i];
			}
		}
		
		//transformation de la matrice en tableau de mots
		String[] phraseMel = new String[matrice.length];
		for(int i=0;i<matriceMel.length;i++) {
			phraseMel[i] = new String(matriceMel[i]);
		}
		
		//afficher la phrase hors tableau en remettant les espaces
		String phraseFin = phrase(phraseMel);
		
		System.out.println(phraseFin);
		
		
		//à revoir : prendre en compte les caractères spéciaux
		
		
		//affichage test
		//System.out.println(Arrays.toString(phraseMel));
		
		//for(char[] element : matriceMel) {
		//	System.out.println(Arrays.toString(element));
		//}
		
		
		
		scan.close();

	}




}
