package estrutura_condicional;

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		num1 = sc.nextInt();
		sc.nextLine();
		num2 = sc.nextInt();
		
		if(Math.max(num1, num2) % Math.min(num1, num2) == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
