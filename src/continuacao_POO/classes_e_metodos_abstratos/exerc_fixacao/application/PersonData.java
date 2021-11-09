package continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.classes_e_metodos_abstratos.exerc_fixacao.entities.Person;

public class PersonData {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		List<Person> listPerson = new ArrayList<>();
		
		System.out.println("Enter number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d ", i + 1);
		}
		
		sc.close();
	}
}
