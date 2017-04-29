package devslp.designpatterns.abstractfactory;

public interface Keyboard {

    char[] getKey();

    boolean isKeyPressed();

    boolean isKeyPressed(char c);

}
