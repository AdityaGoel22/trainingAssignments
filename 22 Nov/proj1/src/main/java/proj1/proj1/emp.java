package proj1.proj1;

public class emp {
	
	private String empName;
	private int empId;
	private String desg;
	private String mobileNum;
	private int salary;
	
	public emp(String empName, int empId, String desg, String mobileNum, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.desg = desg;
		this.mobileNum = mobileNum;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "emp [empName=" + empName + ", empId=" + empId + ", desg=" + desg + ", mobileNum=" + mobileNum
				+ ", salary=" + salary + "]";
	}

}
