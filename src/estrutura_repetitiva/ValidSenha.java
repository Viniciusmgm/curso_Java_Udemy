package estrutura_repetitiva;

import java.util.Scanner;

public class ValidSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		
		
		while(senha != 2002) {
			System.out.println("Senha Inv�lida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();

	}

}
