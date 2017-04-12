package proxy;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by devcrack on 11/04/17.
 */
public class IvoryTower implements WizardTower {

    private final ArrayList<Wizard> wizard_logged;

    public IvoryTower()
    {
        wizard_logged = new ArrayList<Wizard>();
    }

    @Override
    public void enter(Wizard wizard) {

        wizard_logged.add(wizard);
        System.out.println("The Wizard " + wizard.getName() +  " has entered");
    }

    @Override
    public boolean whois_inside(String name) {
        Iterator it = this.wizard_logged.iterator();
        Wizard tmp_wzd;

        while(it.hasNext())
        {
            tmp_wzd = (Wizard) it.next();
            if(tmp_wzd.getName().compareTo(name) == 0)
                return true;
        }

        return false;
    }


}
