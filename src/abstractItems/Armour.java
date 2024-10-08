package abstractItems;

public abstract class Armour extends Item {
    private int defense;
    private String armourType;
    private boolean isEquipped;

    public Armour(String name, int weight, int goldValue, int defense, String armourType) {
        super(name, weight, goldValue);
        this.defense = defense;
        this.armourType = armourType;
        this.isEquipped = false;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    public void enchant(Item item){
        int removeWeight = 10;
        System.out.println("Enchanting item " + item.getName() + " with lighter weight, old weight: " + item.getWeight());
        int newWeight = item.getWeight() - removeWeight;
        item.setWeight(newWeight);
        System.out.println("New weight " + item.getWeight());

    };
}
