package continuacao_POO.enumeracoes.status_pedido.application;

import java.util.Date;

import continuacao_POO.enumeracoes.status_pedido.entities.Pedido;
import continuacao_POO.enumeracoes.status_pedido.entities.enums.StatusPedido;

public class SolicitacaoPedido {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.ENVIADO);
		
		System.out.println(pedido.toString());
	}
}
