package abstractItems;

public abstract class Item {
    private String name;
    private int weight;
    private int goldValue;

    public Item(String name, int weight, int goldValue) {
        this.name = name;
        this.weight = weight;
        this.goldValue = goldValue;
    }

    public Item(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Weight: " + weight + " Gold Value: " + goldValue;
    }
}
