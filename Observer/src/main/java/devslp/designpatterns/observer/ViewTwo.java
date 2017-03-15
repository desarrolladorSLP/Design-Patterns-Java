package devslp.designpatterns.observer;

public class ViewTwo implements Observer {

    private String lastMessage;

    @Override
    public void update(String message) {
        lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
