package bustracker;
import java.util.*;

 public class Bus{
    private String busNumber;
    private Driver driver;
    private ArrayList<BusStop> busStopList = new ArrayList<>();

    public Bus(String busNumber, Driver driver){
        this.busNumber = busNumber;
        assignDriver(driver);
    }

    public String getBusNumber(){
        return busNumber;
    }

    public Driver getDriver(){
        return driver;
    }

    public void assignDriver(Driver driver){
        this.driver = driver;
        driver.allocate(this);
    }

    public String toString(){
        return String.format("%s(%s)", busNumber, driver.getName());
    }

    public ArrayList<BusStop> getStops(){
        return busStopList;
    }

    public void setBusStopList(ArrayList<BusStop> list){
        this.busStopList = list;
    }

     public void addStop(BusStop stop) {
         busStopList.add(stop);
     }
}