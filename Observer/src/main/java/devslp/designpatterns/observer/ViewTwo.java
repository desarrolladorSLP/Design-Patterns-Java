package devslp.designpatterns.observer;

public class ViewTwo implements Observer {

    private String lastMessage;

    @Override
    public void update(String message) {

    }

    public String getLastMessage() {
        return lastMessage;
    }
}
