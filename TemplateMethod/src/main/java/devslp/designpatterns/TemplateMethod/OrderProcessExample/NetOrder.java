package devslp.designpatterns.TemplateMethod.OrderProcessExample;

public class NetOrder extends OrderProcessTemplate
{
        @Override
        public void doSelect() {
            System.out.println("Item added to online shopping cart.");
            System.out.println("Get delivery address.");
        }

        @Override
        public void doPayment() {
            System.out.println("Online Payment through credit card.");
        }

        @Override
        public void doDelivery() {
            System.out.println("Ship the item through post to delivery address.");
        }
}
