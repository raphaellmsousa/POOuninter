package pctEmpregado;

public class Horario extends Empregado {
	
	private double salario;
	private double horas;
	
	
	public Horario(String nome, String nrDocto, double rendimento, double salario, double horas) {
		super(nome, nrDocto, rendimento);
		
		if (salario < 0.0)
		{
			throw new IllegalArgumentException("Salário por hora deve ser maior que ZERO!!");
		}
		
		if (horas < 0.0) 
		{
			throw new IllegalArgumentException("Número de horas deve ser maior que ZERO!!");			
		}
				
		this.salario = salario;
		this.horas = horas;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		
		if (salario < 0.0)
		{
			throw new IllegalArgumentException("Salário por hora deve ser maior que ZERO!!");
		}
		
		this.salario = salario;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		
		if (horas < 0.0) 
		{
			throw new IllegalArgumentException("Número de horas deve ser maior que ZERO!!");			
		}
		
		this.horas = horas;
	}
	
	@Override
	public double rendimentos() {		
		if(getHoras() <= 160)
			setRendimento(getSalario() * getHoras());
		else 
			setRendimento(160 * getSalario() + (getHoras() - 160));
		return getRendimento();
	}	
}
