package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class UseEmployee {
	public static Scanner empChoice = new Scanner(System.in);

	public static void main(String[] args) {
		EmployeeServiceImpl test = new EmployeeServiceImpl();		
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		Employee foundEmp = new Employee();
		
		boolean flag = true;
		
		// Go over the Employee menu at least once
		do {
			System.out.println("\nPlease select a choice from the Employee Menu: ");
			System.out.println("\n1: View all employees" 
							 +"\n2. Display the yearly salary"
							 +"\n3. Find an employee"
							 +"\n4. Modify employee details"
							 +"\n5. Delete an employee"
							 +"\n6. Exit");
			
			int choice = sc.nextInt();
		
			
			switch(choice) {
			// Displays all of the employees in the system.
			case 1: test.displayAllEmployees();	
					break;
					
			// Display the yearly salary of one employee
			case 2: int empChoiceSalary = acquireEmployee();
					double calculated = test.calculateYearlySalary(test.empList.get(empChoiceSalary));
					System.out.println("The yearly salary for " + test.empList.get(empChoiceSalary).getEmpName()+ " is " + calculated);
					break;
					
			// Find an employee by their employee number and print their information
			case 3: System.out.println("Type in the employee number: ");
					int empNo = num.nextInt();
					foundEmp = test.findByEmployeeNo(empNo);
					System.out.println(foundEmp);
					break;
					
			// Modify an employees details
			case 4: int empChoiceModify = acquireEmployee();
					test.updateEmployee(test.empList.get(empChoiceModify));
					break;
					
			// Delete an employee
			case 5: int empChoiceDelete = acquireEmployee();
//					test.empList.remove(empChoiceDelete);
					test.deleteEmployee(test.empList.get(empChoiceDelete));
					break;
			// Exit
			case 6: flag = false;
					break;
			}
			
			// To calculate the yearly salary, you must first know for who. Pass in the employee.
			//double yearlySal = test.calculateYearlySalary();
		}while(flag);

		System.out.print("Have a nice day.");
	}
	
	// Method to acquire input for the employee that the user wishes to work with
	public static int acquireEmployee() {
		System.out.println("Enter the employee 0-6: ");
		int getEmp = empChoice.nextInt();
		return getEmp;
	}
}
