package devslp.designpatterns.TemplateMethod.SortMethodTemplateExample;

public abstract class BubbleSorter {
    protected int length;

    /**
     * This is the template method.
     */
    public final void doSort() {
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 1; i < length; i++) {
                // if this pair is out of order
                if (outOfOrder(i)) {
                    // swap them and remember something changed
                    swap(i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped);
    }

    protected abstract boolean outOfOrder(int index);
    protected abstract void swap(int index);
}
