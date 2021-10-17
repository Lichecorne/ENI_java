package fr.eni.tp;

public class TP3Mod7 {

	public static void main(String[] args) {
		long temps = System.currentTimeMillis();
		String ligne = "1";
		StringBuilder ligneSuiv = new StringBuilder();
		System.out.println(ligne);
		for(int j=1;j<25;j++) {
			ligneSuiv = new StringBuilder();
			char chiffre = ligne.charAt(0);
			int i = 0;
			do {
				int cpt = 1;
				while(i<ligne.length()-1 && ligne.charAt(i+1) == chiffre) {
					cpt++;
					i++;
				}
				ligneSuiv.append(cpt).append(chiffre);
				
				i++;
				if(i<ligne.length()) {
					chiffre = ligne.charAt(i);
				}
				
			} while(i<ligne.length());
			System.out.println(ligneSuiv);
			ligne = ligneSuiv.toString();
		}
		
		System.out.println(System.currentTimeMillis() - temps + " ms");
	}

}
