package modelo;

//Herda os atributos e m�todos da classe funcion�rio
public class Supervisor extends Funcionario {
	
	//Polimorfismo est�tico sobrecarga de m�todo
	public Supervisor() {
		super(); //chama o construtor da classe base, mas aqui n � mandat�rio
	}

	//Atributos herdados da classe Funcion�rio
	public Supervisor(String matricula, String nome, Endereco endereco, Departamento departamento, double salario) {
		super(matricula, nome, endereco, departamento, salario);
		
	}
	
	//Sobrescreve esta fun��o da classe Funcion�rio, visto que o Supervisor recebe uma comiss�o diferente
	//Polimorfismo sobresceve m�todo
	//Polimorfismo din�mico, possui a mesma assinatura, por�m se comporta diferente
	
	@Override
	public double calculaComissao() {
		return salario * 0.15;
	}
		
}
