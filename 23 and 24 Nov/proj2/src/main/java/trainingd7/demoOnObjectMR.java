package trainingd7;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class demoOnObjectMR {
	
	public static void main (String[] args) {
	
		String myName = "Aditya Goel";
		
		Supplier<Integer> lengthUsingLamda = ()->myName.length();
		System.out.println(lengthUsingLamda.get());
		
		Supplier<Integer> lengthUsingMR = myName::length;
		System.out.println(lengthUsingMR.get());
		
		Hello h = new Hello();
		
		Supplier <String> helloLamda = ()->h.sayHello();
		System.out.println(helloLamda.get());
		
		Supplier <String> helloMr = h::sayHello;
		System.out.println(helloMr.get());
		
		NumUtil number = new NumUtil();
		
		Function <Integer, Integer> cube = number::cubeNumber;
		
		Predicate <Integer> isEvenCheck = number::isEven;
		
		Function <Double, Double> logg = number::logrithm;
		
		System.out.println(cube.apply(8));
		System.out.println(logg.apply(8.0));
		System.out.println(isEvenCheck.test(8));
		
		int arr1[] = {1,33,3,66,5};
		
		Predicate <String> checkA = h::filterby;
		
		String[] str = {"Aditya", "Gargi", "Amit"};
		
		for(int i=0; i<str.length;i++) {
			if(checkA.test(str[i])) System.out.println(str[i]);
		}
		
//		Consumer <int[]> printt = number.printNum;
//		printt.accept(arr1);
	}
}



class Hello{
	public String sayHello() {
		return "Hello....";
	}
	
	public boolean filterby(String str) {
		return str.startsWith("A");
	}
}

class NumUtil{


	public int cubeNumber(int num) {
		return num*num*num;
	}
	
	public double logrithm(double num) {
		return Math.log(num);
	}
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public void printNum (int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}