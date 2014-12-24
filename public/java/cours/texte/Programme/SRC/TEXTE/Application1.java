
/**
 * Titre : Ebauche de traitement de texte<p>
 * Description : Code source du programme de traitement de texte pr�sent� dans le cours JGFL {Juin 2000}<p>
 * Copyright : Copyright (c) Guillaume Florimond<p>
 * Soci�t� : JGFLsoft<p>
 * @author Guillaume Florimond
 * @version 1.0
 */
package texte;

import javax.swing.UIManager;
import java.awt.*;

public class Application1 {
  boolean packFrame = false;

  //Construire l'application
  public Application1() {
    Cadre1 frame = new Cadre1();
    //Valider les cadres ayant des tailles pr�d�finies
    //Compacter les cadres ayant des infos de taille pr�f�r�es - ex. depuis leur disposition
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    //Centrer la fen�tre
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = frame.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    frame.setVisible(true);
  }

  //M�thode principale
  public static void main(String[] args) {
    /*
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    new Application1();
  }
}