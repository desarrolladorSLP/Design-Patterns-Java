package devslp.designpattern.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import devslp.designpatterns.observer.Subject;
import devslp.designpatterns.observer.ViewOne;
import devslp.designpatterns.observer.ViewTwo;

public class ObserverTest {

    @Test
    public void viewOneObservesSubjectAndItsMethodUpdateMustBeCalled() {
        Subject subject = new Subject();
        ViewOne viewOne = new ViewOne();
        String someMessage = "Some message";

        subject.attach(viewOne);

        assertEquals(null, viewOne.getLastMessage());

        subject.setState(someMessage);

        assertEquals(viewOne.getLastMessage(), someMessage);

    }



}
