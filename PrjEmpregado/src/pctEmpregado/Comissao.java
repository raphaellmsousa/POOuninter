package pctEmpregado;

public class Comissao extends Empregado {
	
	private double vendaBruta;
	private double taxaComissao;
	
	
	public Comissao(String nome, String nrDocto, double rendimento, double vendaBruta, double taxaComissao) {
		super(nome, nrDocto, rendimento);
		
		if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
		{
			throw new IllegalArgumentException("Taxa de comissão deve estar entre 0 e 1");
		}
		
		if (vendaBruta < 0.0)
		{
			throw new IllegalArgumentException("O nosso valor de vendas deve ser maior que Zero!!!");
		}
		
		this.vendaBruta = vendaBruta;
		this.taxaComissao = taxaComissao;
	}


	public double getVendaBruta() {
		return vendaBruta;
	}


	public void setVendaBruta(double vendaBruta) {
		
		if (vendaBruta < 0.0)
		{
			throw new IllegalArgumentException("O nosso valor de vendas deve ser maior que Zero!!!");
		}
		
		this.vendaBruta = vendaBruta;
	}


	public double getTaxaComissao() {
		return taxaComissao;
	}


	public void setTaxaComissao(double taxaComissao) {
		
		if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
		{
			throw new IllegalArgumentException("Taxa de comissão deve estar entre 0 e 1");
		}
		
		this.taxaComissao = taxaComissao;
	}


	@Override
	public double rendimentos() {		
		setRendimento(getTaxaComissao() * getVendaBruta());
		return getRendimento();
	}	

}
