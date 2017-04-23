package devslp.designpatterns.TemplateMethod.SortStrategyExample;

public interface SortHandler {
    boolean outOfOrder(int index);
    void swap(int index);
    int getLength();
    void setArray(Object [] array);
    Object [] getArray();
}
