package devslp.designpatterns.observer.manual;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDataModel extends DataModel{

    private List<String> elements;

    public ListDataModel() {
        elements = new LinkedList<>();

    }

    public Iterator<String> iterator() {
        return elements.iterator();
    }

    public void addString(String label) {
        elements.add(label);

        updateObservers();
    }

    public void removeString(int index) {
        elements.remove(index);

        updateObservers();
    }

}
