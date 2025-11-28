package trainingd9.d10;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVector {
	
	public static void main(String [] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println(vec.capacity());
		for (int i = 0; i<20; i+=2) {
			
			vec.add(i);
		}
		System.out.println(vec.capacity());
		vec.add(20);
		System.out.println(vec.capacity());
		
		Enumeration<Integer> enums = vec.elements();
		while(enums.hasMoreElements()) {
			System.out.println(enums.nextElement());
		}
		
		Iterator<Integer>itr = vec.iterator();
		while (itr.hasNext()){
			int num = itr.next();
			if(num%3==0) {
				itr.remove();
			}
			System.out.println(num);
		}
		System.out.println(vec);
		
		
	}
}
