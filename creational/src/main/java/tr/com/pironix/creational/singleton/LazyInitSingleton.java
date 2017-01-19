package tr.com.pironix.creational.singleton;

/**
 * Lazy Initialized Singleton Class
 * <p>
 * Created by pironix on 7/24/2016.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         the instance of Singleton Class is created at when clent need it
 *         The Lazy  Initialized implementation works fine incase of single threaded environment but when it comes to multithreaded systems,
 *         it can cause issues if multiple threads are inside the if loop at the same time.
 *         It will destroy the singleton pattern and both threads will get the different instances of singleton class.
 */
public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}
