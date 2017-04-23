package devslp.designpattern.observer.manual;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import devslp.designpatterns.observer.manual.ComboBox;
import devslp.designpatterns.observer.manual.ListDataModel;
import devslp.designpatterns.observer.manual.ListView;
import devslp.designpatterns.observer.manual.Observer;

public class ObserverTest {

    @Test
    public void viewOneObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ListView.class);

        dataModel.attach(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update();
    }

    @Test
    public void viewTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.attach(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");
        dataModel.addString("Label 3");

        verify(observer, times(3)).update();
    }

    @Test
    public void viewOneAndTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer1 = mock(ComboBox.class);
        Observer observer2 = mock(ListView.class);

        dataModel.attach(observer1);
        dataModel.attach(observer2);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer1, times(2)).update();
        verify(observer2, times(2)).update();
    }


    @Test
    public void whenAnObserverIsAttachedMoreThanOnceJustIsNotifiedOnceForEachEvent() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.attach(observer);
        dataModel.attach(observer);
        dataModel.attach(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update();
    }

    @Test
    public void afterRemovingAnObserverItShouldNotBeNotified() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.attach(observer);
        dataModel.attach(observer);
        dataModel.attach(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update();

        reset(observer);

        dataModel.detach(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(0)).update();
    }

}
