package devslp.designpatterns.TemplateMethod.SortMethodTemplateExample;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BubbleSorterTest {
    @Test
    public void testIntBubbleSorter()
    {
        int [] intArray = {5, 1, 4, 2, 8};
        IntBubbleSorter intBubbleSorter = new IntBubbleSorter();
        intBubbleSorter.sort(intArray);
        assertEquals(intArray[0], 1);
        assertEquals(intArray[1], 2);
        assertEquals(intArray[2], 4);
        assertEquals(intArray[3], 5);
        assertEquals(intArray[4], 8);
    }

    @Test
    public void testDoubleBubbleSorter()
    {
        double [] dblArray = {5.5, 1.1, 4.4, 2.2, 8.8};
        DoubleBubbleSorter dblBubbleSorter = new DoubleBubbleSorter();
        dblBubbleSorter.sort(dblArray);
        assertEquals(dblArray[0], 1.1, 0.0);
        assertEquals(dblArray[1], 2.2, 0.0);
        assertEquals(dblArray[2], 4.4, 0.0);
        assertEquals(dblArray[3], 5.5, 0.0);
        assertEquals(dblArray[4], 8.8, 0.0);
    }
}
