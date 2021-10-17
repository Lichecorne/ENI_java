package fr.eni.demo;

public class DemoConversions {

	public static void main(String[] args) {
		
		//conversion sans perte d'information
		byte unByte = 100;
		short unShort = unByte;
		
		//conversion avec perte d'information possible
		double unDouble = 10.25;
		float unFloat = (float)unDouble;
		float unFloat2 = 8.5f; 				//par défaut, le nombre 8.5 est considéré comme un double par le compilateur
											//donc on met f (ou F) à la fin pour indiquer qu'il s'agit d'un float -> équivalent au cast
		
		//Wrapper
		String uneString = "10";
		double stDouble = Double.parseDouble(uneString);
		int stInt = Integer.parseInt(uneString);
		float stFloat = Float.parseFloat(uneString);
		
		

	}

}
