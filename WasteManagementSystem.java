public class WasteManagementSystem {
    private WasteCollector chain;

    public WasteManagementSystem() {
        // Initialize the chain: Organic -> Recyclable -> Hazardous
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNext(recyclableCollector);
        recyclableCollector.setNext(hazardousCollector);

        this.chain = organicCollector;
    }

    public void processWasteContainer(WasteContainer container) {
        System.out.println("Processing waste container: " + container);
        chain.process(container);
        System.out.println("After processing: " + container);
        System.out.println();
    }

    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();

        // Create sample waste containers
        WasteContainer organicContainer = new WasteContainer(100.0, WasteType.ORGANIC);
        organicContainer.addWaste(120.0); // Full

        WasteContainer recyclableContainer = new WasteContainer(80.0, WasteType.RECYCLABLE);
        recyclableContainer.addWaste(50.0); // Not full

        WasteContainer hazardousContainer = new WasteContainer(50.0, WasteType.HAZARDOUS);
        hazardousContainer.addWaste(60.0); // Full

        // Process them
        system.processWasteContainer(organicContainer);
        system.processWasteContainer(recyclableContainer);
        system.processWasteContainer(hazardousContainer);
    }
}