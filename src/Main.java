import Items.HealthPotion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //boolean running = true;
        //Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();

        /*while(running){
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
        }*/

        HealthPotion healthPotion = new HealthPotion("Basic Healing Potion", 1, 10, "Instant healing", 1, 20);
        inventory.addItem(healthPotion);
        healthPotion.use();
        inventory.displayItems();

        inventory.deleteItem(healthPotion);
        inventory.displayItems();
    }
}