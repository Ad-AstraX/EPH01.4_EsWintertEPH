package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class background extends GraphicalObject {

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledRectangle(-500,-500,1000,1000);

    }
}
