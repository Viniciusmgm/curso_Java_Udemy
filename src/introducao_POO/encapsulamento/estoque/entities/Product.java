package introducao_POO.encapsulamento.estoque.entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	//Construtor padrão 
	public Product() {
		
	}
	
	//Precisa definir a quantidade
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Quantidade é inicializada como 0
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Só o get para proteger de inconsistências
	//Poderá mudar a quantidade apenas quando entrar ou sair produtos
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

