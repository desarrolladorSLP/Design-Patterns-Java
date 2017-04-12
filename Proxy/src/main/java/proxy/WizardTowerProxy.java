package proxy;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by devcrack on 11/04/17.
 */
public class WizardTowerProxy implements WizardTower
{

    private static final int NUM_WIZARDS_ALLOWED = 3;
    private int numWizards;
    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard)
    {
        if (numWizards < NUM_WIZARDS_ALLOWED)
        {
            tower.enter(wizard);
            numWizards++;
        }
        else
            System.out.println(wizard.getName() + " is not allowed to enter");
    }

    @Override
    public boolean whois_inside(String name) {
        return tower.whois_inside(name);
    }

}
