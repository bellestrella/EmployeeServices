package employee;

public interface EmployeeService {
	public void displayAllEmployees();
	public double calculateYearlySalary(Employee e1);
	// Not sure if the return type should be void
	public Employee findByEmployeeNo(int empNo);
	public void updateEmployee(Employee e1);
	public void deleteEmployee(Employee e1);
}
