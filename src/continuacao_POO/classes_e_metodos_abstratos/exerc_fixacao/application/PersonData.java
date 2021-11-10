package continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities.LegalPerson;
import continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities.Person;
import continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities.PhysicalPerson;

public class PersonData {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		List<Person> listPerson = new ArrayList<>();
		
		System.out.printf("Enter number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d \n", i + 1);
			
			Person person;
			
			System.out.printf("Individual or company (i/c)? ");
			char typePerson = sc.next().charAt(0);
			
			System.out.printf("Name: ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.printf("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if(typePerson == 'i') {
				System.out.printf("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				
				person = new PhysicalPerson(name, annualIncome, healthExpenses);
			}
			else {
				System.out.printf("Number of employees: ");
				int numEmployee = sc.nextInt();
				
				person = new LegalPerson(name, annualIncome, numEmployee);
			}
			listPerson.add(person);
		}
		
		System.out.println("\nTAXES PAID:");
		for(Person person : listPerson) {
			System.out.printf("%s: $ %.2f \n", person.getName(), person.tax());
		}
		
		sc.close();
	}
}
