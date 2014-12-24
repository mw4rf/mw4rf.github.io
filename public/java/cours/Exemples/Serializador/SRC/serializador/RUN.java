package serializador;

import javax.swing.UIManager;

public class RUN {
  boolean packFrame = false;

  //Construire l'application
  public RUN() {
    INTERFACE frame = new INTERFACE();
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
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new RUN();
  }
}