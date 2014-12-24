class Chocos { // début du programme
	static String mangeur = "Gargantua"; // cette variable est statique. portée = tout le programme
	
	
	public static void main(String args[]) { // dévut de la méthode main()
		
		int nombreDeChocolats = 40; // cette variable est non-statique. portée = ce bloc main()
		
		System.out.println(mangeur + " a " + nombreDeChocolats + " chocolats"); // affichage
		System.out.println("Il en mange 3 d'un coup");
		
		nombreDeChocolats = nombreDeChocolats - 3; // opération de changement de la valeur de la variable
		System.out.println("Il en reste:"+nombreDeChocolats);
		System.out.println("Il renverse la boite, 15 sont perdus");
		
		nombreDeChocolats = nombreDeChocolats - 15;
		System.out.println("Il en reste:"+nombreDeChocolats);
		System.out.println("Pour se venger," + mangeur + " finit la boite");
		
		nombreDeChocolats = nombreDeChocolats - 22;
		System.out.println("Il en reste:"+nombreDeChocolats);
		System.out.println("Mais " + mangeur + " a encore une boite...");
	}
}	