package fr.eni.demonstration;

public class Demo2 {

	public static void main(String[] args) {
		
		int uneValeur = 223;
		
		/*if(uneValeur == 444)
		{
			System.out.println("La variable est égale à 444");
		}
		else if(uneValeur > 444)
		{
			System.out.println("La variable est supérieure à 444");
		}
		else {
			System.out.println("La variable est inférieure à 444");
		}*/
		
		switch(uneValeur)
		{
			case 222 : System.out.println("222");break;
			case 333 : System.out.println("333");break;
			case 444 : System.out.println("444");break;
			case 555 : System.out.println("555");break;
			default : System.out.println("default");
		}
		

	}

}
