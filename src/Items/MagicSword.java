package Items;

import Interfaces.Equippable;
import Interfaces.Usable;
import abstractItems.Weapon;

public class MagicSword extends Weapon implements Usable, Equippable {
    private int mana;
    private boolean isEquipped;

    public MagicSword(String name, int weight, int goldValue, int damage, int durability, int mana) {
        super(name, weight, goldValue, damage, durability);
        this.mana = mana;
        this.isEquipped = false;
    }

    public void everyFifthSwingShootFireball() {
        for (int i = 0; i < 5; i++) {
            attack();
        }
        System.out.println("Fireball");
        this.mana -= 10;
        System.out.println(this.mana + " Mana left");
    }

    @Override
    public void attack() {
        System.out.println("Swings sword and dealt " + this.getDamage() + " damage");
    }

    @Override
    public void use(){
        int manaToRestore = 10;
        this.mana += manaToRestore;
        System.out.println("Restored " + manaToRestore + " mana" );
        System.out.println(mana + " Mana left");
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    @Override
    public void equip() {
        setEquipped(true);
        System.out.println("Equipped " + this.getName());
    }

    @Override
    public void unequip() {
        setEquipped(false);
        System.out.println("Unequipped " + this.getName());
    }

    public String toString() {
        return "\nName: " + getName() + "\nWeight: " + getWeight() + "\nGold Value: " + getGoldValue() + "\nDamage: " + getDamage() + "\nDurability: " + getDurability() + "\nMana: " + mana;
    }
}
