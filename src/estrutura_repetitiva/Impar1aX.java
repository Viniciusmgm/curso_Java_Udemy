package estrutura_repetitiva;

import java.util.Scanner;

public class Impar1aX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 1; i <= x; i += 2) {
			System.out.println(i);
		}
		sc.close();
	}
}
