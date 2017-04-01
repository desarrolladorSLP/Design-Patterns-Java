package devslp.designpattern.observer.withjdk;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Observer;

import org.junit.Test;
import org.mockito.Mockito;

import devslp.designpatterns.observer.withjdk.ComboBox;
import devslp.designpatterns.observer.withjdk.ListDataModel;
import devslp.designpatterns.observer.withjdk.ListView;


public class ObserverTest {

    @Test
    public void viewOneObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ListView.class);

        dataModel.addObserver(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update(Mockito.any(), Mockito.any());
    }

    @Test
    public void viewTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.addObserver(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");
        dataModel.addString("Label 3");

        verify(observer, times(3)).update(Mockito.any(), Mockito.any());
    }

    @Test
    public void viewOneAndTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer1 = mock(ComboBox.class);
        Observer observer2 = mock(ListView.class);

        dataModel.addObserver(observer1);
        dataModel.addObserver(observer2);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer1, times(2)).update(Mockito.any(), Mockito.any());
        verify(observer2, times(2)).update(Mockito.any(), Mockito.any());
    }


    @Test
    public void whenAnObserverIsAttachedMoreThanOnceJustIsNotifiedOnceForEachEvent() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.addObserver(observer);
        dataModel.addObserver(observer);
        dataModel.addObserver(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update(Mockito.any(), Mockito.any());
    }

    @Test
    public void afterRemovingAnObserverItShouldNotBeNotified() {
        ListDataModel dataModel = new ListDataModel();
        Observer observer = mock(ComboBox.class);

        dataModel.addObserver(observer);
        dataModel.addObserver(observer);
        dataModel.addObserver(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(2)).update(Mockito.any(), Mockito.any());

        reset(observer);

        dataModel.deleteObserver(observer);

        dataModel.addString("Label 1");
        dataModel.addString("Label 2");

        verify(observer, times(0)).update(Mockito.any(), Mockito.any());
    }

}
