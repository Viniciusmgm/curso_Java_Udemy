package introducao_POO.exerc_fixacao.conta_bancaria.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.exerc_fixacao.conta_bancaria.entities.Conta;

public class Cliente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o número da conta? ");
		int numConta = sc.nextInt();
		System.out.print("Qual o nome do titular da conta? ");
		String nomeTitular = sc.next();
		
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		double depositoInicial = 0;
		if(sc.next().charAt(0) == 's') {
			System.out.println("Qual o valor do depósito inicial? ");
			depositoInicial = sc.nextDouble();
		}
		Conta conta = new Conta(numConta, nomeTitular, depositoInicial);
		
		System.out.println("\nDados da Conta");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f%n", conta.getNumConta(), conta.getNomeTitular(), conta.getSaldo());
		
		System.out.print("\nQual o valor do depósito? ");
		conta.deposito(sc.nextDouble());
		System.out.println("Conta Atualizada");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f%n", conta.getNumConta(), conta.getNomeTitular(), conta.getSaldo());
		
		System.out.print("\nQual o valor do saque? ");
		conta.saque(sc.nextDouble());
		System.out.println("Conta Atualizada");
		System.out.printf("Conta %d, Titular: %s, Saldo: R$ %.2f%n", conta.getNumConta(), conta.getNomeTitular(), conta.getSaldo());
		
		sc.close();
	}

}
