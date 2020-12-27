package modelo;

import java.util.List;

public class Pedido {
	
	private int numero;
	private List<ItemPedido> itens; //Relação de composição
	
	public Pedido() {
		 // TODO Auto-generated constructor stub
	}
	
	public Pedido(int numero, List<ItemPedido> itens) {
		 super();
		 this.numero = numero;
		 this.itens = itens;
	}
	
	public List<ItemPedido> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	

}
