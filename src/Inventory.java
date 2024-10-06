import abstractItems.Item;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public void displayItems(ArrayList<Item> items) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public int vendorItem(Item item) {
        return item.getGoldValue();
    }
}
