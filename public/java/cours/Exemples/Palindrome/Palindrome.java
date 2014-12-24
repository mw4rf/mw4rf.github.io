import java.awt.Graphics; //importation de la classe qui g�re les graphismes
import java.awt.Font; // "" qui g�re les polices
import java.awt.Color; // "" qui g�re les couleurs

public class Palindrome extends java.applet.Applet { // c'est une applet !
	Font f =new Font("TimesRoman", Font.BOLD, 36); // d�finition de la police f
	String palindrome; // d�claration de la cha�ne "palindrome"
	
	public void paint(Graphics screen) { // m�thode qui servira � fixer les param�tres d'affichage
		screen.setFont(f); // attribuer la police f � tous els textes de l'applet
		screen.setColor(Color.red); // "" la couleur rouge
		screen.drawString(palindrome, 5, 50); // �crire le texte contenu dans palindrome aux coordonn�es ...
	}
	
	public void init() { // �quivalent de main() dans les applications: le prog d�bute
		palindrome = getParameter("palindrome"); // on r�cup�re le param�tre
		if ( palindrome == null) // s'il n'y en a pas ...
			palindrome = "Bonjour !"; // ... afficher ceci
	}
}	