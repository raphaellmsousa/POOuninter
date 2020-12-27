package modelo;

public class ItemPedido {

	//encapsulamento
	private Produto produto; //agregação
	private double quantidade;
		
	public ItemPedido() {
		 // TODO Auto-generated constructor stub
		 }
	
	public ItemPedido(Produto produto, double quantidade) {
		 super();
		 this.produto = produto;
		 this.quantidade = quantidade;
	} 
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
