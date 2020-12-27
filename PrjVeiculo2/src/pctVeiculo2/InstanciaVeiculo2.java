package pctVeiculo2;

public class InstanciaVeiculo2 {

	public static void main(String[] args) {
		
		//classe veiculo Objeto carro Construtor Veiculo()
		Veiculo2 carro = new Veiculo2(); 
		carro.incluiVeiculo("Peugeout 208", "Peugeout", "Passageiros", 4, 5);
		carro.mostraVeiculo();		

		carro.setModeloVeiculo("Peugeout 308");
		System.out.println("**** Modelo Alterado: "+ carro.getModeloVeiculo());
		carro.mostraVeiculo();	
		System.out.println();
		
		Veiculo2 moto = new Veiculo2();
		moto.incluiVeiculo("Iron 883", "Harley-Davidson", "Passageiro", 2, 2);		
		moto.mostraVeiculo();
		
		Veiculo2 onibus = new Veiculo2();		
		onibus.incluiVeiculo("9700 Grand L", "Volvo", "Passageiro", 6, 42);
		onibus.mostraVeiculo();			
		
	}
	
}