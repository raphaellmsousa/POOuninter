package meuJogo;

import java.util.Random;

public class TerceiroComputador extends Computador {
	
	//Defini��o do computador 3 e sua estrat�gia de jogo
	//O preenchimento � feito de forma aleat�ria
	@Override
	public void terceiroComputador(String[][] Tabuleiro) {
		
		int hab = 0; 
		while(hab==0) {			
				Random gerador = new Random();
				int i = gerador.nextInt(3);
				int j = gerador.nextInt(3);
			
				if(Tabuleiro[i][j].equals("1") || Tabuleiro[i][j].equals("2")
						|| Tabuleiro[i][j].equals("3") || Tabuleiro[i][j].equals("4") 
						|| Tabuleiro[i][j].equals("5") || Tabuleiro[i][j].equals("6") 
						|| Tabuleiro[i][j].equals("7") || Tabuleiro[i][j].equals("8") 
						|| Tabuleiro[i][j].equals("9")) {
					Tabuleiro[i][j] = "O";

				hab = 1;
			}
			else {
				hab = 0;
			}
		} 	
	}

	@Override
	public void primeiroComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void segundoComputador(String[][] Tabuleiro) {
		// TODO Auto-generated method stub
		
	}
	
}
