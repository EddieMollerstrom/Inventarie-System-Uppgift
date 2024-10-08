import abstractItems.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Item> itemsToSell = new ArrayList<>();
    private Player player;

    public Shop(Player player) {
        this.player = player;
    }

    public void addItem(Item item) {
        this.itemsToSell.add(item);
    }

    public void deleteItem(Item item) {
        this.itemsToSell.remove(item);
    }

    public void sellItem() {
        Scanner input = new Scanner(System.in);

        int n = 1;
        int itemGoldValue = 0;
        Item itemToSell = null;

        for (Item item : itemsToSell) {
            System.out.println(n + ": " + item.getName() + item.getGoldValue() + " Gold");
            n++;
            itemGoldValue = item.getGoldValue();
            itemToSell = item;
        }

        System.out.println("What do you want to buy?");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                System.out.println(itemToSell.getName());
                if (player.getGold() >= itemGoldValue) {
                    player.getInventory().addItem(itemToSell);
                    deleteItem(itemToSell);
                    System.out.println("You just bought " + itemToSell.getName() + " for " + itemGoldValue + " gold.");
                }
                break;
        }
    }
}
