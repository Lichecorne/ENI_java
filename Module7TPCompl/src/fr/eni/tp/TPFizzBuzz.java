package fr.eni.tp;

/*
 Le FizzBuzz est un jeu connu.
Le jeu travaille sur une plage allant de 1 à n.
si le nombre est divisible par 3 : on écrit Fizz.
Si le nombre est divisible par 5 : on écrit Buzz.
Si le nombre est divisible par 3 et par 5 : on écrit Fizzbuzz.
Sinon : on écrit le nombre
 */
import java.util.Scanner;

public class TPFizzBuzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//choix limite
		int limite = choixLimite(scan);
		
		for(int i=1;i<=limite;i++) {
			//vérif divisible par 3
			boolean div3 = div3(i);
			
			//vérif divisible par 5
			boolean div5 = div5(i);
			
			//écriture résultat
			if (div3) {
				System.out.print("Fizz");
			}
			if (div5) {
				System.out.print("Buzz");
			}
			if (!div3 && !div5) {
				System.out.print(String.valueOf(i));
			}
			System.out.println("");
		}
		
		
		scan.close();

	}

	private static boolean div3(int i) {
		return i % 3 == 0;
	}
	
	private static boolean div5(int i) {
		return i % 5 == 0;
	}

	private static int choixLimite(Scanner scan) {
		System.out.println("Choisissez la limite de jeu");
		int limite;
		do {
			limite = scan.nextInt();
		} while (limite <= 0);
		return limite;
	}

}
