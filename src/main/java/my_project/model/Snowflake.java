package my_project.model;

import javax.swing.*;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowflake extends GraphicalObject{

    int cameraX;
    int cameraY;
    int direction;
    double speed;
    boolean moving;
    public Snowflake () {
        radius = (int)(1 + Math.random()*4);
        speed = radius*30;
        moving = true;
        x = -50 + Math.random()*800;
        y = Math.random()*-100;
        direction = (int)(-1.9+Math.random()*1.9);
        this.cameraX = 0;
        this.cameraY = 0;
        // set Costume
        this.setNewImage(chooseLook((int)(Math.random()*2.99)));
    }

    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (255, 255, 255));
        //drawTool.drawFilledCircle(x+cameraX, y+cameraY, radius);
        drawTool.drawImage(this.getMyImage(), x, y);
    }

    public void update (double dt) {
        // control snowflakes
        y += speed*dt;
        x += direction*(speed/5*dt);
        if (y > 600+radius) {
            radius = (int)(1 + Math.random()*4);
            speed = radius*50;
            moving = true;
            x = Math.random()*800;
            y = 0 - radius;
        }
        // check for position of mouse and react accordingly
        int mouseX = MouseInfo.getPointerInfo().getLocation().x;
        if (mouseX > 0 && mouseX < 300) {
            cameraX -= 100*dt;
        } else if (mouseX > 500 && mouseX < 800) {
            cameraX += 100 * dt;
        }
    }
    public String chooseLook (int index){
        String[] looks = {"src/main/resources/graphic/schneeflocke1.png",
                          "src/main/resources/graphic/schneeflocke2.png",
                          "src/main/resources/graphic/schneeflocke3.png",
                         };
        return looks[index];
    }
}
