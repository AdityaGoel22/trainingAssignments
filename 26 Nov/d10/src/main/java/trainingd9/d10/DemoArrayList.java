package trainingd9.d10;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList alist = new ArrayList();
//		
//		alist.add(56);
//		alist.add("aditya");
//		alist.add(true);
//		alist.add(28.07);
//		
//		Person p = new Person("aditya", 4545);
//		alist.add(p);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//		
//		alist.add(null);
//		System.out.println(alist);
//		
//		
//		ArrayList <String> name = new ArrayList<String>();
//		
//		name.add("amit");
//		name.add("prisha");
//		name.add("aditya");
//		name.add("poonam");
//		System.out.println(name);
//		
//		System.out.println("Through loops");
//		for (String i : name) {
//			System.out.println(i);
//		}
//		
//		System.out.println("Through Iterator");
//		Iterator<String> itr = name.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("Through ListIterator");
//		Iterator<String> itr1 = name.listIterator();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
////		while(itr1.hasPrevious()){
////			System.out.println(itr1.previous());
////		}
//		
//		System.out.println(name.contains("amit"));
//		
//		System.out.println("for each");
//		name.forEach(names->System.out.println(names));
//		name.forEach(System.out::println);
//		
////		System.out.println(name.remove(0));
//		
//		
//		Collections.sort(name);
//		System.out.println(name);
//		
//		
//		ArrayList <String> clonedName = (ArrayList<String>) name.clone();
//	
//		System.out.println(name.hashCode());
//		System.out.println(clonedName.hashCode());
//		
//		clonedName.add("Aayansh");
//		System.out.println(clonedName.hashCode());
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student(12, "Aditya", 22, 85, "Bangalore"));
		slist.add(new Student(128, "Pranav", 20, 72, "Delhi"));
		slist.add(new Student(18, "Vansh", 21, 93, "Melbourne"));
		slist.add(new Student(2, "Mukund", 18, 82, "Delhi"));
		slist.add(new Student(102, "Sanvi", 22, 84, "Hyderabad"));
		slist.add(new Student(17, "Anant", 22, 89, "Bangalore"));
		slist.add(new Student(126, "Pranav", 20, 78, "Delhi"));
		slist.add(new Student(113, "Riti", 21, 95, "Melbourne"));
		slist.add(new Student(29, "Aaryaman", 18, 85, "Delhi"));
		slist.add(new Student(174, "Sanvi", 22, 79, "Hyderabad"));
		slist.add(new Student(36, "Aditya", 22, 88, "Bangalore"));
		slist.add(new Student(95, "Pranav", 20, 68, "Delhi"));
		slist.add(new Student(69, "Shivi", 21, 80, "Melbourne"));
		slist.add(new Student(33, "Mukund", 18, 87, "Delhi"));
		slist.add(new Student(69, "Shubham", 22, 89, "Hyderabad"));
		slist.add(new Student(78, "Jasmine", 22, 92, "Bangalore"));
		slist.add(new Student(168, "Sneha", 20, 88, "Delhi"));
		slist.add(new Student(178, "Vansh", 21, 90, "Melbourne"));
		slist.add(new Student(20, "Mukund", 18, 81, "Delhi"));
		slist.add(new Student(96, "Sanvi", 22, 83, "Hyderabad"));
		
//		Collections.sort(slist);
		
		slist.sort(new CityComparator().thenComparing(new NameComparator().thenComparing(new MarksComparator())));
		
		for(Student i : slist)
		System.out.println(i);
		
		
		
	}
}
