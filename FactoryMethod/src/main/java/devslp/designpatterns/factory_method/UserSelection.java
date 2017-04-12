package devslp.designpatterns.factory_method;

import java.util.List;

public class UserSelection {

    private List<Kingdom> kingdoms;

    private int speed;

    private float resourcesFactor;

    public List<Kingdom> getKingdoms() {
        return kingdoms;
    }

    public void setKingdoms(List<Kingdom> kingdoms) {
        this.kingdoms = kingdoms;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getResourcesFactor() {
        return resourcesFactor;
    }

    public void setResourcesFactor(float resourcesFactor) {
        this.resourcesFactor = resourcesFactor;
    }
}
