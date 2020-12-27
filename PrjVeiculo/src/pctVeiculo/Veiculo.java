package pctVeiculo;

public class Veiculo {

	//Atributos
	String modeloVeiculo;
	String marcaVeiculo;
	String tipoVeiculo;
	int qtdadeRodas;
	int qtdadePassageiros;
	
	//Construtor
	public Veiculo() {
		super();
	}
	
	//Método 
	void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
		
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;		
		this.qtdadeRodas = rodas;
		this.qtdadePassageiros = passageiros;
	}
	
	//Método
	void mostraVeiculo() {
		System.out.println("Modelo       : "+ modeloVeiculo);
		System.out.println("Marca        :"+ marcaVeiculo);
		System.out.println("Tipo         :"+ tipoVeiculo);
		System.out.println("Rodas        :"+ qtdadeRodas);
		System.out.println("Passageiros  :"+ qtdadePassageiros);
		System.out.println();
	}
}
