package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public Cloud(double xPos,double yPos, double r){
        x = xPos;
        y = yPos;
        radius = r;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(246, 244, 244, 128));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.drawFilledCircle(x+10+radius/2,y-10+radius/2,radius);
        drawTool.drawFilledCircle(x+18+radius,y,radius);

    }

    public void update(double dt){
        x = x + 100*(radius/100)*dt;

        if(x > 1200){
            x = -200;
        }
        Draggable dragThis = new Draggable(this, x-radius, y+radius);
        dragThis.update(dt);
    }
}
