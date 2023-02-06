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

        //Background
        Background background = new Background();
        viewController.draw(background);

        //Tree
        Tree tree1 = new Tree(50,50, 50, 100, 3);
        viewController.draw(tree1);

        //HauntedHouse
        //HauntedHouse hauntedhouse1 = new HauntedHouse (100, 100);
        //viewController.draw(hauntedhouse1);

        //Sun
        Sun s1 = new Sun(500,80,35);
        viewController.draw(s1);

        // Clouds
        Cloud c1 = new Cloud(100,115,30);
        viewController.draw(c1);
        Cloud c2 = new Cloud(350,160,30);
        viewController.draw(c2);
        Cloud c3 = new Cloud(400,100,15);
        viewController.draw(c3);
        Cloud c4 = new Cloud(250,145,45);
        viewController.draw(c4);
        Cloud c5 = new Cloud(380,122,40);
        viewController.draw(c5);
        Cloud c6 = new Cloud(560,110,30);
        viewController.draw(c6);

        //Snowflake
        Snowflake[] snowflakes = new Snowflake[200];
        for (int i = 0; i < 200; i++) {
            snowflakes[i] = new Snowflake ();
        }
        for (Snowflake snowflake : snowflakes) {
            viewController.draw(snowflake);
        }

        //Cloud
        Cloud c7 = new Cloud(10,90,20);
        viewController.draw(c7);
        Cloud c8 = new Cloud(620,83,35);
        viewController.draw(c8);
        Cloud c9 = new Cloud(230,40,20);
        viewController.draw(c9);
        Cloud c10 = new Cloud(110,20,25);
        viewController.draw(c10);
        Cloud c11 = new Cloud(70,130,25);
        viewController.draw(c11);
        Cloud c12 = new Cloud(140,120,10);
        viewController.draw(c12);

        //Bat
        Bat bat = new Bat(200,150, 100);
        viewController.draw(bat);

        //Cat
        Cat cat = new Cat(360,500,45);
        viewController.draw(cat);

        Settings cogwheel = new Settings (550, 550, viewController);
        viewController.register(cogwheel);
        viewController.draw(cogwheel);
    }
    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
    }
}
