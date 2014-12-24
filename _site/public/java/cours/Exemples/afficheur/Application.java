package afficheur;

import javax.swing.UIManager;

public class Application {
  boolean packFrame = false;

  //Construire l'application
  public Application() {
    // appel à la classe 'afficheur'
    afficheur frame = new afficheur();
    //Valider les cadres ayant des tailles prédéfinies
    //Compacter les cadres ayant des infos de taille préférées - ex. depuis leur disposition
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    frame.setVisible(true);
  }

  //Méthode principale
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