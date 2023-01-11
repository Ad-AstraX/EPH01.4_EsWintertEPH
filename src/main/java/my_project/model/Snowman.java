package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowman extends GraphicalObject {

    public Snowman(double x,double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x,y,25);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawCircle(x,y,35);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x,y,25);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawCircle(x,y,35);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x,y,25);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawCircle(x,y,35);
    }
}
