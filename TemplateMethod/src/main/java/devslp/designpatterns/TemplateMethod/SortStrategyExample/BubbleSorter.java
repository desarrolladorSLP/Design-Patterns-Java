package devslp.designpatterns.TemplateMethod.SortStrategyExample;


public class BubbleSorter {
    private int length;
    private SortHandler itsSortHandler;

    public BubbleSorter(SortHandler handler)
    {
        itsSortHandler = handler;
    }

    /*
    Reference: https://en.wikipedia.org/wiki/Bubble_sort
     */
    public void sort(Object [] array) {
        itsSortHandler.setArray(array);
        length = itsSortHandler.getLength();
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 1; i < length; i++) {
                // if this pair is out of order
                if (itsSortHandler.outOfOrder(i)) {
                    // swap them and remember something changed
                    itsSortHandler.swap(i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped);
    }
}
