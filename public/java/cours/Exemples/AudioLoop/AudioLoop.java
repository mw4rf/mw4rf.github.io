// importation des classes n�cessaire � la lecture des sons
import java.awt.Graphics;
import java.applet.AudioClip;

public class AudioLoop extends java.applet.Applet
    implements Runnable { // voir chapitre sur les Threads

    // cr�ation des 2 objets AudioClip	
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

    // l'applet s'arr�te arr�t de tous les sons en cours de lecture	
    public void stop() {
        if (runner != null) {
            if (bgSound != null)
                bgSound.stop();
            runner = null;
        }
    }

    // initialisation de l'applet	
    public void init() {
    	  // on indique quels sont les fichiers � lire
        bgSound = getAudioClip(getCodeBase(),"loop.au");
        beep = getAudioClip(getCodeBase(), "beep.au");
    }

    // l'applet d�bute	
    public void run() { 
        if (bgSound != null) // le fichier loop.au n'est pas en cours de lecture...
            bgSound.loop(); // ... alors, il est lu en boucle
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            try {
                Thread.sleep(5000); // 5 secondes d'arr�t du programme
            } catch (InterruptedException e) { }
            if (beep != null) // si le fichier beep.au n'est pas en cours de lecture...
                beep.play(); // ... le lire
        }
   }

    // m�thode d'affichage du texte accompagnant la lecture des sons	
    public void paint(Graphics screen) {
        screen.drawString("Playing Sounds ...", 10, 10);
    }
}