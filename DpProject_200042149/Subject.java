package DpProject_200042149;

import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObservers();
}
