package pctVeiculo2;

public class Veiculo2 {

	//Atributos
	private String modeloVeiculo;
	private String marcaVeiculo;
	private String tipoVeiculo;
	private int qtdadeRodas;
	private int qtdadePassageiros;
	
	//Construtor
	public Veiculo2() {
	}
	
	//Método 
	public void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
			
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;		
		this.qtdadeRodas = rodas;
		this.qtdadePassageiros = passageiros;
	}
	
	//Método
	public void mostraVeiculo() {
		System.out.println("Modelo       : "+ modeloVeiculo);
		System.out.println("Marca        :"+ marcaVeiculo);
		System.out.println("Tipo         :"+ tipoVeiculo);
		System.out.println("Rodas        :"+ qtdadeRodas);
		System.out.println("Passageiros  :"+ qtdadePassageiros);
		System.out.println();
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getQtdadeRodas() {
		return qtdadeRodas;
	}

	public void setQtdadeRodas(int qtdadeRodas) {
		this.qtdadeRodas = qtdadeRodas;
	}

	public int getQtdadePassageiros() {
		return qtdadePassageiros;
	}

	public void setQtdadePassageiros(int qtdadePassageiros) {
		this.qtdadePassageiros = qtdadePassageiros;
	}
	
}
