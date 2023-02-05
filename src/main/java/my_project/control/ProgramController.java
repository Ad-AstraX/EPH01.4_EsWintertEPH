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
    //public ViewController x = viewController;
    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    int cameraX = 0;
    int cameraY = 0;
    public void startProgram() {
        Background background = new Background();
        viewController.draw(background);

        //Tree tree1 = new Tree(50,50, 50, 100, 3);
        //viewController.draw(tree1);

        Snowman snowman1 = new Snowman(180,475);
        viewController.draw(snowman1);

        HauntedHouse hauntedhouse1 = new HauntedHouse (100, 100);
        viewController.draw(hauntedhouse1);

        //Tree tree2 = new Tree(350,25, 25, 200, 2);
        //viewController.draw(tree2);
        //Tree tree3 = new Tree(200,100, 25, 200, 1);
        //viewController.draw(tree3);

        Snowflake[] snowflakes = new Snowflake[200];
        for (int i = 0; i < 200; i++) {
            snowflakes[i] = new Snowflake ();
        }
        for (Snowflake snowflake : snowflakes) {
            viewController.draw(snowflake);
        }

        Bat bat = new Bat(200,150, 100);
        viewController.draw(bat);

        Settings cogwheel = new Settings (550, 550);
        viewController.draw(cogwheel);
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
    }
}
