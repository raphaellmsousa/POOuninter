package meuJogo;

public class Tabuleiro {

	//Função para imprimir o tabuleiro 
	public String mostraTabuleiro(String[][] Tabuleiro) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" "+ Tabuleiro[i][j]);
			}
			System.out.println("\n");
		}
		return null;
	}	
	
	//Função de controle, verifica o status da partida
	public String vencedor(int quantidadeDeJogadas, String[][] Tabuleiro) {
		
		String[] T = new String[8];
		String vencedor = "null";
		
		if(quantidadeDeJogadas == 9) {
			vencedor = "EMPATE";			
		}
		
		T[0] = Tabuleiro[0][0]+Tabuleiro[0][1]+Tabuleiro[0][2];
		T[1] = Tabuleiro[1][0]+Tabuleiro[1][1]+Tabuleiro[1][2];
		T[2] = Tabuleiro[2][0]+Tabuleiro[2][1]+Tabuleiro[2][2];
		
		T[3] = Tabuleiro[0][0]+Tabuleiro[1][0]+Tabuleiro[2][0];
		T[4] = Tabuleiro[0][1]+Tabuleiro[1][1]+Tabuleiro[2][1];
		T[5] = Tabuleiro[0][2]+Tabuleiro[1][2]+Tabuleiro[2][2];
		
		T[6] = Tabuleiro[0][0]+Tabuleiro[1][1]+Tabuleiro[2][2];
		T[7] = Tabuleiro[0][2]+Tabuleiro[1][1]+Tabuleiro[2][0];
		
		for(int i=0; i<T.length; i++) {
			
			if(T[i].equals("XXX")) {
				vencedor = "Humano";
			}
				
			else if(T[i].equals("OOO")) {
				vencedor = "Computador";
			}				
		}
		return vencedor;
	}
}
