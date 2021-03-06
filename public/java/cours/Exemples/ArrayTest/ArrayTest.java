class ArrayTest { // classe principale
     
     // cr�ation de la premi�re matrice de pr�noms
     String[] firstNames = { "Dennis", "Grace", "Bjarne", "James" };
     
     // la seconde matrice contient le m�me nombre d'arguments que la premi�re
     String[] lastNames = new String[firstNames.length];

     void printNames() { // m�thode pour afficher le contenu de la 2nd matrice
         int i = 0; // i du type integer et �gal � 0
         
         // afficher la valeur i+0=0 de la matrice 1 et de la matrice 2
         // ceci consiste donc � afficher le contenu de la premi�re case 
         //des 2 matrices
         System.out.println(firstNames[i]
             + " " + lastNames[i]); 
             
         // (i=0)i=i+1, donc de la seconde case des matrices    
         i++;
         System.out.println(firstNames[i]
             + " " + lastNames[i]);
         // (1=1) 1=1+2, donc de la seconde case des matrices    
         i++;
         System.out.println(firstNames[i]
             + " " + lastNames[i]);
         i++;
         System.out.println(firstNames[i]
             + " " + lastNames[i]);
     }

     public static void main (String arguments[]) {
         ArrayTest a = new ArrayTest(); // appel de la classe
         a.printNames(); // applet de la m�thode printNames()
         System.out.println("-----");
         // d�finition des valeurs des cases de la 2nd matrice
         a.lastNames[0] = "Richie"; 
         a.lastNames[1] = "Hopper";
         a.lastNames[2] = "Stroustrup";
         a.lastNames[3] = "Gosling";
         a.printNames(); // appel de la m�thode printNames()
     }
 }