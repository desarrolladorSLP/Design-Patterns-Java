package devslp.designpatterns.abstractfactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import devslp.designpatterns.abstractfactory.ingenico.IngenicoIO;
import devslp.designpatterns.abstractfactory.ingenico.model320.Ingenico320IO;
import devslp.designpatterns.abstractfactory.verifone.VerifoneIO;
import devslp.designpatterns.abstractfactory.verifone.model3070.Verifone3070IO;

public class TerminalIOFactoryTest {

    @Test
    public void getTerminalIOForVerifone() {

        TerminalIOFactory terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.VERIFONE);

        assertTrue(terminalIOFactory instanceof VerifoneIO);

    }

    @Test
    public void getTerminalIOForVerifone3070() {

        TerminalIOFactory terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.VERIFONE3070);

        assertTrue(terminalIOFactory instanceof Verifone3070IO);

    }

    @Test
    public void getTerminalIOForIngenico() {

        TerminalIOFactory terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.INGENICO);

        assertTrue(terminalIOFactory instanceof IngenicoIO);

    }

    @Test
    public void getTerminalIOForIngenico320() {

        TerminalIOFactory terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.INGENICO320);

        assertTrue(terminalIOFactory instanceof Ingenico320IO);

    }
}
