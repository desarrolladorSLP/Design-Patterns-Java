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


    @Test
    public void viewTwoObservesSubjectAndItsMethodUpdateMustBeCalled() {
        Subject subject = new Subject();
        ViewTwo viewTwo = new ViewTwo();
        String someMessage = "Some message";

        subject.attach(viewTwo);

        assertEquals(null, viewTwo.getLastMessage());

        subject.setState(someMessage);

        assertEquals(someMessage, viewTwo.getLastMessage());

    }

}
