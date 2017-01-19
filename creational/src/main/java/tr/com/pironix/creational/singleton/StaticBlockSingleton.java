package tr.com.pironix.creational.singleton;

/**
 * Static Block Singleton Class
 * <p>
 * Created by pironix on 7/24/2016.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         Static block initialization implementation is similar to eager initialization,
 *         except that instance of class is created in the static block that provides option for exception handling.
 *         static block initialization creates the instance even before it’s being used
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred during creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
