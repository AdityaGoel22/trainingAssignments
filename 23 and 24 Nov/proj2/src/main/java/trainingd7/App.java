package trainingd7;

import java.util.Arrays;

public class App {
	
	public static void main (String[] args) {
	
		String name = "Adiya";
		
//		supplier <String> supplier = ()->name.toUpperCase();
		
		supplier<Integer[]> sortCust =(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			return arr;
		};
		
		Integer[] array = {24,67,54,90,19};
		
		sortCust.accept(array);
		
		
		
	}
}
