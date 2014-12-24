// le programme comprend 2 classes regroupées dans 1 package:
package afficheur;

// importation de packages nécessaires
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

// début du programmes, la classe afficheur doit étendre (extends) de JFrame
// pour définir un cadre Swing à l'écran
public class afficheur extends JFrame {
  // Conteneur
  JPanel contentPane;
  // Layout
  BorderLayout borderLayout1 = new BorderLayout();
  // Composant 1 : le bouton
  JButton jButton1 = new JButton();
  // barres de défilement pour le composant 2
  JScrollPane jScrollPane1 = new JScrollPane();
  // Composant 2 : la zone de texte
  JTextArea jTextArea1 = new JTextArea();
  JButton jButton2 = new JButton();

  //Construire le cadre
  public afficheur() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      // essayer d'exécuter le méthode jbInit()
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Initialiser le composant
  private void jbInit() throws Exception  {
    // texte du bouton
    jButton1.setText("Charger");
    // écouteur d'actions (fait partie du gertionnaire d'evènements)
    jButton1.addActionListener(new afficheur_jButton1_actionAdapter(this));
    // définission du conteneut courant
    contentPane = (JPanel) this.getContentPane();
    // assignation à ce conteneur d'un layout précis
    contentPane.setLayout(borderLayout1);
    // taille de la fenêtre
    this.setSize(new Dimension(400, 300));
    // label de la fenêtre
    this.setTitle("Exemple pour les flux");
    // texte qui apparaît quand on laisse la souris immobile un certain temps
    // su la zone de texte
    jTextArea1.setToolTipText("Exemple d'un chapitre de JGFL");
    // ajout des composants
    jButton2.setText("Enregistrer");
    jButton2.addActionListener(new afficheur_jButton2_actionAdapter(this));
    contentPane.add(jButton1, BorderLayout.SOUTH);
    contentPane.add(jScrollPane1, BorderLayout.CENTER);
    contentPane.add(jButton2, BorderLayout.NORTH);
    jScrollPane1.getViewport().add(jTextArea1, null);
  }





  //Remplacé, ainsi nous pouvons sortir quand la fenêtre est fermée
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      // pour fermer 'proprement' la fenêtre au clic sur la croix (sous Win95)
      System.exit(0);
    }
  }

  // gestionnaire d'evènements, 2nd partie
  void jButton1_actionPerformed(ActionEvent e) {
       // appeler cette méthode
       charger();
  }

  // méthode qui permet de prendre le texte dans la zone de texte et de le
  // transmettre au FileWriter
  public void enregistrer() {
  try {
     String texte = new String(jTextArea1.getText());
     FileWriter lu = new FileWriter("fichier.txt");
     BufferedWriter out = new BufferedWriter(lu);
     out.write(texte);
     out.close();
  } catch (Exception err) {;}
  }


  // ma méthode qui permet de lire les informations du fichier 'fichier.txt'
  // et de les imprimer dans la zone de texte
  public void charger() {
    // les exceptions doivent être interceptées ('catchées')
      try {
         // Flux d'entrée
         FileInputStream fis = new FileInputStream("fichier.txt");
         // nbre de caractères dans le fichier
         int n;
         // tant que ce nombre de caractères est supérieur à 0...
         while ((n = fis.available()) > 0) {
           // chaque caractère associé à 1 byte
           byte[] b = new byte[n];
           int result = fis.read(b);
           // fin du flux = plus rien à lire = sortie de la boucle
           if (result == -1) break;
           String s = new String(b);
           jTextArea1.setText(s);
         }
        } catch (IOException err) { System.out.println("Erreur: " + err);
    }


}
// classes pour la gestion d'évènements.
class afficheur_jButton1_actionAdapter implements java.awt.event.ActionListener {
  afficheur adaptee;

  afficheur_jButton1_actionAdapter(afficheur adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

  void jButton2_actionPerformed(ActionEvent e) {
       enregistrer();
  }
}

class afficheur_jButton2_actionAdapter implements java.awt.event.ActionListener {
  afficheur adaptee;

  afficheur_jButton2_actionAdapter(afficheur adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}