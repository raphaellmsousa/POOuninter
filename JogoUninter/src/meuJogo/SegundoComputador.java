package meuJogo;

public class SegundoComputador extends Computador {
	
	//Defini��o do computador 2 e sua estrat�gia de jogo
	//O preenchimento � feito na ordem sequencial decrescente de disponibilidade no tabuleiro
	@Override
	public void segundoComputador(String[][] Tabuleiro) {
		for(int i=2; i>=0; i--) {
			for(int j=2; j>=0; j--) {
				
				if(Tabuleiro[i][j].equals("1") || Tabuleiro[i][j].equals("2")
						|| Tabuleiro[i][j].equals("3") || Tabuleiro[i][j].equals("4") 
						|| Tabuleiro[i][j].equals("5") || Tabuleiro[i][j].equals("6") 
						|| Tabuleiro[i][j].equals("7") || Tabuleiro[i][j].equals("8") 
						|| Tabuleiro[i][j].equals("9")) {
					Tabuleiro[i][j] = "O";
					i = 0;
					j = 0;
				}	
			}
		}	
	}

	@Override
	public void primeiroComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terceiroComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}
}