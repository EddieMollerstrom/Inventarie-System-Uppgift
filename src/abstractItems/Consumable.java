package abstractItems;

public abstract class Consumable extends Item {
    private String effect;
    private int duration;

    public Consumable(String name, int goldValue, int weight, String effect, int duration) {
        super(name, weight, goldValue);
        this.effect = effect;
        this.duration = duration;
    }

    public String getEffect() {
        return effect;
    }

    public int getDuration() {
        return duration;
    }
}
