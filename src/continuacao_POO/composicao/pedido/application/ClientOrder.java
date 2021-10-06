package continuacao_POO.composicao.pedido.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.composicao.pedido.entities.Client;
import continuacao_POO.composicao.pedido.entities.Order;
import continuacao_POO.composicao.pedido.entities.OrderItem;
import continuacao_POO.composicao.pedido.entities.Product;
import continuacao_POO.composicao.pedido.entities.enums.OrderStatus;

public class ClientOrder {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		//Entrada dos Dados e Instanciação do Cliente
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth Date: ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		//Entrada dos Dados e Instanciação do Pedido
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(
				new Date(), 
				OrderStatus.valueOf(status), 
				client
				);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter #%s item data:", i + 1);
			
			System.out.print("\nProduct name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, new Product(productName, productPrice));
			order.addItems(item);
		}
		
		System.out.println(order.toString());
		
		sc.close();
	}
}
