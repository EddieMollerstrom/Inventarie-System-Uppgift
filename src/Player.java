public class Player {
    private String name;
    private int gold;
    private Inventory inventory;

    public Player(String name, int gold, Inventory inventory) {
        this.name = name;
        this.gold = gold;
        this.inventory = inventory;
    }
}
