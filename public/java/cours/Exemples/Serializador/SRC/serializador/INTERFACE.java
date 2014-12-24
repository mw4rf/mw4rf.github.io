package serializador;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;

public class INTERFACE extends JFrame {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  XYLayout xYLayout1 = new XYLayout();
  JTextField jTextField1 = new JTextField();
  JLabel jLabel1 = new JLabel();
  JProgressBar jProgressBar1 = new JProgressBar();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JButton jButton1 = new JButton();

  //Construire le cadre
  // constructeur de la classe
  public INTERFACE() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }


  /**
   * Cette m�thode permet de s�rialiser, d'enregistrer, dans le fichier
   * Serializador.dat l'Integer qui lui est transmis.
   */
  public void serialize(Integer i) {
    try {
     FileOutputStream fos = new FileOutputStream("Serializador.dat");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(i);
     oos.close();
    }catch(IOException ioe) {jTextField1.setText("Erreur" + ioe);}
  }

  /**
   * Cette m�thode permet de lire dans le fichier Serializador.dat un Integer,
   * en l'occurence celui �crit par serialize(Integer i) et de le renvoyer gr�ce
   * � return sous forme int (type de base).
   */
  public int deserialize() {
    int i = 0;
    try {
     FileInputStream fis = new FileInputStream("Serializador.dat");
     ObjectInputStream ois = new ObjectInputStream(fis);
     Integer integ = (Integer)ois.readObject();
     i = integ.intValue();
     ois.close();
    }catch(Exception err) {jTextField1.setText("Erreur" + err);}
   return i;
  }

  /**
   * Cette m�thode permet de prendre une cha�ne de texte dans notre zone de texte,
   * de la convertir en Integer et, si elle est comprise entre 0 et 100, de la
   * transmettre comme argument � la m�thode serialize(Integer i)
   */
  public void prendreValeur() {
    Integer integ = new Integer(jTextField1.getText());
    if((integ.intValue() < 100) && (integ.intValue() > 0))
    serialize(integ);
  }

  /**
   * Cette m�thode permet de d�finir la valeur i de type int renvoy�e par
   * deserialize() comme valeur de notre barre de progression
   */
  public void mettreValeur() {
    jProgressBar1.setValue(deserialize());

  }





  //Initialiser le composant
  private void jbInit() throws Exception  {
    // le premier panneau
    contentPane = (JPanel) this.getContentPane();
    // son layout
    contentPane.setLayout(borderLayout1);
    // la taille de la fen�tre(this)
    this.setSize(new Dimension(273, 290));
    // son titre
    this.setTitle("Serializador -- Exemple du chapitre sur le S�rialisation de JGFLsoft");
    /* le layout du panneua sur lequel on va travailler.
     * ATTENTION: ce layout n'est pas disponible avec Java2, il vient du
     * package con.borland.jbcl.layout.XYLayout
     * si vous avez install� JBuilder Foundation (gratuit et le meilleur IDE)
     * vous l'avez par d�faut !
    */
    jPanel1.setLayout(xYLayout1);
    jLabel1.setText("Entrez une valeur entre 0 et 100:");
    jLabel2.setText("Cette valeur correnspondra au niveau");
    jLabel3.setText("de remplissage de la barre di-desous:");
    jButton1.setText("ACTION:");

    /*
    * Gestionnaire d'�v�nement du bouton jButton1 qui ex�cute les m�thodes
    * prendreValeur() et mettreValeur() lors d'une action sur ce bouton
    */
    jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(ActionEvent e) {
     prendreValeur();
     mettreValeur();
      }
    });

    // l'indicateur n% est affich�
    jProgressBar1.setStringPainted(true);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    // ajout des conposants aux coordonn�es:
    // X coin sup�rieur gauche
    // Y coin sup�rieur gauche
    // largeur
    // hauteur
    jPanel1.add(jTextField1, new XYConstraints(28, 61, 212, 31));
    jPanel1.add(jLabel1, new XYConstraints(27, 30, 214, 19));
    jPanel1.add(jLabel2, new XYConstraints(27, 112, 214, 19));
    jPanel1.add(jProgressBar1, new XYConstraints(28, 156, 212, 31));
    jPanel1.add(jLabel3, new XYConstraints(27, 133, 214, 19));
    jPanel1.add(jButton1, new XYConstraints(80, 219, 100, 29));
  }

  //Remplac�, ainsi nous pouvons sortir quand la fen�tre est ferm�e
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

}