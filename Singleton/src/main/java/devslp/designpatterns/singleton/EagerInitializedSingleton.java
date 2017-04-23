package devslp.designpatterns.singleton;

/**
 * In this class the unique instance is created at the time of class loading.
 * This is a easier implementation but the problem is that the instance is created
 * even if the application never uses it.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
