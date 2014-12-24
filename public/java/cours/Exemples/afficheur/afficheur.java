// le programme comprend 2 classes regroup�es dans 1 package:
package afficheur;

// importation de packages n�cessaires
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

// d�but du programmes, la classe afficheur doit �tendre (extends) de JFrame
// pour d�finir un cadre Swing � l'�cran
public class afficheur extends JFrame {
  // Conteneur
  JPanel contentPane;
  // Layout
  BorderLayout borderLayout1 = new BorderLayout();
  // Composant 1 : le bouton
  JButton jButton1 = new JButton();
  // barres de d�filement pour le composant 2
  JScrollPane jScrollPane1 = new JScrollPane();
  // Composant 2 : la zone de texte
  JTextArea jTextArea1 = new JTextArea();
  JButton jButton2 = new JButton();

  //Construire le cadre
  public afficheur() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      // essayer d'ex�cuter le m�thode jbInit()
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
    // �couteur d'actions (fait partie du gertionnaire d'ev�nements)
    jButton1.addActionListener(new afficheur_jButton1_actionAdapter(this));
    // d�finission du conteneut courant
    contentPane = (JPanel) this.getContentPane();
    // assignation � ce conteneur d'un layout pr�cis
    contentPane.setLayout(borderLayout1);
    // taille de la fen�tre
    this.setSize(new Dimension(400, 300));
    // label de la fen�tre
    this.setTitle("Exemple pour les flux");
    // texte qui appara�t quand on laisse la souris immobile un certain temps
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





  //Remplac�, ainsi nous pouvons sortir quand la fen�tre est ferm�e
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      // pour fermer 'proprement' la fen�tre au clic sur la croix (sous Win95)
      System.exit(0);
    }
  }

  // gestionnaire d'ev�nements, 2nd partie
  void jButton1_actionPerformed(ActionEvent e) {
       // appeler cette m�thode
       charger();
  }

  // m�thode qui permet de prendre le texte dans la zone de texte et de le
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


  // ma m�thode qui permet de lire les informations du fichier 'fichier.txt'
  // et de les imprimer dans la zone de texte
  public void charger() {
    // les exceptions doivent �tre intercept�es ('catch�es')
      try {
         // Flux d'entr�e
         FileInputStream fis = new FileInputStream("fichier.txt");
         // nbre de caract�res dans le fichier
         int n;
         // tant que ce nombre de caract�res est sup�rieur � 0...
         while ((n = fis.available()) > 0) {
           // chaque caract�re associ� � 1 byte
           byte[] b = new byte[n];
           int result = fis.read(b);
           // fin du flux = plus rien � lire = sortie de la boucle
           if (result == -1) break;
           String s = new String(b);
           jTextArea1.setText(s);
         }
        } catch (IOException err) { System.out.println("Erreur: " + err);
    }


}
// classes pour la gestion d'�v�nements.
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