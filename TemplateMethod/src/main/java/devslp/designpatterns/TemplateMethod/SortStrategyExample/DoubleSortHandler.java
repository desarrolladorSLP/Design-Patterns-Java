package devslp.designpatterns.TemplateMethod.SortStrategyExample;

public class DoubleSortHandler implements SortHandler {
    private Double[] array;

    public void setArray(Object[] theArray) {
        array = new Double[theArray.length];

        System.arraycopy(theArray, 0, array, 0, theArray.length);
    }

    @Override
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
        double temp = array[index - 1];
        array[index - 1] = array[index];
        array[index] = temp;
    }
}
