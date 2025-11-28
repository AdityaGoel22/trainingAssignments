package trainingd6.proj2;

import java.util.Arrays;

public class print {
	public static void main(String[] args) {
		
//		Printt c = (String name)->System.out.println(name);
//		
//		c.printName("Aditya");
		
//		Printt c = (String str)->System.out.println(new StringBuffer(str).reverse().toString());
//		
//		c.stringReverse("ady");
		
//		Printt c = (int num)->{
//			if(num%2==0)System.out.println("is Even");
//			else System.out.println("is odd");
//		};
//		
//		c.checkEven(6);
		
//		Printt c = (int[] arr)->{
//			for(int i : arr)	System.out.println(i*i);
//		};
//		
//		int[] arr = {3,6,4,9};
//		
//		c.sqArr(arr);
		
//		Printt s = (String[] arr)->{
//			Arrays.sort(arr);
//			for(String i:arr) System.out.println(i);
//		};
//		
//		String[] arr = { "Mukund","Aditya","Orange", "Apple"};
//		
//		s.sortStrings(arr);
		
		Printt s = (String[] aa)->{
			int[] len = null;
			for(int i=0; i<aa.length;i++) {
				len[i] = aa[i].length();
			}
			return len;
		};
		
		String[] arr =  { "Mukund","Aditya","Orange", "Apple"};
		
		for (int i = 0; i<arr.length;i++) System.out.println(s.findLength(arr));
		
	}
}

// sort emp array by salary using lamda
