package devslp.designpatterns.TemplateMethod.SortStrategyExample;

public class DoubleSortHandler implements SortHandler {
    private double [] array;

    public void setArray(Object [] theArray)
    {
        array = new double[theArray.length];
        for (int i = 0; i < theArray.length ; i++) {
            array[i] = (double)theArray[i];
        }
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
        double temp = array[index-1];
        array[index-1] = array[index];
        array[index] = temp;
    }
}
