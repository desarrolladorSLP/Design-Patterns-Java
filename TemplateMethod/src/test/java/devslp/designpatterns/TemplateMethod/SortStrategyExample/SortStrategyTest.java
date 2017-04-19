package devslp.designpatterns.TemplateMethod.SortStrategyExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortStrategyTest {
    @Test
    public void testBubbleSorter() {
        Object[] theArray = {5.0, 1.0, 4.0, 2.0, 8.0};
        DoubleSortHandler doubleSortHandler = new DoubleSortHandler();
        BubbleSorter bubbleSorter = new BubbleSorter(doubleSortHandler);
        bubbleSorter.sort(theArray);
        assertEquals(doubleSortHandler.getArray()[0], 1.0);
        assertEquals(doubleSortHandler.getArray()[1], 2.0);
        assertEquals(doubleSortHandler.getArray()[2], 4.0);
        assertEquals(doubleSortHandler.getArray()[3], 5.0);
        assertEquals(doubleSortHandler.getArray()[4], 8.0);
    }
}
