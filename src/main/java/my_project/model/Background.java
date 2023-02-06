package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
    public Background() {
        this.setNewImage("src/main/resources/graphic/snowOnGround.png");
    }
    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawFilledRectangle(0, 0, 600, 600);

        drawTool.setCurrentColor(new Color(168, 220, 236));
        drawTool.drawFilledRectangle(0,0,600,420);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawImage(this.getMyImage(), 800, 600);


        drawTool.drawImage(getMyImage(), 0, 0);
    }

}
