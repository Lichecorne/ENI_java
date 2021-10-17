package fr.eni.tp;


import java.util.Arrays;
import java.util.Scanner;

public class TP2Mod7 {
	
	public static char[][] genTableau() {
		char[][] tableau = new char[26][26];
		char lettre = 'A';
		for(int i=0;i<26;i++) {
			tableau[0][i] = lettre;
			lettre++;
		}
		for(int j=1;j<26;j++) {
			for(int i=0;i<26-1;i++) {
				tableau[j][i] = tableau[j-1][i+1];
			}
			tableau[j][25] = tableau[j-1][0];
		}
		return tableau;
	}
	
	public static int choixMode(Scanner scan) {
		System.out.println("Veuillez choisir le mode : 1- Cryptage / 2- Décryptage");
		int mode = scan.nextInt();
		while(mode != 1 && mode != 2) {
			System.out.println("Saisie incorrecte. Veuillez choisir le mode : 1- Cryptage / 2- Décryptage");
			mode = scan.nextInt();
		}
		return mode;
	}
	
	public static String saisieChaine(Scanner scan) {
		System.out.println("Saisir la chaine de caractères à crypter ou décrypter (pas d'accent, ni caractères spéciaux)");
		String chaine = scan.next();
		while(chaine.isEmpty() || chaine.matches("^[a-zA-Z]*$") == false) {
			System.out.println("Saisie incorrecte. Saisir la chaine de caractères à crypter ou décrypter (pas d'accent, ni caractères spéciaux)");
			chaine = scan.next();
		} 
		chaine = chaine.toUpperCase();
		return chaine;
	}
	
	public static String saisieCle(Scanner scan) {
		System.out.println("Veuillez saisir une clé de 8 caractères maximum (pas d'accent, ni caractères spéciaux)");
		String cle = scan.next();
		while(cle.length() > 8 || cle.isEmpty() || cle.matches("^[a-zA-Z]*$") == false) {
			System.out.println("Saisie incorrecte. Veuillez saisir une clé de 8 caractères maximum (pas d'accent, ni caractères spéciaux)");
			cle = scan.next();
		}
		cle = cle.toUpperCase();
		return cle;
	}
	
	public static String cryptage(char[][] tableau, String chaine, String cle) {
		String crypto = "";
		int j = 0;
		int ligne;
		int colonne;
		char lettreChaine;
		char lettreCle;
		for(int i=0; i < chaine.length();i++) {
			lettreChaine = chaine.charAt(i);
			colonne = Arrays.binarySearch(tableau[0], lettreChaine);
			if(j == cle.length()) {
				j = 0;
			}
			lettreCle = cle.charAt(j);
			ligne = Arrays.binarySearch(tableau[0], lettreCle);
			j++;
			crypto += tableau[ligne][colonne];
		}
		return crypto;
	}
	
	public static String decryptage(char[][] tableau, String chaine, String cle) {
		String decrypto = "";
		int j = 0;
		int ligne;
		int colonne;
		char lettreChaine;
		char lettreCle;
		for(int i=0; i < chaine.length();i++) {
			if(j==cle.length()) {
				j = 0;			
			}
			lettreCle = cle.charAt(j);
			ligne = Arrays.binarySearch(tableau[0], lettreCle);
			j++;
			lettreChaine = chaine.charAt(i);
			colonne = 0;
			while(colonne < tableau.length && tableau[ligne][colonne] != lettreChaine) {
				colonne++;
			} 
			decrypto += tableau[0][colonne];
		}
		return decrypto;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//génération du tableau
		char[][] tableau = new char[26][26];
		tableau = genTableau();
		
		//choix cryptage ou décryptage
		int mode = choixMode(scan);
		System.out.println(mode);
		
		//saisie chaine
		String chaine = saisieChaine(scan);
		System.out.println(chaine);
		
		//saisie clé
		String cle = saisieCle(scan);
		System.out.println(cle);
		
		for(char[] element : tableau) {
			System.out.println(element);
		}
		
		if (mode == 1) {
			//cryptage de la chaine avec la clé
			String crypto = cryptage(tableau, chaine, cle);
			System.out.println("Cryptogramme : " + crypto);
		}
		else {
			//décryptage de la chaine avec la clé
			String decrypto = decryptage(tableau, chaine, cle);
			System.out.println("Chaine decryptée : " + decrypto);
		}
				
		scan.close();
		
	}

}
