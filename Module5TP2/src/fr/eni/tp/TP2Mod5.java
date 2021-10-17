package fr.eni.tp;

public class TP2Mod5 {
	
	public static void main(String[] args) {
		final int nbCases = 64;
		double nbGrainsCase = 1;
		double nbGrainsTot = 1;
		System.out.println("Case 1 : 1 grain. Total : 1");
		for(int i = 2;i<=nbCases;i++) {
			nbGrainsCase+=nbGrainsCase;
			nbGrainsTot+=nbGrainsCase;
			System.out.println("Case " + nbGrainsCase + " : " + nbGrainsCase + " grains. Total : " +nbGrainsTot);
		}
	}

}
