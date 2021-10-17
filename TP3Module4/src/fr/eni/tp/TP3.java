package fr.eni.tp;

import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {
		//déclaration des variables à calculer
		int nbCheque = 0;
		float total = 0;
		float moyenne = 0;
		int nbInf200 = 0;
		float totInf200 = 0;
		int nbSup200 = 0;
		float totSup200 = 0;
		float cheqMin = 0;
		int numCheqMin = 0;
		float cheqMax = 0;
		int numCheqMax = 0;
		
		int numCheq;
		float montCheq = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisissez le numéro du chèque");
		numCheq = scan.nextInt();
		
		while(numCheq != 0) {
						
			montCheq = 0;
			while(montCheq <= 0) {
				System.out.println("Saisissez le montant du chèque");
				montCheq = scan.nextFloat();
				}
				
				nbCheque++;
				total = total + montCheq; //on aurait pu écrire total += montCheq
						
				if(montCheq < 200) {
					nbInf200++;
					totInf200 = totInf200 + montCheq;
				}
				
				if(montCheq >= 200) {
					nbSup200++;
					totSup200 = totSup200 + montCheq;
				}
				
				if(cheqMin == 0) { 			// correction : if(montantChequeMin == 0 || montantCheque < montantChequeMin)
					cheqMin = montCheq;
					numCheqMin = numCheq;
				}
				else if (montCheq < cheqMin) {
					cheqMin = montCheq;
					numCheqMin = numCheq;
				}
				
				if(montCheq > cheqMax) {
					cheqMax = montCheq;
					numCheqMax = numCheq;
				}
				
			
			System.out.println("Saisissez le numéro du chèque");
			numCheq = scan.nextInt();
		}
		
		if(nbCheque != 0) {
			moyenne = total / nbCheque;
		
			System.out.println("Nombre de chèques introduits : " + nbCheque);
			System.out.println("Montant total des chèques : " + total);
			System.out.println("Moyenne des montants : " + moyenne);
			System.out.println("Vous avez introduit " + nbInf200 + " chèques dont le montant est inférieur à 200€, pour un total de ces chèques de : " + totInf200);
			System.out.println("Vous avez introduit " + nbSup200 + " chèques dont le montant est inférieur à 200€, pour un total de ces chèques de : " + totSup200);
			System.out.println("Numéro du chèque dont le montant est le plus petit : " + numCheqMin + ", son montant : " + cheqMin);
			System.out.println("Numéro du chèque dont le montant est le plus grand : " + numCheqMax + ", son montant : " + cheqMax);
		}
		else {System.out.println("Pas de chèque introduit");}
		
		scan.close();
	}

}
