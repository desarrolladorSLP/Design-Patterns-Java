package devslp.designpatterns.observer.withjdk;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;


public class ComboBox implements Observer {

    private ListDataModel dataModel;

    public ListDataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(ListDataModel dataModel) {
        this.dataModel = dataModel;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Printing ComboBox");

        Iterator<String> iterator = dataModel.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
