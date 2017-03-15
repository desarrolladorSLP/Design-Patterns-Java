package devslp.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    private List<Observer> observerList;

    public Subject(){
        observerList = new LinkedList<>();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void setState(String message){
        observerList.forEach(o -> o.update(message));
    }

}
