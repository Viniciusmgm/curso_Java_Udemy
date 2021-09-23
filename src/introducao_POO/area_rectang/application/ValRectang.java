package introducao_POO.area_rectang.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.area_rectang.entities.Rectang;

public class ValRectang {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectang rectang = new Rectang();
		
		System.out.println("Enter rectangle width and height: ");
		rectang.width = sc.nextDouble();
		rectang.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rectang.area());
		System.out.printf("Perimeter = %.2f%n", rectang.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectang.diagonal());
		
		sc.close();
	}
}
