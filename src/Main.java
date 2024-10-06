import Items.HealthPotion;
import abstractItems.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();
        ArrayList<Item> items = new ArrayList<>();

        while(running){
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Print all items");
            System.out.println("4. Exit");
            String choice = input.nextLine();

            switch(choice){
                case "1":
                    System.out.println("1. Health potion");
                    System.out.println("2. Magic sword");
                    System.out.println("3. Ogre armour");
                    HealthPotion healthPotion = new HealthPotion("Basic Healing Potion", 1, 10, "Healing per second", 5, 20);
                    items.add(healthPotion);
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    inventory.displayItems(items);
                    break;
                case "4":
                    running = false;
                    break;
            }
        }
    }
}