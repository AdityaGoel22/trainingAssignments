package trainingd9.d10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//LinkedList<Integer> ll = new LinkedList<Integer>();
		
		Integer arr[] = {56, 43, 66, 90, 12, 33, 32, 83};
		
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(arr));
		
//		
//		ll.add(56);
//		ll.add(43);
//		ll.add(66);
//		ll.add(90);
//		ll.add(12);
//		ll.add(33);
//		ll.add(32);
//		ll.add(83);
//		
		Iterator<Integer> itr =	ll.descendingIterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(ll.offer(95));
		System.out.println(ll);
		System.out.println(ll.peekLast());
		
		ll.add(null);	
	}

}
