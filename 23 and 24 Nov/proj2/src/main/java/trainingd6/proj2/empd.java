package trainingd6.proj2;

public class empd {
	
	private int empid;
	private String  ename;
	private int salary;
	private String desg;
	private String location;
	
	public empd(int empid, String ename, int salary, String desg, String location) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.desg = desg;
		this.location = location;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDesg() {
		return desg;
	}
	
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "empd [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", desg=" + desg + ", location="
				+ location + "]";
	}
	
	public int annualSalary() {
		return this.salary*12;
	}
	
}
