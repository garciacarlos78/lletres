var myName = ['C', 'a', 'a', 'r', 'l', 'o', 's'];

var mapa = new Map();

document.write("Nom: " + myName + "<br><br>");

for (var i=0; i<myName.length; i++) {
	// Comprobamos que no se trate de un número
	if ( myName[i]!='0' && myName[i]!='1' || myName[i]!='2' || myName[i]!='3' || myName[i]!='4' ||
			myName[i]!='5' || myName[i]!='6' || myName[i]!='7' || myName[i]!='8' || myName[i]!='9') {
		
		if (mapa.get(myName[i]) == undefined) mapa.set(myName[i],1);
		else mapa.set(myName[i],mapa.get(myName[i])+1);	
	}
}	

// Comprobamos que el mapa se ha rellenado correctamente
for (var i=0; i<myName.length; i++) {
	document.write("Mapa["+myName[i]+"]: " + mapa.get(myName[i])+"<br>");
}



