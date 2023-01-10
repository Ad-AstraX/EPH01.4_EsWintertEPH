package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(194, 216, 222));
        drawTool.drawFilledRectangle(0,415,600,250);

        drawTool.setCurrentColor(new Color(168, 220, 236));
        drawTool.drawFilledRectangle(0,0,600,420);
    }
}
