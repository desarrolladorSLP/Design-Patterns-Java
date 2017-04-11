package devslp.designpatterns.TemplateMethod.SortStrategyExample;

/*
  The IntSortHandler class knows nothing whatever of the BubbleSorter,
  having no dependency whatever on the bubble sort implementation.
*/
public class IntSortHandler implements SortHandler {
    private int [] array;

    public void setArray(Object [] theArray)
    {
        array = new int[theArray.length];
        for (int i = 0; i < theArray.length ; i++) {
            array[i] = (int)theArray[i];
        }
    }

    public Object[] getArray() {
        return array;
    }

    public int getLength()
    {
        return array.length;
    }

    public boolean outOfOrder(int index) {
        return (array[index-1] > array[index]);
    }

    public void swap(int index)
    {
        int temp = array[index-1];
        array[index-1] = array[index];
        array[index] = temp;
    }
}
