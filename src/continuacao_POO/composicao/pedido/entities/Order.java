package continuacao_POO.composicao.pedido.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import continuacao_POO.composicao.pedido.entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}	
	
	public void addItems(OrderItem item) {
		items.add(item);
	}
	
	public void removeItens(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double total = 0;
		for(OrderItem item : items) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append(
				  String.format(
						  		"Client: %s (%s) - %s \n",
						  		client.getName(),
						  		sdf2.format(client.getBirthDate()),
						  		client.getEmail()
						  		)
				  );
		sb.append("Order items: \n");
		for(OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", $");
			sb.append(item.getProduct().getPrice());
			sb.append(", Quantity: ");
			sb.append(item.getQuantity());
			sb.append(", Subtotal: $");
			sb.append(item.subTotal() + "\n");
		}
		sb.append("Total price: $" + total());
		return sb.toString();
	}
}
