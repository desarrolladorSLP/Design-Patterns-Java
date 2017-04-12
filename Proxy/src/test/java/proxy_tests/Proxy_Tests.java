package proxy_tests;

import org.junit.Assert;
import org.junit.Test;
import proxy.IvoryTower;
import proxy.Wizard;
import proxy.WizardTower;
import proxy.WizardTowerProxy;

/**
 * Created by devcrack on 11/04/17.
 */
public class Proxy_Tests {

    @Test
    public void testEnterApproved() throws Exception
    {
        final Wizard[]wizards = new Wizard[]
                {
                        new Wizard("Ryze"),
                        new Wizard("Dumbledore"),
                        new Wizard("Oz"),
                        new Wizard("Merlin")
                };
        WizardTowerProxy towerProxy = new WizardTowerProxy(new IvoryTower());

        for(Wizard wizard : wizards)
        {
            towerProxy.enter(wizard);
        }
        Assert.assertTrue("This wizard has entered in tower", towerProxy.whois_inside("Oz"));
    }

    @Test
    public void testEnterDisaproved() throws Exception
    {
        final Wizard[]wizards = new Wizard[]
                {
                        new Wizard("Gandalf"),
                        new Wizard("Dumbledore"),
                        new Wizard("Oz")
                };
        WizardTowerProxy towerProxy = new WizardTowerProxy(new IvoryTower());

        for(Wizard wizard : wizards)
        {
            towerProxy.enter(wizard);
        }
        Assert.assertFalse(towerProxy.whois_inside("Ryze"));

    }
}
