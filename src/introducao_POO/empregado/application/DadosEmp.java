package introducao_POO.empregado.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.empregado.entities.Empregado;

public class DadosEmp {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f \n\n", emp.name, emp.NetSalary());
		
		System.out.println("Which percentage to increae salary? ");
		emp.IncreaseSalary(sc.nextDouble());
		
		System.out.printf("Update data: %s, $ %.2f", emp.name, emp.NetSalary());
		
		sc.close();
		}
}
