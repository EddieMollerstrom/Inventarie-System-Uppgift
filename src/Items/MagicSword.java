package Items;

import Interfaces.Equippable;
import Interfaces.Usable;
import abstractItems.Item;
import abstractItems.Weapon;

public class MagicSword extends Weapon implements Usable, Equippable {
    private int mana;

    public MagicSword(String name, int weight, int goldValue, int damage, int durability, int mana) {
        super(name, weight, goldValue, damage, durability);
        this.mana = mana;
    }

    public void everyFifthSwingShootFireball() {
        for (int i = 0; i < 4; i++) {
            attack();
        }
        System.out.println("Fireball");
        mana -= 10;
        System.out.println(mana + " Mana left");
    }

    @Override
    public void attack() {
        System.out.println("Swings sword and dealt " + this.getDamage() + " damage");
    }

    @Override
    public void use(){}

    @Override
    public void equip() {

    }

    @Override
    public void unequip() {

    }

    public String toString() {
        return "\nName: " + getName() + "\nWeight: " + getWeight() + "\nGold Value: " + getGoldValue() + "\n";
    }
}
