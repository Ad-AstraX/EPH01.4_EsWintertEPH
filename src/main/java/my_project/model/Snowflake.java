/*package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowflake extends GraphicalObject{

    double cameraAngle = 0;
    double cameraX;
    double cameraY= 0;
    int direction;
    double speed;
    public Snowflake () {
        radius = (int)(1 + Math.random()*4);
        speed = radius*30;
        x = -500 + Math.random()*1300;
        y = Math.random()*-100;
        direction = (int)(-1.9+Math.random()*1.9);
        this.cameraX = 0;
    }

    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (255, 255, 255));
        drawTool.drawFilledCircle(x+cameraX, y+cameraY, radius);
    }

    public void update (double dt) {
        // control snowflakes
        y += speed*dt;
        x += direction*(speed/5*dt);
        if (y > 600+radius) {
            radius = (int)(1 + Math.random()*4);
            speed = radius*50;
            x = -500+Math.random()*1300;
            y = 0 - radius;
        }

        // check for key presses and pan camera accordingly

        if (ViewController.isKeyDown(0x25)) {
            cameraAngle -= 150 * dt;
        }
        if (ViewController.isKeyDown(0x27)) {
            cameraAngle += 150 * dt;
        }

        cameraX = Math.cos(cameraAngle) *Math.PI;
        //cameraAngle = Math.toRadians(cameraX);
        //cameraY = Math.sin(cameraAngle) * 360;
    }
}*//*package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowflake extends GraphicalObject{

    double cameraAngle = 0;
    double cameraX;
    int direction;
    double speed;
    public Snowflake () {
        radius = (int)(1 + Math.random()*4);
        speed = radius*30;
        x = -500 + Math.random()*1300;
        y = Math.random()*-100;
        direction = (int)(-1.9+Math.random()*1.9);
        this.cameraX = 0;
    }

    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (255, 255, 255));
        drawTool.drawFilledCircle(x+cameraX, y, radius);
    }

    public void update (double dt) {
        // control snowflakes
        y += speed*dt;
        x += direction*(speed/5*dt);
        if (y > 600+radius || x < 0-radius|| x > 600+radius) {
            radius = (int)(1 + Math.random()*4);
            speed = radius*50;
            x = -500+Math.random()*1300;
            y = 0 - radius;
        }

        // check for key presses and pan camera accordingly

        if (ViewController.isKeyDown(0x25)) {
            cameraX -= 150 * dt;
        }
        if (ViewController.isKeyDown(0x27)) {
            cameraX += 150 * dt;
        }
    }
}*/
package my_project.model;

import KAGO_framework.control.Interactable;
import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowflake extends GraphicalObject{

    double cameraAngle = 0;
    double cameraX;
    int direction;
    double speed;
    public Snowflake () {
        radius = (int)(1 + Math.random()*4);
        speed = radius*30;
        x = -50 + Math.random()*600;
        y = Math.random()*-100;
        direction = (int)(-1.9+Math.random()*1.9);
        this.cameraX = 0;
    }

    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (255, 255, 255));
        drawTool.drawFilledCircle(x+cameraX, y, radius);

    }

    public void update (double dt) {
        // control snowflakes
        y += speed*dt;
        x += direction*(speed/5*dt);
        if (y > 600+radius) {
            radius = (int)(1 + Math.random()*4);
            speed = radius*50;
            x = -50 + Math.random()*600;
            y = 0 - radius;
        }

        // check for key presses and pan camera accordingly
        /*
        if (ViewController.isKeyDown(0x25)) {
            cameraX -= 150 * dt;
        }
        if (ViewController.isKeyDown(0x27)) {
            cameraX += 150 * dt;
        }*/
    }
}