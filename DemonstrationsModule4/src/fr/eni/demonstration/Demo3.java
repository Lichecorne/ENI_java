package fr.eni.demonstration;

public class Demo3 {

	public static void main(String[] args) {
		int compteur = 1;
		
		while(compteur <= 5) {
			System.out.println("Bonjour");
			System.out.println(compteur);
			compteur++;
		}
		
		do {
			System.out.println("Bonjour");
			System.out.println(compteur);
			compteur++;
		}while(compteur <= 5);
		
		for(int i = 0;i <= 5;i++) {
			System.out.println("Bonjour");
			System.out.println(i);
		}
		
	}

}
