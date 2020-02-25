var myName = ['C', 'a', 'r', 'l', 'o', 's'];

document.write("Nom: " + myName + "<br><br>");

for (var i=0; i<myName.length; i++) {
	if ( myName[i]=='a' || myName[i]=='e' || myName[i]=='i' || myName[i]=='o' || myName[i]=='u' ||
			myName[i]=='A' || myName[i]=='E' || myName[i]=='I' || myName[i]=='O' || myName[i]=='U') {
		// print vowel message
		document.write("VOCAL<br>");
	} else if ( myName[i]=='0' || myName[i]=='1' || myName[i]=='2' || myName[i]=='3' || myName[i]=='4' ||
			myName[i]=='5' || myName[i]=='6' || myName[i]=='7' || myName[i]=='8' || myName[i]=='9') {
		// print number message
		document.write("Els noms de persones no contenen números!<br>");
	} else {
		// print consonant message
		document.write("CONSONTANT<br>");
	}	
}	


