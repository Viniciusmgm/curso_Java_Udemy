package estrutura_condicional;

import java.util.Scanner;

public class Paridade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O %d � par", num);
		}
		else {
			System.out.printf("O %d � �mpar", num);
		}
		
		sc.close();
	}

}
