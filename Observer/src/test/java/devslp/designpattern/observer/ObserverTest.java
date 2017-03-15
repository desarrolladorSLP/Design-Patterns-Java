package devslp.designpattern.observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import devslp.designpatterns.observer.Observer;
import devslp.designpatterns.observer.Subject;
import devslp.designpatterns.observer.ViewOne;
import devslp.designpatterns.observer.ViewTwo;

public class ObserverTest {

    @Test
    public void viewOneObservesSubjectAndItsMethodUpdateMustBeCalled() {
        Subject subject = new Subject();
        Observer observer = mock(ViewOne.class);
        String someMessage = "Some message";

        subject.attach(observer);

        subject.setState(someMessage);
        subject.setState(someMessage);

        verify(observer, times(2)).update();
    }

    @Test
    public void viewTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        Subject subject = new Subject();
        Observer observer = mock(ViewTwo.class);
        String someMessage = "Some message";

        subject.attach(observer);

        subject.setState(someMessage);
        subject.setState(someMessage);

        verify(observer, times(2)).update();
    }


}
