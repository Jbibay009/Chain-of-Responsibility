public class OrganicWasteCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteType type) {
        return type == WasteType.ORGANIC;
    }

    @Override
    public void dispose(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Disposing organic waste: Composting " + container.getCurrentAmount() + " units.");
            container.empty();
        } else {
            System.out.println("Organic waste container is not full. Current amount: " + container.getCurrentAmount());
        }
    }
}