package lletres_repetides;

import java.util.Arrays;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		
		List<Character> name = Arrays.asList('C', 'a', 'r', 'l', 'o', 's');
		
		for (Character c : name) {
			if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
					c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				// print vowel message
				System.out.println("VOCAL");
			} else if ( c=='0' || c=='1' || c=='2' || c=='3' || c=='4' ||
					c=='5' || c=='6' || c=='7' || c=='8' || c=='9') {
				// print number message
				System.out.println("Els noms de persones no contenen números!");
			} else {
				// print consonant message
				System.out.println("CONSONTANT");
			}
		}
	}
}
