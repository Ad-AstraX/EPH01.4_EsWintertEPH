package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class HauntedHouse extends GraphicalObject {

    public HauntedHouse(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(49, 49, 49));
        drawTool.drawFilledRectangle(150, 130, 500, 300);
        drawTool.setCurrentColor(new Color(10, 10, 10));
        drawTool.drawFilledRectangle(235, 235, 100, 100);
        drawTool.drawFilledRectangle(435, 235, 100, 100);
        drawTool.setCurrentColor(new Color(183, 5, 2));
        drawTool.drawFilledEllipse(260, 270, 5, 2);
        drawTool.drawFilledEllipse(275, 270, 5, 2);
    }
    public void update (double dt) {
        Draggable dragThis = new Draggable(this, x, y);
        dragThis.update(dt);
    }
}

