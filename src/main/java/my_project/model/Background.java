package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GraphicalObject {
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledRectangle(0,415,600,250);

        drawTool.setCurrentColor(new Color(168, 220, 236));
        drawTool.drawFilledRectangle(0,0,600,420);

        /*
        drawTool.setCurrentColor(new Color(162, 231, 252));
        drawTool.drawFilledRectangle (0, 0, 600, 800);

        BufferedImage picIG = new BufferedImage(600, 800, 5);
        drawTool.drawImage(picIG, 0, 0);
        ImageIcon pic = new ImageIcon ("SnowOnGround.png");
        Image icon = pic.getImage();
        Image real = icon.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
         */
    }

}
