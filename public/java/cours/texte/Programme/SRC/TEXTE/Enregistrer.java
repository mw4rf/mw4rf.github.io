
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

public class Enregistrer {

  public Enregistrer() {
  }

  // la m�thode a besoin d'un argument: le fichier de sortie
  public static void save(File fichier) {
    // d'�ventuelles exceptions...
     try {
     // un String qui contient le texte du JTextPane de Cadre1 est cr��
     String h = new String(Cadre1.jTextPane1.getText());
     // le fichier est cr��
     FileWriter lu = new FileWriter(fichier);
     // mis en cache pour plus de rapidit� et de fiabilit� dans le transfert
     BufferedWriter out = new BufferedWriter(lu);
     // et on �crit le String dans le flux de sortie...
     out.write(h);
     // on ferme le flux, c'est termin� !
     out.close();
     // pour convertir le nom du fichier en String et l'afficher dans le barre d'�tat
      Cadre1.statusBar.setText("Fichier enregistr�:  \" " + fichier.toString() + " \"");
     }catch (IOException er) {}
  }

}