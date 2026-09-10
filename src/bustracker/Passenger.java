package bustracker;

import java.util.Observable;
import java.util.Observer;
//Passenger observer
@SuppressWarnings("deprecation")
public class Passenger implements Observer {
    private String name;

    public Passenger(String name) { this.name = name; }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " received update: " + arg);
    }
}