package Items;

import Interfaces.Equippable;
import Interfaces.Usable;
import abstractItems.Weapon;

public class MagicSword extends Weapon implements Usable, Equippable {
    private int mana;

    public MagicSword(String name, int healthProvided) {
        super();
    }

    public void everyFifthSwingShootFireball() {

    }

    @Override
    public void use(){}

    @Override
    public void equip() {

    }

    @Override
    public void unequip() {

    }
}
