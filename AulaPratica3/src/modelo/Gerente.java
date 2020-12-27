package modelo;

public class Gerente extends Funcionario {

	public Gerente() {
		super();
	}

	public Gerente(String matricula, String nome, Endereco endereco, Departamento departamento, double salario) {
		super(matricula, nome, endereco, departamento, salario);
	}
	
	@Override
	public double calculaComissao() {
		return salario * 0.2;
	}

}
