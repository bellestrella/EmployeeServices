package employee;

public class Employee {
	private String empName;
	private int empNo;
	private double monthlySalary;
	private Address address;
	
	// Parameterized constructor
	public Employee(String empName, int empNo, double monthlySalary, Address address){
		this.empName = empName;
		this.empNo = empNo;
		this.monthlySalary = monthlySalary;
		this.address = address;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Getters are setters
	public String getEmpName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NAME: " + empName + " ID: " + empNo + 
				" MONTHLY$:" + monthlySalary + " ADDRESS:"
				+ address + "";
	}
	
	
}
