package bustracker;

//Composite hierarchy leaf
public class BusStopLeaf extends RouteComponent{
    private String name;
    private int dwellMinutes;

    public BusStopLeaf(String name, int dwellMinutes){
        super(name, dwellMinutes);
        this.dwellMinutes = dwellMinutes;
        this.name = name;
    }

    @Override
    public int getTotalDwellMinutes(){
        return dwellMinutes;
    }

    public String getName(){
        return name;
    }
}
