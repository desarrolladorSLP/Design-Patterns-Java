package devslp.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

import devslp.designpatterns.builder.Items.Item;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0.0;

        for (Item item : items) {
            total += item.price();
        }

        return total;
    }

    public String toString() {
        String s = "";
        for (Item item : items) {
            s += "Item: " + item.name() + "\n";
            s += "Packing " + item.packing().pack() + "\n";
            s += "Price" + item.price() + "\n";
        }
        return s;
    }
}
