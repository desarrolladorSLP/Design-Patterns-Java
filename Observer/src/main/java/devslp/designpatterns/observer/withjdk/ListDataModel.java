package devslp.designpatterns.observer.withjdk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class ListDataModel extends Observable {

    private List<String> elements;

    public ListDataModel() {
        elements = new LinkedList<>();
    }

    public Iterator<String> iterator() {
        return elements.iterator();
    }

    public void addString(String label) {
        elements.add(label);

        setChanged();
        notifyObservers();
    }

    public void removeString(int index) {
        elements.remove(index);

        setChanged();
        notifyObservers();
    }

}
