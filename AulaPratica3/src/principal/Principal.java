package principal;

import modelo.Funcionario;
import modelo.Gerente;
import modelo.Supervisor;

public class Principal {
	public void mostraSalarioComComissao(Funcionario f) {
    
		System.out.println("Salario do funcionario " + f.getNome() +
				" com comissao: " + (f.getSalario() + f.calculaComissao()));
}

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("1", "Joao", null,
				null, 1000);
				    Supervisor supervisor = new Supervisor("2", "Antorio", null,
				null, 1500);
				    Gerente gerente = new Gerente("3", "Ana", null, null, 3000);
				    Principal p = new Principal();
				   
				    p.mostraSalarioComComissao(funcionario);
				    p.mostraSalarioComComissao(supervisor);
				    p.mostraSalarioComComissao(gerente);
				}
}