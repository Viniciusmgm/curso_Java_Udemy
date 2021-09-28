package introducao_POO.exerc_fixacao.conta_bancaria.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.exerc_fixacao.conta_bancaria.entities.Conta;

public class Cliente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.printf("Qual o número da conta? ");
		int numConta = sc.nextInt();
		System.out.print("Qual o nome do titular da conta? ");
		String nomeTitular = sc.next();
		
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		if(sc.next().charAt(0) == 's') {
			System.out.print("Qual o valor do depósito inicial? ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, depositoInicial);
		}
		else {
			conta = new Conta(numConta, nomeTitular);
		}
			
		System.out.println("\nDados da Conta");
		System.out.println(conta.toString());
		
		System.out.print("Qual o valor do depósito? ");
		conta.deposito(sc.nextDouble());
		System.out.println("|-----Conta Atualizada-----|");
		System.out.println(conta.toString());
		
		System.out.print("Qual o valor do saque? ");
		conta.saque(sc.nextDouble());
		System.out.println("|-----Conta Atualizada-----|");
		System.out.println(conta.toString());
		
		sc.close();
	}

}
