/**
 * Created by ibrahim on 7/24/2016.
 * <p>
 * <b>Decorator Design Pattern</b>
 * <p>
 * <p>
 * Intent
 * <p>
 * The intent of this pattern is to add additional responsibilities dynamically to an object.
 * </p>
 * Decorator design pattern is used to modify the functionality of an object at runtime.</br>
 * At the same time other instances of the same class will not be affected by this,</br>
 * so individual object gets the modified behavior. Decorator design pattern is</br>
 * one of the structural design pattern (such as Adapter Pattern, Bridge Pattern,</br>
 * Composite Pattern) and uses abstract classes or interface with composition to implement.
 * </p>
 * <p>
 * All subclasses of java.io.InputStream, OutputStream,
 * Reader and Writer have a constructor taking an instance of same type.
 * java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
 * javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
 * </p>
 *
 * @author ibrahim KARAYEL
 */
package tr.com.pironix.structural.decorator;