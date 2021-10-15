package continuacao_POO.heranca.contas_pessoa_empresa.application;

import continuacao_POO.heranca.contas_pessoa_empresa.entities.BusinessAccount;

public class AccountData {
	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount(122, "TecBan", 2000000.00, 20000.00);
		System.out.println(account.toString() + ", loanLimit= " + account.getLoanLimit() + "]");

	}

}
