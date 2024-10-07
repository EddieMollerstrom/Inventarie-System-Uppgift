package Items;

import Interfaces.Equippable;
import abstractItems.Armour;

public class OgreArmour extends Armour implements Equippable {
    private int stamina;
    private int strength;

    public OgreArmour(int stamina, int strength) {
        super();
    }

    @Override
    public void equip() {

    }

    @Override
    public void unequip() {

    }
}
