package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.control.*;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

import java.awt.*;
import java.awt.event.MouseEvent;
public class Resize extends GraphicalObject{
    GraphicalObject gO;
    public Resize (GraphicalObject gO) {
        this.gO = gO;
    }
    public void update(double dt) {
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

        boolean meetsMouse = collidesWith(gO.getX(), gO.getY(), gO.getWidth(), gO.getHeight(), mouseX-660, mouseY-286, 10, 10);
        if (meetsMouse && ViewController.isKeyDown(0x25)) {
            gO.setWidth(gO.getWidth()-gO.getWidth()/5*dt);
        } else if (meetsMouse && ViewController.isKeyDown(0x27)){
            gO.setWidth(gO.getWidth()+gO.getWidth()/5*dt);
        } else if (meetsMouse && ViewController.isKeyDown(0x28)) {
            gO.setHeight(gO.getHeight()-gO.getHeight()/5*dt);
        } else if (meetsMouse && ViewController.isKeyDown(0x26)) {
            gO.setHeight(gO.getHeight()+gO.getHeight()/5*dt);
        }
    }
}
