package proj1.proj1;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
    	emp emp1 = new emp(null, 0, null, null, 0);
    	System.out.println(emp1);
    	emp1.setEmpId(123);
    	emp1.setEmpName("ADITYA");
    	emp1.setDesg("SDE 3");
    	emp1.setMobileNum("9899555883");
    	System.out.println(emp1);
    }
}
