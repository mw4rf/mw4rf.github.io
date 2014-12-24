
class LeTest {
	public static void main(String args[]) {
		EssaiStatic.statique = "Bonjour";
		System.out.println(EssaiStatic.statique);
		
		/*Le code suivant provoquerait une erreur de compilation:
		EssaiStatic.nonStatique = "Bonjour";
		System.out.println(EssaiStatic.nonStatique);
		*/

	}
}