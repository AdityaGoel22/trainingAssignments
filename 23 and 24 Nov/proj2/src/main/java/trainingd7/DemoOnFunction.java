package trainingd7;

import java.util.function.*;

public class DemoOnFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> sqFunction = (a) -> a * a;

		int arr[] = { 3, 6, 8, 4, 11, 32 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(sqFunction.apply(arr[i]));
		}

		Function<String, String> upper = (str) -> str.toUpperCase();

		String[] arr1 = { "Aditya", "Gargi", "Leheri", "raHul" };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(upper.apply(arr1[i]));
		}

//		Function<Employee, String> upper1 = (e) -> e.getEmpName().toUpperCase();
//
//		for (Employee e1:empArr) {
//			System.out.println(upper1.apply(e1));
//		}
		
		Function <Integer, Integer> add20 = (num) -> num + 20;
		
		System.out.println(sqFunction.andThen(add20).apply(5));
		System.out.println(add20.andThen(sqFunction).apply(5));
		
		
//		Function <Employee, Integer> checkSalary = (e) -> {
//			if(e.getSalary()>50000) return  e;
//			else return null;
//		};
//		
//		Function <Integer, Integer> bonus = (num) -> num + 20;
		
		
	}
}
