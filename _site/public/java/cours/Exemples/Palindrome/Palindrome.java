import java.awt.Graphics; //importation de la classe qui gère les graphismes
import java.awt.Font; // "" qui gère les polices
import java.awt.Color; // "" qui gère les couleurs

public class Palindrome extends java.applet.Applet { // c'est une applet !
	Font f =new Font("TimesRoman", Font.BOLD, 36); // définition de la police f
	String palindrome; // déclaration de la chaîne "palindrome"
	
	public void paint(Graphics screen) { // méthode qui servira à fixer les paramètres d'affichage
		screen.setFont(f); // attribuer la police f à tous els textes de l'applet
		screen.setColor(Color.red); // "" la couleur rouge
		screen.drawString(palindrome, 5, 50); // écrire le texte contenu dans palindrome aux coordonnées ...
	}
	
	public void init() { // équivalent de main() dans les applications: le prog débute
		palindrome = getParameter("palindrome"); // on récupère le paramètre
		if ( palindrome == null) // s'il n'y en a pas ...
			palindrome = "Bonjour !"; // ... afficher ceci
	}
}	