package devslp.designpatterns.TemplateMethod;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through cash");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to customer in delivery counter.");
    }

}
