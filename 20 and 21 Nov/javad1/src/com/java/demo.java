package com.java;

public class demo {
	
	public static void main(String[] args) {
		
		int i = 0;
		short s = 0;
		long l = 0;
		float f = 0f; 
		double d = 0;
		byte b = 0; 
		boolean bl = false; 
		char c = 'a';
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(bl);
		System.out.println(c);
		
		Integer i1 = i; 
		System.out.println((float)5/(float)9);
		
		int j=5;
		int k =7;
		System.out.println(j>>1);
		int a = i>j ? i>k ? i : k : j>k ? j : k;
		
		//accepts a mobile number and check if it is valid or not (start with 6-9, and length 10)
		
	}
	
}