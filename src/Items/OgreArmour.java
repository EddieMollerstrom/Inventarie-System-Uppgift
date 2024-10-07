package Items;

import Interfaces.Equippable;
import abstractItems.Armour;
import abstractItems.Item;

public class OgreArmour extends Armour implements Equippable {
    private int stamina;
    private int strength;

    public OgreArmour(String name, int weight, int goldValue, int defense, String armourType, int stamina, int strength) {
        super(name, weight, goldValue, defense, armourType);
        this.stamina = stamina;
        this.strength = strength;
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
        return "\nName: " + getName() + "\nWeight: " + getWeight() + "\nGold Value: " + getGoldValue() + "\nDefence: " + getDefense() + "\nArmour Type: " + getArmourType() + "\nStamina: " + stamina + "\nStrength: " + strength + "\nEquppied: " + isEquipped();
    }
}
