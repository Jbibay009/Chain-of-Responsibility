public class RecyclableWasteCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteType type) {
        return type == WasteType.RECYCLABLE;
    }

    @Override
    public void dispose(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Disposing recyclable waste: Recycling " + container.getCurrentAmount() + " units.");
            container.empty();
        } else {
            System.out.println("Recyclable waste container is not full. Current amount: " + container.getCurrentAmount());
        }
    }
}