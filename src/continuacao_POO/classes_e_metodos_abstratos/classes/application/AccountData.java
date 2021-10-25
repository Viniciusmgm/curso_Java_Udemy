package continuacao_POO.classes_e_metodos_abstratos.classes.application;

import java.util.ArrayList;
import java.util.List;

import continuacao_POO.classes_e_metodos_abstratos.classes.entities.Account;
import continuacao_POO.classes_e_metodos_abstratos.classes.entities.BusinessAccount;
import continuacao_POO.classes_e_metodos_abstratos.classes.entities.SavingsAccount;

public class AccountData {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.println("Total balance: " + sum);
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}
}
