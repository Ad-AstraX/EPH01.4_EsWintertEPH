package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Bat extends GraphicalObject{
    double cameraAngle = 0;
    double costume;
    int speed;
    double cameraX;
    public Bat (int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.costume = 0;
        this.cameraX = 0;
        this.setNewImage("src/main/resources/graphic/bat-animation/bat-animation-1.png");
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(getMyImage(), x+cameraX, y);
    }

    public void update (double dt) {
        if (x < -getMyImage().getWidth()) {
            x = 800+getMyImage().getWidth();
            y = 20 + Math.random()*200;
        }
        // x and y position
        x = x -speed*dt;

        // set costume
        this.setNewImage(allPics(costume));
        costume = costume + 12.5*dt;
        if (costume > 9.9) {
            costume = 0;
        }

        // check for key presses and pan camera accordingly
        if (ViewController.isKeyDown(0x25)) {
            cameraAngle -= 150 * dt;
        }
        if (ViewController.isKeyDown(0x27)) {
            cameraAngle += 150 * dt;
        }
        double[] centers = {x + width / 2, y + height / 2};

        Draggable dragThis = new Draggable(this, centers[0], centers[1]);
        dragThis.update(dt);

        Resize resize = new Resize(this);
        resize.update(dt);
    }
    public String allPics (double i) {
        String[] images = {
                "src/main/resources/graphic/bat-animation/bat-animation-1.png", // --> 0
                "src/main/resources/graphic/bat-animation/bat-animation-2.png", // --> 1
                "src/main/resources/graphic/bat-animation/bat-animation-3.png", // --> 2
                "src/main/resources/graphic/bat-animation/bat-animation-4.png", // --> ...
                "src/main/resources/graphic/bat-animation/bat-animation-5.png",
                "src/main/resources/graphic/bat-animation/bat-animation-6.png",
                "src/main/resources/graphic/bat-animation/bat-animation-5.png",
                "src/main/resources/graphic/bat-animation/bat-animation-4.png",
                "src/main/resources/graphic/bat-animation/bat-animation-3.png",
                "src/main/resources/graphic/bat-animation/bat-animation-2.png"
        };
        return images[(int) i];
    }
}
