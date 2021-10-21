package continuacao_POO.polimorfismo.empregado_terceirizado.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.polimorfismo.empregado_terceirizado.entities.Employee;
import continuacao_POO.polimorfismo.empregado_terceirizado.entities.OutsourcedEmployee;

public class EmployeeData {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.printf("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Employee employee;
			
			System.out.printf("Enter #%d data: ", i + 1);
			
			System.out.printf("\nOutsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			
			System.out.printf("Name: ");
			String name = sc.next();
			
			System.out.printf("Hours: ");
			int hours = sc.nextInt();
			
			System.out.printf("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			double additionalCharge = 0;
			if(outsourced == 'y') {
				System.out.printf("Additional charge: ");
				additionalCharge = sc.nextDouble();
				
				employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}else {
				employee = new Employee(name, hours, valuePerHour);
			}
			
			employees.add(employee);
		}
		
		System.out.println("\nPAYMENTS: ");
		for(Employee emp : employees) {
			System.out.println(emp.toString());
		}
		
		sc.close();
	}
}
