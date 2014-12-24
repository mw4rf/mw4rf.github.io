
import java.awt.*;
import com.borland.jbcl.layout.*;
import java.util.*;
import javax.swing.*;

public class Horloge extends JFrame implements Runnable {
  XYLayout xYLayout1 = new XYLayout();
  Date date = new Date();
  JLabel jLabel1 = new JLabel();
	
	// C'est un objet THREAD (initialisé dans la méthode start()).
	Thread thread;
  
  public Horloge() {

    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

	// méthode par défaut de JBuilder pour l'interface graphique
	private void jbInit() throws Exception {
    jLabel1.setText("Lancé depuis: ");
    this.getContentPane().setLayout(xYLayout1);
    xYLayout1.setWidth(415);
    xYLayout1.setHeight(41);
    this.setSize(400, 70);
    this.setResizable(false);
    this.setVisible(true);
    this.getContentPane().setBackground(Color.lightGray);
    this.show();
    start();
    run();
    this.getContentPane().add(jLabel1, new XYConstraints(8, 8, 402, 23));
  }

	
 // méthode START du thread: créer un nouveau thrad et le lancer
 public void start() {
  if (thread == null) {
    thread = new Thread(this);
  }
  thread.start();
 }

	// ce que le thread doit faire durant son exécution:
 public void run() {
 	/* on peut avoir plusieurs threads dans une même classe et 1 seule 
 	   méthode run(), on doit donc savoir si le thread qui nous concerne
   	 est actif (si il est le thread "courant"). */
   while(Thread.currentThread() == thread) {
   	// les threads sont susceptibles de générer des exceptions
     try {
     	/*Vous remarquerez que le boucle for ne spécifie pas de valeur
     	à tester por savoir si elle doir continuer ou s'arrêter: sans 
     	valeur spécifique, la boucle ne s'arrête jamais */
       for(int i = 0;; i++) {
       	// rafraîchir l'écran
       repaint();
       	// attendre 1 seconde ou 1000 ms
       Thread.sleep(1000);
       	// tanta que i est inférieur à 60, on ne s'occupe que des secondes
       if (i < 60) {
       jLabel1.setText("Lancé depuis: " + i +" secondes");
       }
       	// quand i est entre 1 et 2 minutes, le mot "minute doir être au singulier"
       else if (i > 60 && i < 120) {
       jLabel1.setText("Lancé depuis: " + i/60 + " minute, soit " + i +" secondes");
       }
        // ensuite, on s'occupe des minutes normalement
       else if (i > 120 && i < 3600) {
       jLabel1.setText("Lancé depuis: " + i/60 + " minutes, soit " + i +" secondes");
       }
       	// "heure" au singulier entre 1 et 2 heures
       else if (i > 3600 && i < 7200) {
       jLabel1.setText("Lancé depuis: " + i/3600 + " heure " + i/60 + " minutes, soit " + i +" secondes");
       }
       	// ensuite "heures" au pluriel et en "triatement normal"
       else if (i > 7200) {
       jLabel1.setText("Lancé depuis: " + i/3600 + " heures " + i/60 + " minutes, soit " + i +" secondes");
       }
       }
      }catch(Exception err) {}
    }
   }
   public static void main(String[] args) {
   	// lancer le constructeur de la classe
     new Horloge();
   }
  }