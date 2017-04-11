package devslp.designpatterns.observer.manual;

import java.util.LinkedHashSet;
import java.util.Set;

public class DataModel {
    private Set<Observer> observerList;

    public DataModel() {
        observerList = new LinkedHashSet<>();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void updateObservers() {
        observerList.forEach(o -> o.update());
    }
}
