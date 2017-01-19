package tr.com.pironix.creational.singleton;

/**
 * Enum Singleton Class
 * <p>
 * Created by pironix on 7/24/2016.
 *
 * @author ibrahim KARAYEL
 *         <p>
 *         Reflection can be used to destroy all the singleton implementation approaches.
 *         To overcome this situation with Reflection enum implementaion singleton is used
 *         Enum implement Singleton design pattern  as Java ensures that any enum value is instantiated only once in a Java program.
 */
public enum EnumSingleton {
    SINGLETON_INSTANCE;

    public static void doSomething() {
        System.out.println("Enum Singleton doSome");
    }
}
