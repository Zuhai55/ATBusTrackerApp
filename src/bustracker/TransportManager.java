package bustracker;

public class TransportManager {
    private Assignable bus;

    public TransportManager(Assignable bus) {
        this.bus = bus;
    }

    public void allocate(String driverName) {
        bus.assignDriver(driverName);
    }
}
