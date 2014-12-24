
/**
 * Titre : Ebauche de traitement de texte<p>
 * Description : Code source du programme de traitement de texte présenté dans le cours JGFL {Juin 2000}<p>
 * Copyright : Copyright (c) Guillaume Florimond<p>
 * Société : JGFLsoft<p>
 * @author Guillaume Florimond
 * @version 1.0
 */
package texte;

import java.io.*;

public class Enregistrer {

  public Enregistrer() {
  }

  // la méthode a besoin d'un argument: le fichier de sortie
  public static void save(File fichier) {
    // d'éventuelles exceptions...
     try {
     // un String qui contient le texte du JTextPane de Cadre1 est créé
     String h = new String(Cadre1.jTextPane1.getText());
     // le fichier est créé
     FileWriter lu = new FileWriter(fichier);
     // mis en cache pour plus de rapidité et de fiabilité dans le transfert
     BufferedWriter out = new BufferedWriter(lu);
     // et on écrit le String dans le flux de sortie...
     out.write(h);
     // on ferme le flux, c'est terminé !
     out.close();
     // pour convertir le nom du fichier en String et l'afficher dans le barre d'état
      Cadre1.statusBar.setText("Fichier enregistré:  \" " + fichier.toString() + " \"");
     }catch (IOException er) {}
  }

}