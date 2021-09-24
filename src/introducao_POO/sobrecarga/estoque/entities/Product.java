package introducao_POO.sobrecarga.estoque.entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
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
