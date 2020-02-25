var myName = ['C', 'a', 'r', 'l', 'o', 's'];

/*
for (var i=0; i<name.length; i++) {
	if ( name[i]=='a' || name[i]=='e' || name[i]=='i' || name[i]=='o' || name[i]=='u' ||
			name[i]=='A' || name[i]=='E' || name[i]=='I' || name[i]=='O' || name[i]=='U') {
		// print vowel message
		document.write("VOCAL<br>");
	} else if ( name[i]=='0' || name[i]=='1' || name[i]=='2' || name[i]=='3' || name[i]=='4' ||
			name[i]=='5' || name[i]=='6' || name[i]=='7' || name[i]=='8' || name[i]=='9') {
		// print number message
		document.write("Els noms de persones no contenen números!<br>");
	} else {
		// print consonant message
		document.write("CONSONTANT<br>");
	}	
}	
*/

var surname = ['G','a','r','c','í','a'];

var fullName = myName.concat(' ').concat(surname);

document.write("Llista directa(var fullName): " + fullName);
document.write("<br>Llista iterada amb for: ");

for (var i=0;i<fullName.length;i++) document.write(fullName[i]);
