package modelo;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, String endereco, String telefone, String email) {
		super(nome, endereco, telefone, email);
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
