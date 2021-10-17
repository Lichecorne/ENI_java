package fr.eni.tp;

import java.util.Scanner;

public class TP2 {

	public static void main(String[] args) {
		//définition des constantes et variables
		final int H_BASE = 169;
		final int H_MAJ = 180;
		final float MAJ1 = 50/100f;
		final float MAJ2 = 60/100f;
		final int P_E1 = 20;
		final int P_E2 = 50;
		final int P_E3 = 70;
		final int P_E_SUP = 20;
		float salaireBrut;
		float salaireNet;
		int primeEnfant = 0;
		final float cotis = 26.91f;
		
		
		//récupération des informations du salarié
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre nom");
		String nom = scan.nextLine();
		System.out.println("Veuillez saisir votre prénom");
		String prenom = scan.nextLine();
		System.out.println("Veuillez saisir votre statut (1-Cadre; 2-Agent maitrise; 3-Employé de bureau");
		int statut = scan.nextInt();
		System.out.println("Veuillez saisir le nombre d'heures effectuées");
		float nbHeures = scan.nextFloat();
		System.out.println("Veuillez renseigner votre taux horaire");
		float taux = scan.nextFloat();
		System.out.println("Combien d'enfants avez vous ?");
		int enfants = scan.nextInt();
		
		//calcul du salaire brut
		if(nbHeures <= 0) {
			salaireBrut = 0;
		}
		else if(nbHeures <= H_BASE) {
			salaireBrut = taux*nbHeures;
		}
		else if(nbHeures <= H_MAJ) {
			salaireBrut = taux*(H_BASE + (nbHeures - H_BASE)*(1+MAJ1));
		}
		else {
			salaireBrut = taux*(H_BASE + (H_MAJ - H_BASE)*(1+MAJ1) + (nbHeures - H_MAJ)*(1+MAJ2));
		}
		
		//calcul de la prime familiale
		if(enfants > 0) {
			switch (enfants) {
			case 1:
				primeEnfant = P_E1;
				break;
			case 2:
				primeEnfant = P_E2;
				break;
			default: primeEnfant = P_E3 + (enfants-2)*P_E_SUP;
				break;
			}
		}
		
		//calcul salaire net
		salaireNet = (salaireBrut*(1 - cotis/100) + primeEnfant);
		
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		switch (statut) {
		case 1:
			System.out.println("Statut : Cadre");
			break;
		case 2:
			System.out.println("Statut : Agent de maitrise");
			break;
		case 3:
			System.out.println("Statut : Employé de bureau");
			break;
		default: System.out.println("Erreur saisie statut");
			break;
		}
		System.out.println("Salaire Brut : " + salaireBrut);
		System.out.println("Cotisations salariales : " + salaireBrut*cotis/100);
		System.out.println("Prime familiae : " + primeEnfant);
		System.out.println("Salaire Net à payer : " + salaireNet);
		
		scan.close();
	}

}
