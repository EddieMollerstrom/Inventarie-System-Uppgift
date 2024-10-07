package abstractItems;

public abstract class Weapon extends Item {
    private int damage;
    private int durability;

    public Weapon(String name, int weight, int goldValue, int damage, int durability) {
        super(name, weight, goldValue);
        this.damage = damage;
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void attack(){
        System.out.println("Attack");
    }
}
