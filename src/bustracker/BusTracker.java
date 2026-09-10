package bustracker;
import java.util.*;
//Observable bus tracker
public class BusTracker extends Observable{
    private Bus bus;


    public BusTracker(Bus bus){
        this.bus = bus;
    }

    public Bus getBus(){
        return bus;
    }

    public void notifyArrival(BusStop stop, int etaMinutes){
        String message = String.format("%s arriving at %s in %d mins",
                bus.getBusNumber(), stop.toString(), etaMinutes);

        setChanged();
        notifyObservers(message);
    }
}
