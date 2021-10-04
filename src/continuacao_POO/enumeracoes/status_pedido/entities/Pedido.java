package continuacao_POO.enumeracoes.status_pedido.entities;

import java.util.Date;
import continuacao_POO.enumeracoes.status_pedido.entities.enums.StatusPedido;

public class Pedido {
	private Integer id;
	private Date momento;
	private StatusPedido status;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, Date momento, StatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String toString() {
		return "Pedido [id: " + id + ", momento: " + momento + ", status: " + status + "]";
	}
	
	
}
