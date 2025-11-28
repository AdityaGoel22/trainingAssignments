package trainingd9.d10;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no duplication
		//no insertion order
		//can insert only one null
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(58);
		hashSet.add(34);
		hashSet.add(99);
		hashSet.add(23);
		
		System.out.println(hashSet);
		
		for (Integer i : hashSet){
			System.out.println(i);
		}
		
		hashSet.add(null);
		System.out.println(hashSet);
		
		
		LinkedHashSet<Integer> itrHasSet = new LinkedHashSet<Integer>();
		itrHasSet.add(90);
		itrHasSet.add(56);
		itrHasSet.add(34);
		itrHasSet.add(99);
		itrHasSet.add(23);
		itrHasSet.add(12);
		
		System.out.println(itrHasSet);
	}

}
