package devslp.designpatterns.TemplateMethod.SortStrategyExample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortStrategyTest {
    @Test
    public void testBubbleSorter()
    {
        Object [] theArray = {5, 1, 4, 2, 8};
        DoubleSortHandler intSortHandler = new DoubleSortHandler();
        BubbleSorter bubbleSorter = new BubbleSorter(intSortHandler);
        bubbleSorter.sort(theArray);
        assertEquals(intSortHandler.getArray()[0], 1);
        assertEquals(intSortHandler.getArray()[1], 2);
        assertEquals(intSortHandler.getArray()[2], 4);
        assertEquals(intSortHandler.getArray()[3], 5);
        assertEquals(intSortHandler.getArray()[4], 8);
    }
}
