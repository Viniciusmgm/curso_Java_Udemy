package continuacao_POO.upcasting_downcasting.conta_pessoa_empresa_juros.application;

import continuacao_POO.upcasting_downcasting.conta_pessoa_empresa_juros.entities.Account;
import continuacao_POO.upcasting_downcasting.conta_pessoa_empresa_juros.entities.BusinessAccount;
import continuacao_POO.upcasting_downcasting.conta_pessoa_empresa_juros.entities.SavingsAccount;

public class AccountData {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//Upcasting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Vini", 0.0, 1000.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.5);
		
		//Downcasting
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(200.0);
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
	}

}
