package bustracker;
import javax.swing.*;
import java.util.*;
//ListModel for Stops' List
public class StopListModel extends AbstractListModel<BusStop> {
    private ArrayList<BusStop> stopList;

    public StopListModel(){
        stopList = new ArrayList<>();
    }

    public int getSize(){
        return stopList.size();
    }

    public BusStop getElementAt(int index){
        return stopList.get(index);
    }

    public void addElement(BusStop element) {
        for (BusStop stop : stopList) {
            if (stop.getName().equalsIgnoreCase(element.getName())) {
                return;
            }
        }
        stopList.add(element);
        int index = stopList.size() - 1;
        fireIntervalAdded(this, index, index);
    }

    public void removeElementAt(int index){
        stopList.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    public int findStopByName(String name) {
        for (int i = 0; i < stopList.size(); i++) {
            if (stopList.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        int size = stopList.size();
        if (size > 0) {
            stopList.clear();                        // clears the ArrayList
            fireIntervalRemoved(this, 0, size - 1); // tells JList to update
        }
    }
}
