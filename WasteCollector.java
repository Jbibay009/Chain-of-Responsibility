public abstract class WasteCollector {
    protected WasteCollector next;

    public void setNext(WasteCollector next) {
        this.next = next;
    }

    public abstract boolean canHandle(WasteType type);

    public abstract void dispose(WasteContainer container);

    public void process(WasteContainer container) {
        if (canHandle(container.getType())) {
            dispose(container);
        } else if (next != null) {
            next.process(container);
        } else {
            System.out.println("No collector available for waste type: " + container.getType());
        }
    }
}