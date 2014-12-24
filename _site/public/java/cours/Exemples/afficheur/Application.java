package afficheur;

import javax.swing.UIManager;

public class Application {
  boolean packFrame = false;

  //Construire l'application
  public Application() {
    // appel � la classe 'afficheur'
    afficheur frame = new afficheur();
    //Valider les cadres ayant des tailles pr�d�finies
    //Compacter les cadres ayant des infos de taille pr�f�r�es - ex. depuis leur disposition
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    frame.setVisible(true);
  }

  //M�thode principale
  public static void main(String[] args) {
    try {
      // pour l'apparence 'Windows'
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new Application();
  }
}