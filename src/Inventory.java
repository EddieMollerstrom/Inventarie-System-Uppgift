import abstractItems.Item;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public Inventory() {}

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public void displayItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
        if(this.items.isEmpty()){
            System.out.println("There are no items in the inventory.");
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int vendorItem(Item item) {
        return item.getGoldValue();
    }
}
