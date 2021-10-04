package continuacao_POO.composicao.contrato_trabalhador.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.composicao.contrato_trabalhador.entities.Departament;
import continuacao_POO.composicao.contrato_trabalhador.entities.HourContract;
import continuacao_POO.composicao.contrato_trabalhador.entities.Worker;
import continuacao_POO.composicao.contrato_trabalhador.entities.enums.WorkerLevel;

public class WorkerData {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Enter departament's name: ");
		String departamentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data: \n", i + 1);
			
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.println("Duration (Hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}
}
