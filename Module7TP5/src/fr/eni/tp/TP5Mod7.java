package fr.eni.tp;

import java.text.Normalizer;
import java.util.Scanner;

public class TP5Mod7 {
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir une phrase :");
		String phrase = scan.nextLine();
		//System.out.println(phrase);
		String phraseClear = Normalizer.normalize(phrase, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		phraseClear = phraseClear.replaceAll("[^\\w]", "");	
		phraseClear = phraseClear.toLowerCase();
		//System.out.println(phraseClear);
		boolean verif = true;
		int i = 0;
		int j = phraseClear.length()-1;
		while (verif && i<j) {
			verif = (phraseClear.charAt(i) == phraseClear.charAt(j));
			i++;
			j--;
		}
		
		if(verif) {
			System.out.println("La phrase : \""+ phrase + "\" est un palindrome.");
		}
		else {
			System.out.println("La phrase : \""+ phrase + "\" n'est pas un palindrome.");
		}
				
		scan.close();

	}

}
