package my_project.model;

import javax.imageio.ImageIO;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snowflake extends GraphicalObject{
    // Image image = ImageIO.read(new File("demo.jpg"));
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
    }
    public void draw (DrawTool drawTool) {
        drawTool.setCurrentColor(new Color (255, 255, 255));
        drawTool.drawFilledCircle(x, y, radius);
    }
    public void update (double dt) {
        y += speed*dt;
        x += direction*(speed/5*dt);
        if (y > 600+radius) {
            radius = (int)(1 + Math.random()*4);
            speed = radius*50;
            moving = true;
            x = Math.random()*800;
            y = 0 - radius;
        }
    }
    public String chooseLook (){
        return "later";
    }
}
