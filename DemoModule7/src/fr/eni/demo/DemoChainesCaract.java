package fr.eni.demo;

import java.util.Arrays;

public class DemoChainesCaract {

	public static void main(String[] args) {
		
		String ch1 = "une chaine";
		String ch2 = new String("encore une chaine");		//revient au même que la déclaration de ch1 - peu utilisé
		
		char[] tab1 = new char[5];
		char[] tab2 = {'M','A','R','D','I'};
		
		System.out.println("chaine 1 : " + ch1);
		System.out.println("chaine 2 : " + ch2);
		
		System.out.println("tab 2 : " + Arrays.toString(tab2)); // ne convertit pas le tableau en chaine de caractères
		
		String ch5 = new String(tab2);							// permet de convertir un tableau en chaine de caractères
		
		System.out.println("tab 2 dans chaine 5 : " + ch5);
		
		String ch7 = "azerty";
		String ch8 = "AZERTY";
		
		System.out.println(ch7.equals(ch8));				//equals compare 2 chaines mais prend en compte la casse (min/maj)
		System.out.println(ch7.equalsIgnoreCase(ch8));		//equalsIgnoreCast compare 2 chaines en ignorant la casse
		
		String ch9 = ch8.toLowerCase();						//transforme une chaine en la mettant en minuscule	
		
		System.out.println(ch7.equals(ch8.toLowerCase()));	//peut être utilisé directement dans un affichage sans créer de fonction

	}

}
