package trainingd9.d11;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	Integer arr[] = {23, 54, 12, 34, 55, 46, 33, 57, 68, 69, 74, 44, 90, 14, 24, 34};
    	Arrays.stream(arr).forEach(System.out::println);
    	
    	List<Integer> collect = Arrays.stream(arr).collect(Collectors.toList());
    	System.out.println(collect);
    	
//    	System.out.println(Arrays.stream(arr).min((a,b)->a-b).get());
//    	System.out.println(Arrays.stream(arr).min(Integer::compare));
//    	System.out.println(Arrays.stream(arr).count());
//    	System.out.println(Arrays.stream(arr).min((a,b)->b-a).get());
//    	
//    	//sum of array using reduce
//    	
//    	int sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
//    	System.out.println(sum);
//    	
//    	System.out.println(Arrays.stream(arr).reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b));
//    	System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b));
//    	
//    	//filter
//    	Stream.of(arr).filter(num->num%2==0).forEach(System.out::println);
//    	// map
//    	Stream.of(arr).map(num->num+10).forEach(System.out::println);
//    	
//    	//limit
//    	System.out.println("----------------------------------------------------------------------------------");
//    	Stream.of(arr).limit(5).forEach(System.out::println);
//    	
//    	System.out.println("----------------------------------------------------------------------------------");
//    	Stream.of(arr).skip(5).forEach(System.out::println);
//    	
//    	
//    	//distinct
//    	System.out.println("----------------------------------------------------------------------------------");
//    	Stream.of(arr).distinct().forEach(System.out::println);
//    	
//    	
//    	//anymatch
//    	System.out.println("----------------------------------------------------------------------------------");
//    	System.out.println(Stream.of(arr).anyMatch(num->num>25)); //.forEach(System.out::println);
//    	
//    	
//
//    	System.out.println("----------------------------------------------------------------------------------");
//    	System.out.println(Stream.of(arr).anyMatch(num->num>25)); //.forEach(System.out::println);
//    	
//    	System.out.println("----------------------------------------------------------------------------------");
//    	Stream.of(arr).filter(num->num%3==0).distinct().forEach(System.out::println);
//    	
//    	List<Integer> larr = Arrays.asList(arr);
//    	//Stream.of(larr).filter(num->num%3==0).distinct().forEach(System.out::println);
//    	
//    	System.out.println("----------------------------------------------------------------------------------");
//    	
//    	larr.stream().filter(num->num%3==0).distinct().skip(2).limit(2).forEach(System.out::println);
    	
    	String[] names = {"aditya", "sneha", "Vansh", "sanvi", "mukund", "sanya", "pranav", "riya", "anant", "nandini", "sachin", "tavishi"};
    	Arrays.stream(names)
    	.filter(name->name.length()>=5)
    	.filter(name->name.startsWith("s"))
    	.sorted(Comparator.reverseOrder())
    	.forEach(System.out::println);
    	
    	//steams of user defined object collection
    	
    	Emp emp1 = new Emp(1, "aditya", 70000, "BLR", "SWE");
    	Emp emp2 = new Emp(2, "sneha", 80000, "DEL", "Architecture");
    	Emp emp3 = new Emp(3, "vansh", 120000, "MEL", "SWE");
    	Emp emp4 = new Emp(4, "sanvi", 90000, "HYD", "Stocks");
    	Emp emp5 = new Emp(5, "mukund", 20000, "DEL", "CA");
    	Emp emp6 = new Emp(6, "sanya", 50000, "KOZ", "Training");
    	
    	
    	Emp[] empList = {emp1,emp2,emp3,emp4,emp5,emp6};
    	
    	ArrayList<Emp> elist = new ArrayList<Emp>(Arrays.asList(empList));
    	
    	elist.stream()
    	.filter(emp->emp.getSalary()>50000)
    	.forEach(System.out::println);
    	
    	
    }
}
