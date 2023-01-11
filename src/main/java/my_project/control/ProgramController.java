package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    int cameraX = 0;
    int cameraY = 0;
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        //Ball ball1 = new Ball(150,150);
        //viewController.draw(ball1);
        Background background = new Background();
        viewController.draw(background);


        FirTree firTree1 = new FirTree(0,0);
        viewController.draw(firTree1);

        Snowman snowman1 = new Snowman(180,475);
        viewController.draw(snowman1);

        FirTree firTree2 = new FirTree(350,25);
        viewController.draw(firTree2);
        FirTree firTree3 = new FirTree(200,100);
        viewController.draw(firTree3);

        Snowflake[] snowflakes = new Snowflake[200];
        for (int i = 0; i < 200; i++) {
            snowflakes[i] = new Snowflake ();
        }
        for (Snowflake snowflake : snowflakes) {
            viewController.draw(snowflake);
        }
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
    }
}
