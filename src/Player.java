public class Player {
    private String name;
    private int gold;
    private Inventory inventory;git

    public Player(String name, int gold, Inventory inventory) {
        this.name = name;
        this.gold = gold;
        this.inventory = inventory;
    }

    public int getGold() {
        return gold;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
