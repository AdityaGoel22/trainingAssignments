package proj1.proj1;

public class std {
	
	static {
		System.out.println("HELLO1");
	}
	static {
		System.out.println("HELLO2");
	}
	static {
		System.out.println("HELLO4");
	}
	
	public static void main (String [] args) {
		Student s1 = new Student(1,"a", 90, 20);
		Student s2 = new Student(1,"a", 90, 20);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
	
	static {
		System.out.println("HELLO3");
	}
}

//id, name, marks, age after pojo take 2 objs and give same data and check for s1==s2 and s1.equals(s2)