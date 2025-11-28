package trainingd7;

import java.util.function.Predicate;

public class DemoOnPredicate {
	
	public static void main(String[] args) {
		
		Predicate <Integer> isEven = (n)->n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(35)){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		System.out.println(isEven.test(76) ? "Even" : "Odd");
		
		Predicate <String> checkLen = (str)->str.length()>7;
		
		System.out.println(checkLen.test("Aditya"));
		
//		Predicate <Employee> checkSalary = (err) -> {
//			return err.getSalary() >= 50000;
//		};
//		
//		for(Employee e:empArr) {
//			if (checkSalary.test(e)) {
//				System.out.println(e);
//			}
//		}
		
	}
}
