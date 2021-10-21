package continuacao_POO.sobreposicao.conta_pessoa_empresa.application;

import continuacao_POO.sobreposicao.conta_pessoa_empresa.entities.Account;
import continuacao_POO.sobreposicao.conta_pessoa_empresa.entities.BusinessAccount;
import continuacao_POO.sobreposicao.conta_pessoa_empresa.entities.SavingsAccount;

public class AccountData {
	public static void main(String[] args) {
		Account acc1 = new Account(1003, "Vini", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Vini", 1000.0, 0.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1002, "Vini", 1000.0, 100.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
