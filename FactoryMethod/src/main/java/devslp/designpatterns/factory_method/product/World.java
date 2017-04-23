package devslp.designpatterns.factory_method.product;

import java.util.LinkedList;
import java.util.List;

import devslp.designpatterns.factory_method.Kingdom;

public abstract class World {

    protected int trees;
    protected int lakes;
    protected int goldMines;
    protected int stoneMines;

    protected List<Kingdom> kingdomList = new LinkedList<>();

    public void addKingdom(Kingdom kingdom) {
        kingdomList.add(kingdom);
    }

    public void applyResourcesFactor(float factor) {
        trees *= factor;
        lakes *= factor;
        goldMines *= factor;
        stoneMines *= factor;

    }

    public int getTrees() {
        return trees;
    }

    public int getLakes() {
        return lakes;
    }

    public int getGoldMines() {
        return goldMines;
    }

    public int getStoneMines() {
        return stoneMines;
    }
}
