package pctEmpregado;

public class Salario extends Empregado {
	
	private double salarioMensal;

	public Salario(String nome, String nrDocto, double rendimento, double salarioMensal) {
		super(nome, nrDocto, rendimento);
		
		if(salarioMensal < 0.0)
		{
			throw new IllegalArgumentException("Salário Mensal deve "
					+ "ser maior que ZERO!!!");
		}	
		
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		
		if(salarioMensal < 0.0)
		{
			throw new IllegalArgumentException("Salário Mensal deve "
					+ "ser maior que ZERO!!!");
		}	
		
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double rendimentos() {		
		setRendimento(getSalarioMensal());
	return getSalarioMensal();
	}	
}
