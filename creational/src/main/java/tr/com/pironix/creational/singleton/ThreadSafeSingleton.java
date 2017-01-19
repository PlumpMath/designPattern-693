package tr.com.pironix.creational.singleton;

/**
 * Thread Safe Singleton Class
 * <p>
 * Created by pironix on 7/24/2016.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         the instance of Singleton Class is created at when clent need it
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    /*
    Below implementation works fine and provides thread-safety
    but it reduces the performance because of cost associated with the synchronized method
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /*
    To avoid this extra overhead every time, double checked locking principle is used.
    In this approach, the synchronized block is used inside the if condition with an additional check to ensure that
     only one instance of singleton class is created.
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
