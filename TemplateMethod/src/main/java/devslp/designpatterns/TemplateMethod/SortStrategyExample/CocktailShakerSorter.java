package devslp.designpatterns.TemplateMethod.SortStrategyExample;


public class CocktailShakerSorter {
    private int length;
    private SortHandler itsSortHandler;

    public CocktailShakerSorter(SortHandler handler)
    {
        itsSortHandler = handler;
    }

    /*
    Reference: https://en.wikipedia.org/wiki/Cocktail_shaker_sort
     */
    public void sort(Object [] array) {
        itsSortHandler.setArray(array);
        length = itsSortHandler.getLength();
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 1; i < length - 1; i++) {
                if (itsSortHandler.outOfOrder(i)) {
                    itsSortHandler.swap(i);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = length - 1; i > 0; i--) {
                if (itsSortHandler.outOfOrder(i)) {
                    itsSortHandler.swap(i);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}


