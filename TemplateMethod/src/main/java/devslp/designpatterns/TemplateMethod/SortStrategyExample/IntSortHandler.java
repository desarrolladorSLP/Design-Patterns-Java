package devslp.designpatterns.TemplateMethod.SortStrategyExample;

/*
  The IntSortHandler class knows nothing whatever of the BubbleSorter,
  having no dependency whatever on the bubble sort implementation.
*/
public class IntSortHandler implements SortHandler {
    private Integer[] array;

    public void setArray(Object[] theArray) {
        array = new Integer[theArray.length];

        System.arraycopy(theArray, 0, array, 0, theArray.length);
    }

    public Object[] getArray() {
        return array;
    }

    public int getLength() {
        return array.length;
    }

    public boolean outOfOrder(int index) {
        return (array[index - 1] > array[index]);
    }

    public void swap(int index) {
        int temp = array[index - 1];
        array[index - 1] = array[index];
        array[index] = temp;
    }
}
