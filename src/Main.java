import Items.HealthPotion;
import Items.MagicSword;
import Items.OgreArmour;
import abstractItems.Item;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Player p1 = new Player("Eddie", 100, inventory);
        Shop shop = new Shop(p1);

        HealthPotion healthPotion = new HealthPotion("Basic Healing Potion", 1, 10, "Healing per second", 5, 20);
        HealthPotion healthPotionToRemove = new HealthPotion("Useless Healing Potion", 1, 0, "Lose health", 100, -20);
        MagicSword magicSword = new MagicSword("MagicSword", 20, 200, 10, 100, 100);
        OgreArmour ogreArmour = new OgreArmour("OG", 50, 50, 100, "Leather", 10, 20);

      while(running){
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Print all items");
            System.out.println("4. Show item powers");
            System.out.println("5. Buy from the shop");
            System.out.println("6. Exit");
            String choice = input.nextLine();

            switch(choice){
                case "1":
                    System.out.println("1. Health potion");
                    System.out.println("2. Magic sword");
                    System.out.println("3. Ogre armour");
                    String itemChoice = input.nextLine();
                    if(Objects.equals(itemChoice, "1")){
                        inventory.addItem(healthPotion);
                        inventory.deleteItem(healthPotionToRemove);

                    } else if(Objects.equals(itemChoice, "2")){
                        inventory.addItem(magicSword);

                    } else if(Objects.equals(itemChoice, "3")){
                        inventory.addItem(ogreArmour);
                    }
                    break;

                case "2":
                    inventory.displayItems();
                    Item itemToRemove = null;

                    System.out.println("What item do you want to remove?");
                    String itemToRemoveChoice = input.nextLine();

                    for(Item item : inventory.getItems()) {
                        if(item.getName().equalsIgnoreCase(itemToRemoveChoice)){
                            itemToRemove = item;
                        }
                    }
                    inventory.deleteItem(itemToRemove);
                    System.out.println(itemToRemove.getName() + " has been removed.");

                    break;
                case "3":
                    inventory.displayItems();

                    break;
                case "4":
                    System.out.println("\nHealing potions use:");
                    healthPotion.use();

                    System.out.println("\nOgre armours equip:");
                    ogreArmour.equip();
                    System.out.println("isEquipped = " + ogreArmour.isEquipped());
                    ogreArmour.unequip();
                    System.out.println("isEquipped = " + ogreArmour.isEquipped());

                    System.out.println("\nArmours enchant:");
                    ogreArmour.enchant(ogreArmour);

                    System.out.println("\nMagic swords everyFifthSwing:");
                    magicSword.everyFifthSwingShootFireball();
                    System.out.println("\nMagic swords use:");
                    magicSword.use();
                    break;
                case "5":
                    shop.addItem(new HealthPotion("HealthPotion", 1, 10, "Instant healing", 1, 20));
                    shop.sellItem();
                    break;
                case "6":
                    running = false;
                    break;
            }
        }
    }
}