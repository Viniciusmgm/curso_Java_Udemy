package continuacao_POO.composicao.pedido.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.composicao.pedido.entities.Client;

public class ClientOrder {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		//Entrada dos Dados e Instanciação do Cliente
		
		System.out.println("Enter client data: ");
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Email: ");
		String email = sc.nextLine();
		
		System.out.println("Birth Date: ");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		//Entrada dos Dados e Instanciação do Pedido
		
		System.out.println("Enter order data: ");
		
		
		
		sc.close();
	}
}
