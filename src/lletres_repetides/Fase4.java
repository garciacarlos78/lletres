package lletres_repetides;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fase4 {

	public static void main(String[] args) {

		List<Character> name = Arrays.asList('C', 'a', 'r', 'l', 'o', 's');

		Map<Character, Integer> nameMap = new HashMap();

		for (Character c : name) {

			// La lletra és vocal
			if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
					c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				// print vowel message
				// System.out.println("VOCAL");

				// Afegeix al mapa o incrementa el seu valor
				if (nameMap.get(c) == null) nameMap.put(c,  1);
				else nameMap.replace(c, nameMap.get(c)+1);

			// És número
			} else if ( c=='0' || c=='1' || c=='2' || c=='3' || c=='4' ||
					c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
				// print number message
				// System.out.println("Els noms de persones no contenen números!");

			// La lletra és consonant
			} else {
				// print consonant message
				// System.out.println("CONSONTANT");

				// Afegeix al mapa				
				if (nameMap.get(c) == null) nameMap.put(c,  1);
				else nameMap.replace(c, nameMap.get(c)+1);
			}
		}
		
		List<Character> surname = Arrays.asList('G','a','r','c','í','a');
		
		List<Character> fullName = new ArrayList<Character>(name);
		
		fullName.add(' ');
		
		fullName.addAll(surname);
	}
}
