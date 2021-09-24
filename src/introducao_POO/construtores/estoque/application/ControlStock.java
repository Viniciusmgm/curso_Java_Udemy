package introducao_POO.construtores.estoque.application;

import java.util.Locale;
import java.util.Scanner;
import introducao_POO.construtores.estoque.entities.Product;

public class ControlStock {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: \n");
		int quantity = sc.nextInt();
		
		//Protege contra inconsistência
		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data: " + product);
		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("\nUpdated data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdated data: " + product);
		
		sc.close();
	}
}
