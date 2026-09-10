package bustracker;
//Base class composite hierarchy
public abstract class RouteComponent{

    protected String name;
    protected int dwellMinutes;

    public RouteComponent(String name, int dwellMinutes){
        this.name = name;
        this.dwellMinutes = dwellMinutes;
    }

    public String toString(){
        return String.format("%s(%dmin)", name, dwellMinutes);
    }

    public abstract int getTotalDwellMinutes();
}
