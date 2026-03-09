public class WasteContainer {
    private double capacity;
    private double currentAmount;
    private WasteType type;

    public WasteContainer(double capacity, WasteType type) {
        this.capacity = capacity;
        this.type = type;
        this.currentAmount = 0.0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void addWaste(double amount) {
        this.currentAmount += amount;
    }

    public WasteType getType() {
        return type;
    }

    public boolean isFull() {
        return currentAmount >= capacity;
    }

    public void empty() {
        this.currentAmount = 0.0;
    }

    @Override
    public String toString() {
        return "WasteContainer{" +
                "capacity=" + capacity +
                ", currentAmount=" + currentAmount +
                ", type=" + type +
                '}';
    }
}