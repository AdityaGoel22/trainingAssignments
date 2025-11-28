package trainingd9.d11;

public class Emp {
	
	private int empid;
	private String name;
	private int salary;
	private String address;
	private String dept;
	public Emp(int empid, String name, int salary, String address, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + ", dept="
				+ dept + "]";
	}

	
}