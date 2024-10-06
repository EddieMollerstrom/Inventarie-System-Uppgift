package Items;

import Interfaces.Usable;
import abstractItems.Consumable;

public class HealthPotion extends Consumable implements Usable {
    private int healthProvided;

    public HealthPotion(String name, int weight, int goldValue,  String effect, int duration, int healthProvided) {
        super(name, weight, goldValue, effect, duration);
        this.healthProvided = healthProvided;
    }
    public void restoreHealth() {

    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Weight: " + getWeight() + " Gold Value: " + getGoldValue() + " Effect: " + getEffect() + " Duration: " + getDuration() + " Health Provided: " + healthProvided;
    }

}
