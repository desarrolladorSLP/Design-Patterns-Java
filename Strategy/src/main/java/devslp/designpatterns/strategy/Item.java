package devslp.designpatterns.strategy;

public class Item {
    private String itemName;
    private int price;

    public Item(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
}
