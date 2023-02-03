package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {
    int type;
    public Tree(double x, double y, double width, double height, int type){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void draw(DrawTool drawTool){
        if (type == 1) {
            FirTree(drawTool);
        } else if (type == 2) {
            FirTree2(drawTool);
        } else if (type == 3) {
            Babylonica (drawTool);
        }

    }

    public void update(double dt) {
        if (!(collidesWith(x, y, width, height, 0, 450, 800, 200))) {
            Gravity.moveObject(this, dt);
        }
    }
    public void FirTree (DrawTool drawTool) {
        drawTool.setCurrentColor  (new Color (82, 56, 30));
        drawTool.drawFilledRectangle (x-width*0.4, y+height*0.75, width, height);

        drawTool.setCurrentColor  (new Color (18, 65, 14));
        drawTool.drawFilledPolygon   (x-width*2 ,y+height/2, x+width*2, y+height/2, x, y);
        drawTool.drawFilledPolygon   (x-width*3,y+height*0.875, x+width*3, y+height*0.875, x, y+height*0.25);
        drawTool.drawFilledPolygon   (x-width*4,y+height*1.25 , x+width*4,y+height*1.25, x, y+height/2);
    }

    public void FirTree2 (DrawTool drawTool) {
        double h = height;
        double w = width;
        drawTool.setCurrentColor(new Color(56, 40, 33));
        drawTool.drawFilledRectangle(x+w,y+h*4.6875,80,80);

        drawTool.setCurrentColor(new Color(100, 112, 92));
        drawTool.drawFilledTriangle(x,y+h*5,x+w*3125,y+h*5,x+w*1.4375,y+h*3.125);
        drawTool.drawFilledTriangle(x+w*0.3125,y+h*4.0625,x+w*2.8125,y+h*4,x+w*1.4375,y+h*3.125);
        drawTool.drawFilledTriangle(x+w*0.625,y+h*3.375,x+w*2.25,y+h*3.375,x+w*1.4375,y+h*2.5);
    }

    public void Babylonica (DrawTool drawTool) {
        for (double i = 1.5; i <= 10; i++) {
            drawTool.setCurrentColor( new Color (53, 66, 29));
            drawTool.drawFilledEllipse(x-width*1.7+i*width*0.4, y-height*0.3, width/5, height*0.85);
        }
        drawTool.setCurrentColor  (new Color (120,69,19));
        drawTool.drawFilledRectangle (x, y, width, height);
        drawTool.drawFilledPolygon   (x+width/2, y+height*0.25, x-width/2, y+height, x+width*1.5, y+height);

        for (int i = 1; i <= 10; i++) {
            drawTool.setCurrentColor( new Color (85, 107, 47));
            drawTool.drawFilledEllipse(x - width*1.7 + i * width*0.4, y - height*0.3, width/5, height*0.85);
        }
        drawTool.drawFilledCircle    (x - width/2 ,y - height*0.85, width*0.9);
        drawTool.drawFilledCircle    (x + width*1.5,y - height*0.85, width*0.9);
        drawTool.drawFilledCircle    (x + width/2 ,y - height*0.9, width*1.2);
    }
}
