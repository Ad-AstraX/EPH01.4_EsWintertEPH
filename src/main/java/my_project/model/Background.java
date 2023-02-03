package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
    public Background() {
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(168, 220, 236));
        drawTool.drawFilledRectangle(0,0,600,420);

        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawImage(this.getMyImage(), 800, 600);
    }

}
