package modelo;

//Herda os atributos e métodos da classe funcionário
public class Supervisor extends Funcionario {
	
	//Polimorfismo estático sobrecarga de método
	public Supervisor() {
		super(); //chama o construtor da classe base, mas aqui n é mandatório
	}

	//Atributos herdados da classe Funcionário
	public Supervisor(String matricula, String nome, Endereco endereco, Departamento departamento, double salario) {
		super(matricula, nome, endereco, departamento, salario);
		
	}
	
	//Sobrescreve esta função da classe Funcionário, visto que o Supervisor recebe uma comissão diferente
	//Polimorfismo sobresceve método
	//Polimorfismo dinâmico, possui a mesma assinatura, porém se comporta diferente
	
	@Override
	public double calculaComissao() {
		return salario * 0.15;
	}
		
}
