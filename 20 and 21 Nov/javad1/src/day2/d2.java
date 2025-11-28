package day2;

import java.util.Scanner;

public class d2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter you mobile number");
		String mobile = s.next();

		//if-else
		
		if (mobile.matches("[6-9]\\d{9}")){
			System.out.println("Valid mobile number");
		} else {
			System.out.println("not a valid number");
		}
		
		System.out.println("Enter email");
		String email =s.next();
		
		if (email.matches("")) {
			
		} else {
			
		}
		
		//Switch cases
	
		System.out.println("Enter a number A");
		int a = s.nextInt();
		System.out.println("Enter a number B");
		int b = s.nextInt();
		System.out.println("Enter +,-,* or /");
		String o =  s.next();
		
		
		switch (o) {
			case "+":
				System.out.println(a+b);
				break;
			
			case "-" :
				System.out.println(a-b);
				break;
			
			case "*" :
				System.out.println(a*b);
				break;
				
			case "/":
				System.out.println((float)a/b);
				break;
		}
		
		//loops
		
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
		
		int il=0;
		
		while (il < 10) {
			System.out.println(il);
			il++;
		}
		
		do {
			System.out.println(il);
			il++;
		} while (il<20);
		
		
		//pattern printing
		
		for (int i = 0; i<4; i++) {
			for(int k = 1; k<=3-i; k++ ) {
				System.out.print(" ");
			}
			if (i<4) {
				for (int j = 0; j<=i; j++) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		for (int i = 3; i>0; i--) {
			for(int k = 1; k<=4-i; k++ ) {
				System.out.print(" ");
			}
			if (i<4) {
				for (int j = 0; j<i; j++) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
		// check prime
		
		System.out.println("Enter a number");
		int num = s.nextInt();
		int count=0;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
		//number reversal
		System.out.println("enter number");
		 int l = s.nextInt();
		 int rev = 0; 
		 
		 while (l>0) {
			 int rem = l%10;
			 rev = rev*10 + rem;
			 l = l/10;
		}
		
		 System.out.println(rev);
		
		//
		String choice;
		do {
			System.out.println("ag");
			System.out.println("do you want to repeat");
			choice = s.next();
		} while (choice != "+");
	}

}