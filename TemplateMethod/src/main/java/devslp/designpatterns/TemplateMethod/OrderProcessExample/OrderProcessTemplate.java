package devslp.designpatterns.TemplateMethod.OrderProcessExample;

public abstract class OrderProcessTemplate {

    public abstract void doSelect();

    public abstract void doPayment();

//    public final void giftWrap() {
    public  void giftWrap() {
        System.out.println("Gift wrap done.");
    }

    public abstract void doDelivery();

    /* This is the template method */
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();
    }
}
