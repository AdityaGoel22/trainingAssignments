package trainingd6.proj2;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		empd emp[] = new empd[5];
		
		empd emp1 = new empd(1, "Aditya", 50000, "SWE3", "Blr");
		empd emp2 = new empd(2, "Pranav", 20000, "Sales", "Del");
		empd emp3 = new empd(3, "Mukund", 25000, "CA", "Del");
		empd emp4 = new empd(4, "Vansh", 90000, "SWE4", "Aus");
		empd emp5 = new empd(5, "Aaryaman", 45000, "Sales", "Del");
		
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;
		emp[4] = emp5;
		
		for (int i = 0; i<emp.length; i++) {
			System.out.println("Annual Salary of " + emp[i].getEname() + " is " + emp[i].annualSalary() );
		}
		
		int[] arr = {10,60,20,30,15,40,50};
		
		System.out.println(Arrays.toString(arr));
		
//		String nums = Arrays.toString(arr);
		
//		Arrays.sort(arr);
//		for(int ele:arr)
//			System.out.println(ele);
//		
		System.out.println(Arrays.binarySearch(arr, 30));
		
		int[] arr1 = {10,60,20,30,15,40,50};
		
		System.out.println(Arrays.equals(arr, arr1));
		
		int[] crr = Arrays.copyOf(arr1, 10);
		
//		for(int ele:crr)
//		System.out.println(ele);
//		
//		Arrays.fill(arr1, 69);
//		for(int ele:arr1)
//			System.out.println(ele);
//			
		
		
	}

}
