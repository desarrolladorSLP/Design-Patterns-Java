package devslp.designpatterns.singleton;

/**
 * Singleton class which implements the creational singleton design pattern.
 * This pattern guarantees that only one instance of an object will be created
 * and provides a static method to access the instance.
 * This implementation is also called "Lazy Initialization"
 */
public class Singleton {
    /**
     * Class variable of the Singleton class
     */
    private static Singleton instance;

    /**
     * Constructor
     */
    private Singleton() {
    }

    /**
     * Static method of the Singleton class which exposes the retrieval of the unique instance
     *
     * @return The unique instance of the Singleton class
     */
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
