package in.rayeesali.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.rayeesali.modal.Employee;
import in.rayeesali.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {

	private EmployeeService serv;

	@Autowired
	public EmployeeRunner(EmployeeService serv) {

		this.serv = serv;
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Select an operation ");
			System.out.println("1. Create Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Find Employee by Id");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee ");
			System.out.println("6. Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter Employee ID:");
				int id = sc.nextInt();

				System.out.println("Enter Employee Name:");
				String name = sc.next();

				System.out.println("Enter Department Name:");
				String dname = sc.next();

				System.out.println("Enter Employee Salary:");
				int sal = sc.nextInt();

				Employee newEmp = new Employee(id, name, dname, sal);

				serv.save(newEmp);
				System.out.println("Employee Created Successfully!!");

				break;

			case 2:

				List<Employee> empList = serv.findAll();
				if (empList.isEmpty()) {
					System.out.println("No Employees found...");
				} else {
					System.out.println("List of employees...");
					for (Employee emp : empList) {
						System.out.println(emp);
					}
				}

				break;

			case 3:

				System.out.println("Enter Employee id:");

				int empId = sc.nextInt();
				Employee searchedEmployee = serv.findById(empId);
				if (searchedEmployee != null) {
					System.out.println(searchedEmployee);
				} else {
					System.out.println("Employee not found!!");
				}

				break;

			case 4:

				System.out.println("Enter Employee id to update:");

				int updEmpId = sc.nextInt();

				Employee empToUpdate = serv.findById(updEmpId);
				if (empToUpdate != null) {

					System.out.println("Enter name:");
					String newName = sc.next();
					System.out.println("Enter department:");
					String newDname = sc.next();
					System.out.println("Enter sal:");
					int newSal = sc.nextInt();

					empToUpdate.setName(newName);
					empToUpdate.setDpt(newDname);
					empToUpdate.setSal(newSal);

					serv.update(empToUpdate);
					System.out.println("Record Updated !!");

				} else {
					System.out.println("Record not present!!");
				}

				break;

			case 5:

				System.out.println("Enter Employee id to Delete:");

				int delEmpId = sc.nextInt();
				int count = serv.delete(delEmpId);
				if (count == 0) {
					System.out.println("Record not found!");
				} else {
					System.out.println("Record deleted!!");
				}

				break;

			case 6:

				System.out.println("Thank you for using this App...");
				return;

			default:
				System.out.println("Invalid Choice .... Try Again !!");

			}
		} while (true);

	}

}
