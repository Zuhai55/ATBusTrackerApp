package bustracker;
import java.util.*;

public class Driver{

    private String name = "";
    public static final int MAX_BUSES = 3;
    private ArrayList<Bus> buses = new ArrayList<>();

    public boolean canAssign(){
        if (buses.size() < MAX_BUSES){
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public ArrayList getBuses(){
        return buses;
    }

    public Driver(String name){
        this.name = name;
    }

    public void allocate(Bus bus) {
        if (!canAssign()) {
            throw new IllegalArgumentException("Cannot assign more than 3 buses.");
        }
        buses.add(bus);
    }

    public String toString(){
        return String.format("Driver:%s\n%s", name, buses);
    }
}
