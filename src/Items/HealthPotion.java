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
        System.out.println(getEffect() + " for " + getDuration() + " seconds");
        System.out.println(healthProvided + " health provided");
    }

    @Override
    public void use() {
        restoreHealth();
    }

    /*@Override
    public String toString() {
        return "Name: " + getName() + " | Weight: " + getWeight() + " | Gold Value: " + getGoldValue() + " | Effect: " + getEffect() + " | Duration: " + getDuration() + " | Health Provided: " + healthProvided;
    }

     */

    @Override
    public String toString() {
        return "\nName: " + getName() + "\nWeight: " + getWeight() + "\nGold Value: " + getGoldValue() + "\nEffect: " + getEffect() + "\nDuration: " + getDuration() + "\nHealth Provided: " + healthProvided;
    }

}
