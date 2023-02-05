package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Cat extends GraphicalObject {
    double costume;
    int speed;
    int cameraX;
    int cameraY;

    public Cat (int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.costume = 0;
        this.cameraX = 0;
        this.cameraY = 0;
        this.setNewImage("src/main/resources/graphic/cat-animation/cat animation png 1.png");
    }

    public void draw(DrawTool drawTool) {
        drawTool.drawImage(getMyImage(), x+cameraX,y+cameraY);

    }

    public void update(double dt) {
        x = x - speed * dt;

        if (ViewController.isKeyDown(0x25)) {
            cameraX -= 200 * dt;
        }
        if (ViewController.isKeyDown(0x27)) {
            cameraX += 200 * dt;
        }
        //this.setNewImage(allPics(costume));
        costume = costume + 12.5 * dt;
        if(costume > 9.9){
            costume = 0;

        //public String allPics (double i) {
            String[] Images = {
                    "src/main/resources/graphic/cat-animation/cat animation png 1.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 2.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 3.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 4.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 5.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 6.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 7.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 8.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 9.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 10.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 11.png",
                    "src/main/resources/graphic/cat-animation/cat animation png 12.png",
            };
            //return Images[(int) i];
            }
        }

    }
