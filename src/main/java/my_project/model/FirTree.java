package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class FirTree extends GraphicalObject {

    public FirTree(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(56, 40, 33));
        drawTool.drawFilledRectangle(x+80,y+375,80,80);

        drawTool.setCurrentColor(new Color(100, 112, 92));
        drawTool.drawFilledTriangle(x,y+400,x+250,y+400,x+115,y+250);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(x,y+400,x+250,y+400,x+115,y+250);

        drawTool.setCurrentColor(new Color(100, 112, 92));
        drawTool.drawFilledTriangle(x+25,y+325,x+225,y+325,x+115,y+250);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(x+25,y+325,x+225,y+325,x+115,y+250);

        drawTool.setCurrentColor(new Color(100, 112, 92));
        drawTool.drawFilledTriangle(x+50,y+270,x+180,y+270,x+115,y+200);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(x+50,y+270,x+180,y+270,x+115,y+200);
    }


}
