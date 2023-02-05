package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Cat extends GraphicalObject {
    double costume;
    int speed;

    public Cat (int x, int y, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.costume = 0;
        this.setNewImage("src/main/resources/graphic/cat-animation");
    }

    public void update(double dt){
        x = x - speed * dt;

    }
}
