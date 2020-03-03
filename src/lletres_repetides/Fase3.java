package lletres_repetides;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase3 {

	public static void main(String[] args) {

		List<Character> name = Arrays.asList('C', 'a', 'r', 'l', 'o', 's', 's');

		Map<Character, Integer> nameMap = new HashMap();

		for (Character c : name) {

			// La lletra �s vocal
			if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
					c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				// print vowel message
				// System.out.println("VOCAL");

				// Afegeix al mapa o incrementa el seu valor
				if (nameMap.get(c) == null) nameMap.put(c,  1);
				else nameMap.replace(c, nameMap.get(c)+1);

			// �s n�mero
			} else if ( c=='0' || c=='1' || c=='2' || c=='3' || c=='4' ||
					c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
				// print number message
				// System.out.println("Els noms de persones no contenen números!");

			// La lletra �s consonant
			} else {
				// print consonant message
				// System.out.println("CONSONTANT");

				// Afegeix al mapa				
				if (nameMap.get(c) == null) nameMap.put(c,  1);
				else nameMap.replace(c, nameMap.get(c)+1);
			}
		}
		
		System.out.println("Nom introduït: " + name.toString());
		System.out.println("Contingut del mapa: " + nameMap.toString());
	}
}
