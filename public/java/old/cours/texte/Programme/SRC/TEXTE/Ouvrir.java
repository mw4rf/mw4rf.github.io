
/**
 * Titre : Ebauche de traitement de texte<p>
 * Description : Code source du programme de traitement de texte pr�sent� dans le cours JGFL {Juin 2000}<p>
 * Copyright : Copyright (c) Guillaume Florimond<p>
 * Soci�t� : JGFLsoft<p>
 * @author Guillaume Florimond
 * @version 1.0
 */
package texte;

import java.io.*;

public class Ouvrir {

  public Ouvrir() {
  }

  // On doit transmettre un argument � la m�thode: le nom du fichier � ouvrir
  public static void open(File fichier) {
    // intercepter une �ventuelle exception
    try {
      // ouvrir un flux d'entr�e sur le fichier donn� pour argument � la m�thode
      FileInputStream fis = new FileInputStream(fichier);
      int n;
      // tant qu'il reste des caract�res dans le fichier...
      while ((n = fis.available()) > 0) {
      // cr�er une matrice de bytes
      byte[] b = new byte[n];
      // lire le caract�re courant dans le flux
      int result = fis.read(b);
      // -1 indique que le dernier caract�re est atteint
      if (result == -1) break;
      String s = new String(b);
      // ins�rer le texte du String s dans le zone de texte de Cadre1
      Cadre1.jTextPane1.setText(s);
      // pour convertir le nom du fichier en String et l'afficher dans le barre d'�tat
      Cadre1.statusBar.setText("Fichier ouvert:  \" " + fichier.toString() + " \"");
      }
    } catch (IOException er) {}
  }
}