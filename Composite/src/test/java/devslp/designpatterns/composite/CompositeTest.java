package devslp.designpatterns.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CompositeTest {

    @Test
    public void testLevels() {
        int levels = 5;
        int leafs = 2;

        Manager manager = new Manager(); //mock(Manager.class);
        for (int i = 0; i < levels; i++) {
            Manager subManager = new Manager(); // mock(Manager.class);
            for (int j = 0; j < leafs; j++) {
                Developer dev = new Developer(); // mock(Developer.class);
                subManager.add(dev);
            }
            manager.add(subManager);
        }

        assertEquals((levels * leafs) + levels, manager.getSubCount(), 0);
    }


    @Test
    public void recursiveBudget() {
        // Back-end 90,000
        Developer androidDev = new Developer("John", "Android Developer", 10000);
        Developer iOSDev = new Developer("Michael", "iOS Developer", 15000);

        Manager mobileManager = new Manager("Richard", "Mobile Manager", 25000);
        mobileManager.add(androidDev);
        mobileManager.add(iOSDev);

        Developer railsDev = new Developer("Martha", "Rails Developer", 10000);

        Manager backEndManager = new Manager("Joel", "Back-end Manager", 30000);
        backEndManager.add(railsDev);
        backEndManager.add(mobileManager);

        // Front-end 50,000
        Developer reactDev1 = new Developer("Mark", "React Developer", 10000);
        Developer reactDev2 = new Developer("Laura", "React Developer", 10000);

        Manager frontEndManager = new Manager("Steve", "Backend Manager", 30000);
        frontEndManager.add(reactDev1);
        frontEndManager.add(reactDev2);

        // General 163,000
        Manager ceo = new Manager("Robert", "CEO", 50000);
        ceo.add(backEndManager);
        ceo.add(frontEndManager);

        assertEquals(2, frontEndManager.getSubCount(), 0);
        assertEquals(2, mobileManager.getSubCount(), 0);
        assertEquals(4, backEndManager.getSubCount(), 0);
        assertEquals(8, ceo.getSubCount(), 0);

        assertEquals(50000, frontEndManager.totalDivisionSalary(), 0);
        assertEquals(50000, mobileManager.totalDivisionSalary(), 0);
        assertEquals(90000, backEndManager.totalDivisionSalary(), 0);
        assertEquals(190000, ceo.totalDivisionSalary(), 0);

    }

}
