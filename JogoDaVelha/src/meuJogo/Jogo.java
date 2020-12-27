package meuJogo;

public class Jogo {

	//String[][] tabuleiro = new String [3][3];
	//Atribuição de valores para os índices do tabuleiro
	private String[][] tabuleiro = {{"1","2","3"},
			{"4","5","6"},{"7","8","9"}};
	
	//Função para imprimir o tabuleiro 
	public String mostraTabuleiro() {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" "+ tabuleiro[i][j]);
			}
			System.out.println("\n");
		}
		return null;
	}
	
	//Esta função verifica se a posição escolhida é válida
	public boolean verificaValidadeDaJogada(String posicao) {		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				if(tabuleiro[i][j].equals(posicao)) 
					return true;
				
			}			
		}
		return false;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void minhaJogada(String posicao, String jogador) {
		
		if(posicao.equals("1"))
			tabuleiro[0][0] = jogador;
		else if(posicao.equals("2"))
			tabuleiro[0][1] = jogador;
		else if(posicao.equals("3"))
			tabuleiro[0][2] = jogador;
		else if(posicao.equals("4"))
			tabuleiro[1][0] = jogador;
		else if(posicao.equals("5"))
			tabuleiro[1][1] = jogador;
		else if(posicao.equals("6"))
			tabuleiro[1][2] = jogador;
		else if(posicao.equals("7"))
			tabuleiro[2][0] = jogador;
		else if(posicao.equals("8"))
			tabuleiro[2][1] = jogador;
		else if(posicao.equals("9"))
			tabuleiro[2][2] = jogador;
	}
	
	public String vencedor(int quantidadeDeJogadas) {
		
		String[] T = new String[8];
		String vencedor = "null";
		
		if(quantidadeDeJogadas == 9) {
			vencedor = "EMPATE";			
		}
		
		T[0] = tabuleiro[0][0]+tabuleiro[0][1]+tabuleiro[0][2];
		T[1] = tabuleiro[1][0]+tabuleiro[1][1]+tabuleiro[1][2];
		T[2] = tabuleiro[2][0]+tabuleiro[2][1]+tabuleiro[2][2];
		
		T[3] = tabuleiro[0][0]+tabuleiro[1][0]+tabuleiro[2][0];
		T[4] = tabuleiro[0][1]+tabuleiro[1][1]+tabuleiro[2][1];
		T[5] = tabuleiro[0][2]+tabuleiro[1][2]+tabuleiro[2][2];
		
		T[6] = tabuleiro[0][0]+tabuleiro[1][1]+tabuleiro[2][2];
		T[7] = tabuleiro[0][2]+tabuleiro[1][1]+tabuleiro[2][0];
		
		for(int i=0; i<T.length; i++) {
			
			if(T[i].equals("XXX")) {
				vencedor = "Jogador 1";
			}
				
			else if(T[i].equals("OOO")) {
				vencedor = "Jogador 2";
			}				
		}
		return vencedor;
	}
}
