package continuacao_POO.polimorfismo.produtos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.polimorfismo.produtos.entities.ImportedProduct;
import continuacao_POO.polimorfismo.produtos.entities.Product;
import continuacao_POO.polimorfismo.produtos.entities.UsedProduct;

public class ProductData {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.printf("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Product product;
			
			System.out.printf("Enter #%d data: ", i + 1);
			
			System.out.printf("\nCommon, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.printf("Name: ");
			String name = sc.next();
			
			System.out.printf("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'u') {
				System.out.printf("Manufacture Date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				
				product = new UsedProduct(name, price, sdf.parse(manufactureDate));
			}
			else if(ch == 'i') {
				System.out.printf("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				product = new ImportedProduct(name, price, customsFee);
			}
			else {
				product = new Product(name, price);
			}
			
			products.add(product);
		}
		
		System.out.println("\nPRICE TAGS: ");
		for(Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}
}
