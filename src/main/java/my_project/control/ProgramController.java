package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import KAGO_framework.view.DrawTool;
import my_project.model.*;
import KAGO_framework.model.GraphicalObject;

import java.awt.*;
import java.util.List;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController implements Drawable{

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
    double f = 20;
    public void startProgram() {
        Background background = new Background();
        viewController.draw(background);

        //HauntedHouse hauntedhouse1 = new HauntedHouse (100, 100);
        //viewController.draw(hauntedhouse1);

        Snowflake[] snowflakes = new Snowflake[400];
        for (int i = 0; i < 400; i++) {
            snowflakes[i] = new Snowflake ();
        }
        for (Snowflake snowflake : snowflakes) {
            viewController.draw(snowflake);
        }

        Bat bat = new Bat(200,150, 100);
        viewController.draw(bat);

        Settings cogwheel = new Settings (550, 550, viewController);
        viewController.register(cogwheel);
        viewController.draw(cogwheel);


    }
    @Override
    public void update(double dt) {

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

        if (ViewController.isKeyDown(0x31) && ViewController.isKeyDown(0x41)) {
            Tree tree = new Tree(200,100, 25, 200, 1);
            viewController.draw(tree);
        }
        if (ViewController.isKeyDown(0x32) && ViewController.isKeyDown(0x41)) {
            Tree tree = new Tree(200,100, 25, 200, 2);
            viewController.draw(tree);
        }
        if (ViewController.isKeyDown(0x33) && ViewController.isKeyDown(0x41)) {
            Tree tree = new Tree(200,100, 25, 200, 3);
            viewController.draw(tree);
        }
        if (ViewController.isKeyDown(0x34) && ViewController.isKeyDown(0x41)) {
            Cat cat = new Cat(200,100, 25);
            viewController.draw(cat);
        }
        if (ViewController.isKeyDown(0x35) && ViewController.isKeyDown(0x41)) {
            Bat bat = new Bat(200,100, 50);
            viewController.draw(bat);
        }
        if (ViewController.isKeyDown(0x36) && ViewController.isKeyDown(0x41)) {
            HauntedHouse hauntedHouse = new HauntedHouse(200,100);
            viewController.draw(hauntedHouse);
        }
        if (ViewController.isKeyDown(0x37) && ViewController.isKeyDown(0x41)) {
            Sun sun = new Sun(200,100, 35);
            viewController.draw(sun);
        }
        if (ViewController.isKeyDown(0x38) && ViewController.isKeyDown(0x41)) {
            Cloud sun = new Cloud(200,100, 35);
            viewController.draw(sun);
        }
        GraphicalObject g = new GraphicalObject();
        if (g.collidesWith(f, 30, 10, 10, mouseX-660, mouseY-286, 10, 10)
                && ViewController.isKeyDown(0x4D)) {
            f = mouseX-660+f;
        }
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0, 128));
        drawTool.drawFilledRectangle(20, 20, 100, 20);

        drawTool.setCurrentColor (new Color (255, 255, 255));
        drawTool.drawCircle(f, 30, 10);
    }
}
