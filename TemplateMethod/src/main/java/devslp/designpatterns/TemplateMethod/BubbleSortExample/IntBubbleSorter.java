package devslp.designpatterns.TemplateMethod.BubbleSortExample;

public class IntBubbleSorter extends BubbleSorter {
    private int [] array = null;

    public void sort(int [] theArray) {
        array = theArray;
        length = theArray.length;
        doSort();
    }

    @Override
    protected boolean outOfOrder(int index) {
        return (array[index-1] > array[index]);
    }

    @Override
    protected void swap(int index) {
        int temp = array[index-1];
        array[index-1] = array[index];
        array[index] = temp;
    }
}
