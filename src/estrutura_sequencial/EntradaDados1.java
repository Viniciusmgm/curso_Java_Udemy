package estrutura_sequencial;

import java.util.Scanner;

public class EntradaDados1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Serve para String
		/*
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		*/
		
		//Serve para Int
		/*
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		*/
		
		//Serve para Double
		/*
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		*/
		
		//Serve para Char
		char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}
}
