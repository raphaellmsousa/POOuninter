package meuJogo;

public class PrimeiroComputador extends Computador {

	//Definição do computador 1 e sua estratégia de jogo
	//O preenchimento é feito na ordem sequencial crescente de disponibilidade no tabuleiro
	@Override
	public void primeiroComputador(String[][] Tabuleiro) {

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
					
				if(Tabuleiro[i][j].equals("1") || Tabuleiro[i][j].equals("2")
						|| Tabuleiro[i][j].equals("3") || Tabuleiro[i][j].equals("4") 
						|| Tabuleiro[i][j].equals("5") || Tabuleiro[i][j].equals("6") 
						|| Tabuleiro[i][j].equals("7") || Tabuleiro[i][j].equals("8") 
						|| Tabuleiro[i][j].equals("9")) {
					Tabuleiro[i][j] = "O";
					i = 3;
					j = 3;
				}	
			}
		}	
	}

	@Override
	public void segundoComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terceiroComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}
}
