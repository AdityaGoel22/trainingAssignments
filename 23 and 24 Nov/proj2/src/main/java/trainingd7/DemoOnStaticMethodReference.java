package trainingd7;

import java.util.function.Function;
import java.util.function.Predicate;

public class DemoOnStaticMethodReference {
	
	//classname::method (astract)
	//objname::method
	
	static class NumberUtil{
		
		public static int squareNumber(int num) {
			return num*num;
		}
		
		public static double logrithm(double num) {
			return Math.log(num);
		}
		
		public static boolean isEven(int num) {
			return num%2==0;
		}
	}
	
	
	public static void main (String[] args) {
		
		Function<Integer, Integer> sqareFunction = (num) -> NumberUtil.squareNumber(num);
		Function<Integer, Integer> sqareFunctionMR = NumberUtil::squareNumber;
		
		System.out.println(sqareFunction.apply(6));
		System.out.println(sqareFunctionMR.apply(6));
		
		Function <Double, Double> logMr = NumberUtil::logrithm;
		System.out.println(logMr.apply(3.00));
		
		Predicate<Integer> isEvenL = (num)->NumberUtil.isEven(num);
		Predicate <Integer> isEvenMr = NumberUtil::isEven;
		
		//static string method to find length using mr
		
		
		
	}
}
