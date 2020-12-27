package modelo;

//Paradigma Herança
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	//Paradigma Polimorfismo sobrecarga de método
	public PessoaJuridica(String cnpj) {
		 super();
		 this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {
		 super();
		 // TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, String endereco, String telefone, String email) {
		super(nome, endereco, telefone, email);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
}
