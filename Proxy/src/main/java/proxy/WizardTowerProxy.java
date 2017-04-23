package proxy;

public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;
    private int numWizards;
    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else
            System.out.println(wizard.getName() + " is not allowed to enter");
    }

    @Override
    public boolean is_inside(String name) {
        return tower.is_inside(name);
    }

}
