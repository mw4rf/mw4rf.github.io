class NamesLoop { // Création de la classe

     String[] firstNames = { "Dennis", "Grace", "Bjarne", "James" }; // matrice des 
										   //prénoms
     String[] lastNames = new String[firstNames.length]; //matrice des noms (vide)

     void printNames() { // méthode pour afficher
         for (int i = 0; i < firstNames.length; i++) // boucle for
             System.out.println(firstNames[i] + " " + lastNames[i]); //instruction 
         }

     public static void main (String arguments[]) {
		// remplissage de la seconde matrice avec les prénoms
		// appel de la méthode d'affichage
         NamesLoop a = new NamesLoop();
         a.printNames(); // méthode d'affichage
         System.out.println("-----");
         a.lastNames[0] = "Ritchie";
         a.lastNames[1] = "Hopper";
         a.lastNames[2] = "Stroustrup";
         a.lastNames[3] = "Gosling";

         a.printNames(); // méthode d'affichage
     }
 }