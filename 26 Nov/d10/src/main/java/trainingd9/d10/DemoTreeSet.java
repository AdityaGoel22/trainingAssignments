package trainingd9.d10;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		
//		ts.add(34);		
//		ts.add(99);
//		ts.add(23);
//		ts.add(58);
//		ts.add(11);
//		
//		System.out.println(ts);
//		
//		System.out.println(ts.ceiling(50));
//		System.out.println(ts.floor(50));
//		
//		Iterator<Integer> itr = ts.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println(ts.headSet(58));
//		System.out.println(ts.tailSet(58));
//		
//		System.out.println(ts.higher(35));
//		
//		TreeSet<Student> slist = new TreeSet<Student>();
//		
//		slist.add(new Student(12, "Aditya", 22, 85, "Bangalore"));
//		slist.add(new Student(128, "Pranav", 20, 72, "Delhi"));
//		slist.add(new Student(18, "Vansh", 21, 93, "Melbourne"));
//		slist.add(new Student(2, "Mukund", 18, 82, "Delhi"));
//		slist.add(new Student(102, "Sanvi", 22, 84, "Hyderabad"));
//		
//		System.out.println(slist);
//		
//		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
//		treeMap.put(1,1);
//		treeMap.put(4,16);
//		treeMap.put(20,400);
//		treeMap.put(7,49);
//		treeMap.put(11,121);
//		treeMap.put(2,4);
//		
//		System.out.println(treeMap);
//		
//		System.out.println(treeMap.ceilingEntry(6));
//		System.out.println(treeMap.descendingMap());
//		
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(3, "Aditya");
		table.put(44, "Amit");
		table.put(12, "Mukund");
		table.put(87, "Vansh");
		table.put(1, "Lovely");
		
		System.out.println(table);
		
		Enumeration<Integer>key=table.keys();
		
		while(key.hasMoreElements()) {
			System.out.println(key.nextElement());
		}
		
		Enumeration<String>ele=table.elements();
		
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
	
	}

}
