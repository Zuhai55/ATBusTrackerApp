package bustracker;

//Adapter (to Adaptee BusStopLeaf) for JList
public class BusStop {
	private BusStopLeaf adaptee;

	public BusStop(BusStopLeaf adaptee) {
		this.adaptee = adaptee;
	}

	public String getName() {
		return adaptee.getName();
	}

	public BusStopLeaf getLeaf() {
		return adaptee;
	}

	@Override
	public String toString() {
		return adaptee.getName();  // what JList displays
	}
}
