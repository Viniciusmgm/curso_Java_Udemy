package estrutura_sequencial;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("�rea do Tri�ngulo: %.3f \n", (a * c) / 2);
		System.out.printf("�rea do Tri�ngulo: %.3f \n", c * 3.14159);
		System.out.printf("�rea do Trap�zio: %.3f \n", ((a + b) / 2) * c);
		System.out.printf("�rea do Quadrado: %.3f \n", Math.pow(b, 2));
		System.out.printf("�rea do Ret�ngulo: %.3f \n", (a * b));
		
		sc.close();
		
	}
}
