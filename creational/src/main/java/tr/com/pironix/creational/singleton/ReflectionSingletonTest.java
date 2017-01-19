package tr.com.pironix.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by kkbat on 7/24/2016.
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitSingleton instanceOne = EagerInitSingleton.getInstance();
        EagerInitSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
