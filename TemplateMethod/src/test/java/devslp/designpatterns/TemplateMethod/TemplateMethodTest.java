package devslp.designpatterns.TemplateMethod;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class TemplateMethodTest {

    @Test
    public void testNetOrder()
    {
        OrderProcessTemplate netOrder = mock(NetOrder.class);
        netOrder.processOrder(true);

        verify(netOrder, times(1)).doSelect();
        verify(netOrder, times(1)).doPayment();
        verify(netOrder, times(1)).giftWrap();
        verify(netOrder, times(1)).doDelivery();
    }

    @Test
    public void testStoreOrder()
    {
        OrderProcessTemplate storeOrder = mock(StoreOrder.class);
        storeOrder.processOrder(false);

        verify(storeOrder, times(1)).doSelect();
        verify(storeOrder, times(1)).doPayment();
        verify(storeOrder, times(0)).giftWrap();
        verify(storeOrder, times(1)).doDelivery();
    }
}
