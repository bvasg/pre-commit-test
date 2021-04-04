/**
 * My <b>Test class</b>.
 *
 * @see Annotation
 */

public class test { 

  /**
 * Actual exception thrown is child class of class that is declared in throws.
 * It is limitation of checkstyle (as checkstyle does not know type hierarchy).
 * Javadoc is valid not declaring FileNotFoundException
 * BUT checkstyle can not distinguish relationship between exceptions.
 */
  public static void main(String[] args) {
    boolean b = true;
    int age = 21;

    System.out.println("Whats nine plus ten?");
    if (9+ 10 == 21) {
      System.out.println("Twenty-one");
      System.out.println("You stupid!");
    }    
  } 
}