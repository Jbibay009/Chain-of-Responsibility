public class HazardousWasteCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteType type) {
        return type == WasteType.HAZARDOUS;
    }

    @Override
    public void dispose(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Disposing hazardous waste: Incinerating " + container.getCurrentAmount() + " units with special handling.");
            container.empty();
        } else {
            System.out.println("Hazardous waste container is not full. Current amount: " + container.getCurrentAmount());
        }
    }
}