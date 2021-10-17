package fr.eni.tp;

public class TP6Mod7 {

	public static void affichage(String[] tableau) {
		System.out.println("Affichage du contenu du tableau :");
		for (String element : tableau) {
			System.out.println(element);
		}
	}

	public static void affLettre(String[] tableau, char lettre) {
		System.out.println("Affichage des villes commençant par un " + lettre);
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i].charAt(0) == lettre) {
				System.out.println(tableau[i]);
			}
		}
	}

	public static void modifTab(String[] tableau) {
		System.out.println("Affichage des villes avec un nombre derrière");
		for (int i = 0; i < tableau.length; i++) {
			String nombre = String.valueOf((int) (Math.random() * 10));
			tableau[i] += nombre;
			System.out.println(tableau[i]);
		}
	}

	public static void main(String[] args) {
		String[] tableau = { "Lille", "Lens", "Amiens", "Rouen", "Caen", "Rennes", "Nantes", "Niort", "Bordeaux",
				"Bayonne" };

		// affichage du contenu du tableau
		affichage(tableau);

		// affichage des villes commençant par la lettre A (possible de modifier la
		// lettre avec la variable "lettre")
		char lettre = 'A';
		affLettre(tableau, lettre);

		// modification du contenu avec l'ajout d'un numéro aléatoire entre 1 et 10 puis
		// affichage du tableau
		modifTab(tableau);

	}

}
