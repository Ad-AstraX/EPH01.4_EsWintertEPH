package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import KAGO_framework.control.ViewController;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Settings extends GraphicalObject {
    public Settings(int x, int y) {
        this.setNewImage("src/main/resources/graphic/Zahnrad.png");
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(getMyImage(), x, y);
    }

    public void update(double dt) {
        //ViewController vc = new ViewController();
        //MouseEvent x = new MouseEvent ();
        //if (x.getButton()==1){

       // }
    }
    public void getDragged() {
        ViewController vc = new ViewController();
        //MouseEvent x = new MouseEvent ();
        //if (vc.mouseDragged(MouseEvent.MOUSE_DRAGGED));
    }
}
