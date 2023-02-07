package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.control.*;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

import java.awt.*;
import java.awt.event.MouseEvent;
public class Draggable extends GraphicalObject{
    GraphicalObject gO;
    double centerX;
    double centerY;
    public Draggable (GraphicalObject gO, double centerX, double centerY) {
        this.gO = gO;
        this.centerX = centerX;
        this.centerY = centerY;
    }
    public void update(double dt) {
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

        if (collidesWith(gO.getX(), gO.getY(), gO.getWidth(), gO.getHeight(), mouseX-660, mouseY-286, 10, 10)
                && ViewController.isKeyDown(0x4D)) {
            gO.setX(mouseX-660+gO.getX()-centerX);
            gO.setY(mouseY-286+gO.getY()-centerY);
        }
    }
}
