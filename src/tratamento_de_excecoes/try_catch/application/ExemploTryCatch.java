package tratamento_de_excecoes.try_catch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e_Array){
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException e_Input){
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}
}
