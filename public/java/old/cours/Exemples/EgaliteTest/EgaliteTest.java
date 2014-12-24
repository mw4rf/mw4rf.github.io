class EgaliteTest {
	public static void main(String args[]){
		String str1, str2; // 2 objets de type String
		str1 = "Voila un exemple !"; // valeur du premier
		
		str2 = str1; // le second est le premier
		
		System.out.println("Chaine 1 " + str1);
		System.out.println("Chaine 2 " + str2);
		System.out.println("Meme objet ? " + (str1 == str2));
		
		// on re-crée le second objet
		str2 = new String(str1); // le second a la valeur du premier
		
		System.out.println("Chaine 1 " + str1);
		System.out.println("Chaine 2 " + str2);
		System.out.println("Meme objet ? " + (str1 == str2));
		System.out.println("Meme valeur ? " + str1.equals(str2));
	}
}	
		