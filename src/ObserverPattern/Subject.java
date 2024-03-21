package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer o) {
        observers.add(o);
    }

    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    public void updateObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }


}
