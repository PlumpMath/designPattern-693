package tr.com.pironix.creational.singleton;

/**
 * Eager Initialized Singleton Class
 * <p>
 * Created by pironix on 7/24/2016.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         the instance of Singleton Class is created at the time of class loading
 *         it has a drawback that instance is created even though client application might not be using it.
 */
public class EagerInitSingleton {
    private static final EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        return instance;
    }
}
