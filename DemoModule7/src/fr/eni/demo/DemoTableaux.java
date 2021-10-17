package fr.eni.demo;

import java.util.Arrays;

public class DemoTableaux {

	public static void main(String[] args) {
		
		int[] tab;
		
		tab = new int[10];
		
		//Arrays.fill(tab, 6);
		
		for(int i=0;i<tab.length;i++) {
			tab[i] = (int)(Math.random()*100);
		}
		
		Arrays.sort(tab);
		
		System.out.println(Arrays.toString(tab));
		
		int[] tab2 = {4,8,1};
		
		Arrays.sort(tab2);
		
		System.out.println(Arrays.toString(tab2));
		
		System.out.println(Arrays.binarySearch(tab2, 8));
		
		
		int[] tab3 = Arrays.copyOf(tab2, tab2.length + 3);
		
		System.out.println(Arrays.toString(tab3));
		
		int[] tab4 = Arrays.copyOfRange(tab3, 2, tab3.length);
		
		System.out.println(Arrays.toString(tab4));
		
		int[][] matrice = new int[5][];
		matrice[0] = new int[6];
		matrice[1] = tab;
		matrice[2] = tab2;
		matrice[3] = tab3;
		matrice[4] = tab4;
		
		for(int[] element : matrice) {
		System.out.println(Arrays.toString(element));
		}

	}

}
