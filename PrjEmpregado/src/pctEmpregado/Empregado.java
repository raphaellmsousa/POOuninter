package pctEmpregado;

public abstract class Empregado {
	
	private String nome;
	private String nrDocto;
	private double rendimento;
	
	public Empregado(String nome, String nrDocto, double rendimento) {
		super();
		this.nome = nome;
		this.nrDocto = nrDocto;
		this.rendimento = rendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNrDocto() {
		return nrDocto;
	}

	public void setNrDocto(String nrDocto) {
		this.nrDocto = nrDocto;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public abstract double rendimentos();

}
