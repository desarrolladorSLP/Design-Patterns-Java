package proxy_tests;

import org.junit.Assert;
import org.junit.Test;

import proxy.IvoryTower;
import proxy.Wizard;
import proxy.WizardTowerProxy;

public class Proxy_Tests {

    @Test
    public void testEnterApproved() throws Exception {
        WizardTowerProxy towerProxy = new WizardTowerProxy(new IvoryTower());

        towerProxy.enter(new Wizard("Ryze"));
        towerProxy.enter(new Wizard("Dumbledore"));
        towerProxy.enter(new Wizard("Oz"));
        towerProxy.enter(new Wizard("Merlin"));

        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Ryze"));
        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Dumbledore"));
        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Oz"));
        Assert.assertFalse("This wizard has entered in tower", towerProxy.is_inside("Merlin"));
    }

    @Test
    public void testEnterDisaproved() throws Exception {
        WizardTowerProxy towerProxy = new WizardTowerProxy(new IvoryTower());

        towerProxy.enter(new Wizard("Gandalf"));
        towerProxy.enter(new Wizard("Dumbledore"));
        towerProxy.enter(new Wizard("Oz"));

        Assert.assertFalse("This wizard has entered in tower", towerProxy.is_inside("Ryze"));
        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Dumbledore"));
        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Oz"));
        Assert.assertTrue("This wizard has entered in tower", towerProxy.is_inside("Gandalf"));
    }
}
