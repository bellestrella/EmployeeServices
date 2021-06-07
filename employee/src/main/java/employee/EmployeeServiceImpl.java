package employee;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	public static Scanner empChoiceModify = new Scanner(System.in);
	public static Scanner empNewDetailString = new Scanner(System.in);
	public static Scanner empNewDetailNum = new Scanner(System.in);
	
	static ArrayList<Employee> empList = new ArrayList<Employee>() {
		{
		add(new Employee("Isabel Sanchez", 123, 100.00, new Address("Austin", "Texas")));
		add(new Employee("Bella Sanchez", 456, 200.00, new Address("Austin", "Texas")));
		add(new Employee("Sylvia Ordeman", 789, 300.00, new Address("Denton", "Texas")));
		add(new Employee("William Ordeman", 987, 400.00, new Address("Denton", "Texas")));
		add(new Employee("Victor Sanchez", 654, 500.00, new Address("Houston", "Texas")));
		add(new Employee("Blanca Sanchez", 321, 600.00, new Address("Brownsville", "Texas")));
		add(new Employee("Antonio Sanchez", 000, 700.00, new Address("Brownsville", "Texas"))); 
		}
	};
	
	// Display a list of all of your Employees along with every attribute
	public void displayAllEmployees() {
		for(Employee emp: empList) {
			System.out.println(emp.toString());
		}
	}
	
	// Calculate the yearly salary of your employee
	public double calculateYearlySalary(Employee e1) {
		double yearlySal = 0;
		yearlySal = e1.getMonthlySalary() * 12;
		return yearlySal;
	}
	
	//
	public Employee findByEmployeeNo(int empNo) {
		for(Employee emp : empList) {
	        if(empNo == emp.getEmpNo()) {
	            return emp;
	        }
	    }
		return null;
	}

	public void updateEmployee(Employee e1) {
		System.out.println("What detail do you wish to modify for " + e1.getEmpName() + " ?" + "Enter the number. "
				+ "\n1. Name" + "\n2. Employee Number" + "\n3. Monthly Salary" + "\n4. Adress");
		
		int modifyChoice = empChoiceModify.nextInt();
		String[] parsedAddress = null;
		
		switch(modifyChoice) {
		case 1: System.out.println("Enter the new employee name: ");
				String newName = empNewDetailString.next();
				e1.setName(newName);
				break;
		case 2: System.out.println("Enter the new employee number: ");
				int newNumber = empNewDetailNum.nextInt();
				e1.setEmpNo(newNumber);
				break;
		case 3: System.out.println("Enter the new monthly salary: ");
				double newSalary = empNewDetailNum.nextDouble();
				e1.setMonthlySalary(newSalary);
				break;
		case 4: System.out.println("Enter the new employee city and state: ");
				String newAddress = empNewDetailString.nextLine();
				parsedAddress = newAddress.split(" ");
				e1.setAddress(new Address(parsedAddress[0], parsedAddress[1]));
				break;
		}
		
	}

	public void deleteEmployee(Employee e1) {
		empList.remove(e1);
	}

}
