package serializador;

import javax.swing.UIManager;

public class RUN {
  boolean packFrame = false;

  //Construire l'application
  public RUN() {
    INTERFACE frame = new INTERFACE();
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
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new RUN();
  }
}