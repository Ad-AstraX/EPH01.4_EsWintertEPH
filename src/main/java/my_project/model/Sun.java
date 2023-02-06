package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject{

    public Sun(double xpos, double ypos,double r){
        x = xpos;
        y = ypos;
        radius = r;
    }

    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(new Color(255, 253, 190));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.drawLine(x-125,y,x+100,y);
        drawTool.drawLine(x,y-100,x,y+110);
        drawTool.drawLine(x-100,y-110,x+100,y+100);
        drawTool.drawLine(x+100,y-110,x-100,y+100);
    }
}