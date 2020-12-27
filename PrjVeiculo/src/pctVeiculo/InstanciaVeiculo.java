package pctVeiculo;

public class InstanciaVeiculo {

	public static void main(String[] args) {
		
		//classe veiculo Objeto carro Construtor Veiculo()
		Veiculo carro = new Veiculo(); 
		carro.incluiVeiculo("Peugeout 208", "Peugeout", "Passageiros", 4, 5);
		carro.mostraVeiculo();
		
		Veiculo moto = new Veiculo();
		moto.incluiVeiculo("Iron 883", "Harley-Davidson", "Passageiro", 2, 2);		
		moto.mostraVeiculo();
		
		Veiculo onibus = new Veiculo();		
		onibus.incluiVeiculo("9700 Grand L", "Volvo", "Passageiro", 6, 42);
		onibus.mostraVeiculo();
	
	}

}
