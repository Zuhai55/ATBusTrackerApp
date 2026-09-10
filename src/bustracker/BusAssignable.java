package bustracker;

public class BusAssignable implements Assignable {
    private Bus bus;

    public BusAssignable(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void assignDriver(String name) {
        Driver driver = new Driver(name);
        bus.assignDriver(driver);
    }
}
