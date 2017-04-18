package devslp.designpatterns.singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void verifyUniqueInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assert (singleton1 == singleton2);
    }

    @Test
    public void verifyEagerUniqueInstance() {
        EagerInitializedSingleton singleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton singleton2 = EagerInitializedSingleton.getInstance();
        assert (singleton1 == singleton2);
    }

    @Test
    public void verifyStaticBlockUniqueInstance() {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        assert (singleton1 == singleton2);
    }

    @Test
    public void verifyThreadSafeUniqueInstance() {
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstance();
        assert (singleton1 == singleton2);
    }

    @Test
    public void verifyThreadSafeDoubleLockUniqueInstance() {
        ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton singleton2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        assert (singleton1 == singleton2);
    }
}
