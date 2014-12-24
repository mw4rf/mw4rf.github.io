// importation des classes nécessaire à la lecture des sons
import java.awt.Graphics;
import java.applet.AudioClip;

public class AudioLoop extends java.applet.Applet
    implements Runnable { // voir chapitre sur les Threads

    // création des 2 objets AudioClip	
    AudioClip bgSound;
    AudioClip beep;
    Thread runner;

    //  voir le chapitre sur les Threads	
    public void start() {
         if (runner == null) {
             runner = new Thread(this);
             runner.start();
         }
    }

    // l'applet s'arrête arrêt de tous les sons en cours de lecture	
    public void stop() {
        if (runner != null) {
            if (bgSound != null)
                bgSound.stop();
            runner = null;
        }
    }

    // initialisation de l'applet	
    public void init() {
    	  // on indique quels sont les fichiers à lire
        bgSound = getAudioClip(getCodeBase(),"loop.au");
        beep = getAudioClip(getCodeBase(), "beep.au");
    }

    // l'applet débute	
    public void run() { 
        if (bgSound != null) // le fichier loop.au n'est pas en cours de lecture...
            bgSound.loop(); // ... alors, il est lu en boucle
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            try {
                Thread.sleep(5000); // 5 secondes d'arrêt du programme
            } catch (InterruptedException e) { }
            if (beep != null) // si le fichier beep.au n'est pas en cours de lecture...
                beep.play(); // ... le lire
        }
   }

    // méthode d'affichage du texte accompagnant la lecture des sons	
    public void paint(Graphics screen) {
        screen.drawString("Playing Sounds ...", 10, 10);
    }
}