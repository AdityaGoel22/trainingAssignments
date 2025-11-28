package proj1.proj1;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double marks;
	private int age;

	public Student(int id, String name, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	public class College {
		
	}
	private String college;
	private String address;
	private long colCode;

	public Student(int id, String name, double marks, int age, String college, String address, long colCode) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.college = college;
		this.address = address;
		this.colCode = colCode;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getColCode() {
		return colCode;
	}

	public void setColCode(long colCode) {
		this.colCode = colCode;
	}
	
}