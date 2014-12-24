import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class Neko extends java.applet.Applet
    implements Runnable { // necessaire pour les threads 
    	
    Image nekoPics[] = new Image[9]; // matrice d'images
    Image currentImg; // image courante
    Thread runner; // déclaration du thread
    int x; // abscisse de l'image
    int y = 50; // son ordonnée

    public void init() { // initialisation de l'applet
        String nekoSrc[] = { "right1.gif", "right2.gif",
            "stop.gif", "yawn.gif", "scratch1.gif",
            "scratch2.gif","sleep1.gif", "sleep2.gif",
            "awake.gif" }; // on remplie la matrice avec les images

        for (int i=0; i < nekoPics.length; i++) {
            nekoPics[i] = getImage(getCodeBase(),
                "images/" + nekoSrc[i]);
        }
    }

    public void start() { //méthode start de l'applet, opérations sur les threads
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void stop() { // comment arreter l'animation
        runner = null;
    }

    public void run() { // lancer l'appplet
        setBackground(Color.white);
        // part d'un côté de l'écran pour la milieu
        nekoRun(0, size().width / 2);
        // pause
        currentImg = nekoPics[2];
        repaint();
        pause(1000);
        // baille 3 fois
        currentImg = nekoPics[3];
        repaint();
        pause(1000);
        // se gratte 4 fois
        nekoScratch(4);
        // dort 5 "temps"
        nekoSleep(5);
        // se réveille et s'en va
        currentImg = nekoPics[8];
        repaint();
        pause(500);
        nekoRun(x, size().width + 10);
    }

    void nekoRun(int start, int end) { // méthode qui permet d'exécuter les mouvements
    	                                // définis précédemment ici: courir et bailler)
        for (int i = start; i < end; i += 10) {
            x = i;
            // images pour le baillement
            if (currentImg == nekoPics[0])
                currentImg = nekoPics[1];
            else currentImg = nekoPics[0];
            repaint();
            pause(150);
        }
    }

    void nekoScratch(int numTimes) { // pour se gratter...
        for (int i = numTimes; i > 0; i--) {
            currentImg = nekoPics[4];
            repaint();
            pause(150);
            currentImg = nekoPics[5];
            repaint();
            pause(150);
        }
    }

    void nekoSleep(int numTimes) { // ... dormir
        for (int i = numTimes; i > 0; i--) {
            currentImg = nekoPics[6];
            repaint();
            pause(250);
            currentImg = nekoPics[7];
            repaint();
            pause(250);
        }
    }

    void pause(int time) { // une pause dans l'animation
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) { }
    }

    public void paint(Graphics screen) { // affichage de l'animation
        if (currentImg != null)
            screen.drawImage(currentImg, x, y, this);
    }
}