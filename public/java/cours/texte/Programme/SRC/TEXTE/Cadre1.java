
/**
 * Titre : Ebauche de traitement de texte<p>
 * Description : Code source du programme de traitement de texte pr�sent� dans le cours JGFL {Juin 2000}<p>
 * Copyright : Copyright (c) Guillaume Florimond<p>
 * Soci�t� : JGFLsoft<p>
 * @author Guillaume Florimond
 * @version 1.0
 */


package texte;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Cadre1 extends JFrame {
  // cr�� automatiquement par JBuilder
  JPanel contentPane;
  // barre de menu
  JMenuBar menuBar1 = new JMenuBar();
  // un menu dans cette barre: FICHIER
  JMenu menuFile = new JMenu();
  JMenuItem menuFileExit = new JMenuItem();
  JMenu menuHelp = new JMenu();
  JMenuItem menuHelpAbout = new JMenuItem();
  // barre d'ic�nes...
  JToolBar toolBar = new JToolBar();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  // ic�nes de la barre d'ic�nes
  ImageIcon image1;
  ImageIcon image2;
  ImageIcon image3;
  // la barre d'�tat doit �tre statique: on y fait r�f�rence
  // dans les classes Ouvrir et Enregistrer
  public static JLabel statusBar = new JLabel();
  BorderLayout borderLayout1 = new BorderLayout();
  // panneau de d�filement associ� � notre JTextPane
  JScrollPane jScrollPane1 = new JScrollPane();
  public static JTextPane jTextPane1 = new JTextPane();
  JMenuItem jMenuItem1 = new JMenuItem();
  JMenuItem jMenuItem2 = new JMenuItem();
  JMenuItem jMenuItem3 = new JMenuItem();

  //Construire le cadre
  public Cadre1() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      // ex�cutre la m�thode jbInit()
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }


  public void ouvrir() {
  // cr�ation d'une bo�te de dialogue de choix de fichier
  JFileChooser filechoose = new JFileChooser();
  // r�pertoire courant (� l'ouverture) est celui d'exec. du programme
  filechoose.setCurrentDirectory(new File("."));
  // label du bouton de validation
  String approve = new String("OUVRIR");
  // si ce bouton est actionn�:
  int resultatEnregistrer = filechoose.showDialog(filechoose, approve);
  if (resultatEnregistrer == JFileChooser.APPROVE_OPTION) {
    Ouvrir.open(filechoose.getSelectedFile());
  }
  }

  public void enregistrer() {
  // cr�ation d'une bo�te de dialogue de choix de fichier
  JFileChooser filechoose = new JFileChooser();
  // r�pertoire courant (� l'ouverture) est celui d'exec. du programme
  filechoose.setCurrentDirectory(new File("."));
  // label du bouton de validation
  String approve = new String("ENREGISTRER");
  // si ce bouton est actionn�:
  int resultatEnregistrer = filechoose.showDialog(filechoose, approve);
  if (resultatEnregistrer == JFileChooser.APPROVE_OPTION) {
    Enregistrer.save(filechoose.getSelectedFile());
  }
  }


  //Initialiser le composant
  private void jbInit() throws Exception  {
    // quels fichiers repr�sentent ces ic�nes ?
    image1 = new ImageIcon(Cadre1.class.getResource("openFile.gif"));
    image2 = new ImageIcon(Cadre1.class.getResource("closeFile.gif"));
    image3 = new ImageIcon(Cadre1.class.getResource("help.gif"));
    // voir remarque dans le cours
    contentPane = (JPanel) this.getContentPane();
    // ajout d'un layout
    contentPane.setLayout(borderLayout1);
    // taille de la fen�tre
    this.setSize(new Dimension(400, 300));
    // titre de la fen�tre
    this.setTitle("Traitement de texte - Cours JGFL - ");
    // inscrit dans la barre d'�tat
    statusBar.setText(" ");
    // "caption" des menus
    menuFile.setText("Fichier");
    menuFileExit.setText("Quitter");
    // assigner un gestionnaire d'ev�nement...
    menuFileExit.addActionListener(new Cadre1_menuFileExit_ActionAdapter(this));
    menuHelp.setText("Aide");
    menuHelpAbout.setText("A propos");
    menuHelpAbout.addActionListener(new Cadre1_menuHelpAbout_ActionAdapter(this));
    jButton1.setIcon(image1);
    jButton1.addActionListener(new Cadre1_jButton1_actionAdapter(this));
    jButton1.setToolTipText("Ouvrir un fichier");
    jButton2.setIcon(image2);
    jButton2.addActionListener(new Cadre1_jButton2_actionAdapter(this));
    jButton2.setToolTipText("Fermer le fichier");
    jButton3.setIcon(image3);
    jButton3.addActionListener(new Cadre1_jButton3_actionAdapter(this));
    jButton3.setToolTipText("Aide");
    jMenuItem1.setText("Nouveau");
    jMenuItem1.addActionListener(new Cadre1_jMenuItem1_actionAdapter(this));
    jMenuItem3.setText("Ouvrir");
    jMenuItem3.addActionListener(new Cadre1_jMenuItem3_actionAdapter(this));
    jMenuItem2.setText("Enregistrer");
    jMenuItem2.addActionListener(new Cadre1_jMenuItem2_actionAdapter(this));
    // ajoutes ces composants � la barre d'ic�nes
    toolBar.add(jButton1);
    toolBar.add(jButton2);
    toolBar.add(jButton3);
    menuFile.add(jMenuItem1);
    menuFile.add(jMenuItem3);
    menuFile.add(jMenuItem2);
    menuFile.add(menuFileExit);
    menuHelp.add(menuHelpAbout);
    menuBar1.add(menuFile);
    menuBar1.add(menuHelp);
    this.setJMenuBar(menuBar1);
    contentPane.add(toolBar, BorderLayout.NORTH);
    contentPane.add(statusBar, BorderLayout.SOUTH);
    contentPane.add(jScrollPane1, BorderLayout.CENTER);
    // mettre notre JTextPane dans notre JScrollPane
    jScrollPane1.getViewport().add(jTextPane1, null);
  }

  //Op�ration Fichier | Quitter effectu�e
  public void fileExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  //Op�ration Aide | A propos effectu�e
  public void helpAbout_actionPerformed(ActionEvent e) {
    Cadre1_AboutBox dlg = new Cadre1_AboutBox(this);
    // pour centrer la fen�tre � l'�cran
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.show();
  }

  //Remplac�, ainsi nous pouvons sortir quand la fen�tre est ferm�e
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      // en cas de clic sur la croix (X) en haut � droite de la fen�tre (sous Win95)
      fileExit_actionPerformed(null);
    }
  }

  void jMenuItem1_actionPerformed(ActionEvent e) {
       // Cela ne correspond pas vraiment � un Fichier>Nouveau classique mais
       // plut�t � un effacement complet de l'�cran...
       jTextPane1.setText("");
  }

  void jMenuItem3_actionPerformed(ActionEvent e) {
       // appel de la m�thode ouvrir() quand ce gestionnaire d'�v�nement est appel�
       ouvrir();
  }

  void jMenuItem2_actionPerformed(ActionEvent e) {
       enregistrer();
  }

  void jButton1_actionPerformed(ActionEvent e) {
       ouvrir();
  }

  void jButton2_actionPerformed(ActionEvent e) {
       enregistrer();
  }

  void jButton3_actionPerformed(ActionEvent e) {
    Cadre1_AboutBox dlg = new Cadre1_AboutBox(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.show();
  }
}


// � partir de l�, vous n'aurez pas � �tudier le code dans les d�tails
class Cadre1_menuFileExit_ActionAdapter implements ActionListener {
  Cadre1 adaptee;

  Cadre1_menuFileExit_ActionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.fileExit_actionPerformed(e);
  }
}

class Cadre1_menuHelpAbout_ActionAdapter implements ActionListener {
  Cadre1 adaptee;

  Cadre1_menuHelpAbout_ActionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.helpAbout_actionPerformed(e);
  }
}

class Cadre1_jMenuItem1_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jMenuItem1_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem1_actionPerformed(e);
  }
}

class Cadre1_jMenuItem3_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jMenuItem3_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem3_actionPerformed(e);
  }
}

class Cadre1_jMenuItem2_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jMenuItem2_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem2_actionPerformed(e);
  }
}

class Cadre1_jButton1_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jButton1_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class Cadre1_jButton2_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jButton2_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class Cadre1_jButton3_actionAdapter implements java.awt.event.ActionListener {
  Cadre1 adaptee;

  Cadre1_jButton3_actionAdapter(Cadre1 adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}