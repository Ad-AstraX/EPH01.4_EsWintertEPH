package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GraphicalObject {
    public Background() {
        this.setNewImage("src/main/resources/graphic/Schneeflocke3.png");
    }
    public void draw(DrawTool drawTool){
        /*
        drawTool.drawFilledRectangle(0,415,600,250);
*/
        drawTool.setCurrentColor(new Color(168, 220, 236));
        drawTool.drawFilledRectangle(0,0,600,420);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawImage(this.getMyImage(), 800, 600);
    }

}
