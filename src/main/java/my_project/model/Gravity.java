package my_project.model;

import KAGO_framework.model.GraphicalObject;

public class Gravity extends GraphicalObject {
    double gravity = 1300;
    public Gravity(double gravity) {
        this.gravity = gravity;
    }

    public void moveObject(GraphicalObject gO, double dt){
        gO.setVy(gO.getVy() + gravity * dt);
        gO.setY(gO.getY() + gO.getVy() * dt);
        addGravity(gO);
    }

    public void addGravity(GraphicalObject gO){
        if (gO.getVy() < 0) {
            gO.setVy(gO.getVy() - gravity / 5);
        }else{
            gO.setVy(gravity / 5);
        }
        if (gO.getVy() < gO.getVelocity()) {
            gO.setVy(gO.getVelocity());
        }
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }
}
