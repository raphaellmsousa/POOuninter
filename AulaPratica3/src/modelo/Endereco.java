package modelo;

public class Endereco {

	protected String logradouro;
	protected int numero;
	protected String bairro;
	protected String cidade;
	protected String estado;
	protected long cep;	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, long cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public Endereco() {
	}

	//metodos utiilzados para acessar os atributos
	//São a implementação do paradigma de encapsulamento
	public String getLogradouro() {
		return logradouro;
	}	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		if(cep > 0) {
			this.cep = cep;
		}
	}	
	
}
