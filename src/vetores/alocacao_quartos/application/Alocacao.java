package vetores.alocacao_quartos.application;

import java.util.Locale;
import java.util.Scanner;
import vetores.alocacao_quartos.entities.DadosCliente;

public class Alocacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		DadosCliente[] alocacao = new DadosCliente[10];
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nAlocação #" + i);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			alocacao[quarto] = new DadosCliente(nome, email, quarto);
		}
		
		System.out.println("\nQuartos alugados:");
		for(int i = 0; i < alocacao.length; i++) {
			if(alocacao[i] != null) {
				System.out.println(alocacao[i].toString(i));
			}
		}
		sc.close();
	}
}
