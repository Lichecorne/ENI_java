package ft.eni.cours;

public class Cours1210 {

	public static void main(String[] args) {
		
		// Visibilité :
		// public : visible partout
		// private : limitée la vue à la classe
		// protected : limitée la vue à la classe, visible dans les classes dérivées et
		// dans le package
		// (defaut) : visibilité package

		// static : Revu lors de la POO (Programmation Orientée Objet)

		// void : méthode (procédure) qui ne renvoie rien

		// Types primitifs et des wrappers

		// primitifs
		int i = 10;
		float f = 10.5f;
		double d;
		byte b;
		short s;
		boolean boo;
		char c;
		long l;

		// wrappers :
		Integer i1 = 10;
		Float f1;
		Double d1;
		Byte b1;
		Short s1;
		Boolean boo1;
		Character c1;
		Long l1;

		String chaine = "Bonjour";
		chaine.toUpperCase();

		// Cast
		// int --> String
		String nombre = String.valueOf(10);
		System.out.println(nombre);

		// String --> int
		int nombre2 = Integer.parseInt("20");
		System.out.println(nombre2);
		

	}

}
