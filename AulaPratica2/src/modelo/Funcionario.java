package modelo;

public class Funcionario {

	protected String matricula;
	protected String Nome;
	
	//Relacionamento associativo entre classes
	protected Endereco endereco; 
	protected Departamento departamento;
	protected double salario;
		
	public Funcionario(String matricula, String nome, Endereco endereco, 
			Departamento departamento, double salario) {
		super();
		this.matricula = matricula;
		Nome = nome;
		this.endereco = endereco;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public Funcionario() {
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public double calculaComissao() {
		return salario * 0.1;
	}
}
