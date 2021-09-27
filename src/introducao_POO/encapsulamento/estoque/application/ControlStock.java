package introducao_POO.encapsulamento.estoque.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.encapsulamento.estoque.entities.Product;

public class ControlStock {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//Protege contra inconsistência
		Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("\nUpdated data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdated data: " + product);
		
		sc.close();
	}
}
