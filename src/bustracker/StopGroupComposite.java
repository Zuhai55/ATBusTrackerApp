package bustracker;
import java.util.*;
//Composite stop group or hub
public class StopGroupComposite extends RouteComponent {

    private String name;
    private int dwellMinutes;
    private List<RouteComponent> children = new ArrayList<>();

    public StopGroupComposite(String name, int dwellMinutes){
        super(name, dwellMinutes);
        this.name = name;
        this.dwellMinutes = dwellMinutes;
    }

    public void add(RouteComponent c){
        children.add(c);
    }

    public void remove(RouteComponent c){
        children.remove(c);
    }

    public int getTotalDwellMinutes(){
        int sum = this.dwellMinutes;

        for (RouteComponent c : children){
            sum += c.getTotalDwellMinutes();
        }

        return sum;
    }
    //provided method
    @Override
    public String toString() {
        return String.format("%s(%dmin) %s", name, dwellMinutes, children);
    }
}

