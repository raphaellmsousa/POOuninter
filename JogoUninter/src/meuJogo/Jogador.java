package meuJogo;

public class Jogador {
	
	//Esta função verifica se a posição escolhida é válida
	public boolean verificaValidadeDaJogada(String posicao, String[][] Tabuleiro) {		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(Tabuleiro[i][j].equals(posicao)) 
					return true;				
			}			
		}
		return false;
	}
		
	//Esta função escreve a jogada no tabuleiro para impressão
	public void minhaJogada(String posicao, String jogador, String[][] Tabuleiro) {
			
		if(posicao.equals("1"))
			Tabuleiro[0][0] = jogador;
		else if(posicao.equals("2"))
			Tabuleiro[0][1] = jogador;
		else if(posicao.equals("3"))
			Tabuleiro[0][2] = jogador;
		else if(posicao.equals("4"))
			Tabuleiro[1][0] = jogador;
		else if(posicao.equals("5"))
			Tabuleiro[1][1] = jogador;
		else if(posicao.equals("6"))
			Tabuleiro[1][2] = jogador;
		else if(posicao.equals("7"))
			Tabuleiro[2][0] = jogador;
		else if(posicao.equals("8"))
			Tabuleiro[2][1] = jogador;
		else if(posicao.equals("9"))
			Tabuleiro[2][2] = jogador;
	}
		
}
