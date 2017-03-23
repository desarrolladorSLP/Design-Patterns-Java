package devslp.designpatterns.observer.manual;

import java.util.Iterator;

public class ListView implements Observer {

    private ListDataModel dataModel;

    @Override
    public void update() {
        System.out.println("Printing ListView");

        Iterator<String> iterator = dataModel.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public ListDataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(ListDataModel dataModel) {
        this.dataModel = dataModel;
    }
}
