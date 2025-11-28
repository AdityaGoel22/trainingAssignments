package trainingd9.d10;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	
    	// Immutable class
    	// 1. Class need to be final
    	// 2. Properties need to be final;
    	// 3. property need to get value through construction
    	// 4. no setters to modify data.
    	
    	Person p1 = new Person("Aditya", 4564);
    	System.out.println(p1);
    }
}
