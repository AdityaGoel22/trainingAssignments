package trainingd9.d10;

public class Student implements Comparable<Student>{


	private int sid;
	private String sname;
	private int age;
	private int marks;
	private String city;
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.sname.compareTo(s.sname);
	}
	
	public Student(int sid, String sname, int age, int marks, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
		this.city = city;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", marks=" + marks + ", city=" + city
				+ "]";
	}
	
}
