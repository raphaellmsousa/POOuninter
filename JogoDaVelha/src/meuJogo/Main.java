package meuJogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Jogo jogo = new Jogo();
		String posicao;
		int valida = 0, Jogadas = 0;
		
		while(true) {
			System.out.println("JOGO DA VELHA");
			jogo.mostraTabuleiro();
			
			do {
				System.out.println("Jogador 1, informe uma posição: ");
				posicao = ler.next();
				while(!jogo.verificaValidadeDaJogada(posicao)) {
					System.out.println("Jogada inválida, teste novamente!");
					System.out.println("Jogador 1, informe uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.minhaJogada(posicao, "X");
				valida = 1;
				
			} while(valida == 0);
			
			Jogadas++;
			valida = 0;
			jogo.mostraTabuleiro();
			if(!jogo.vencedor(Jogadas).equals("null")) {
				break;
			}
			
			do {
				System.out.println("Jogador 2, informe uma posição: ");
				posicao = ler.next();
				while(!jogo.verificaValidadeDaJogada(posicao)) {
					System.out.println("Jogada inválida, teste novamente!");
					System.out.println("Jogador 2, informe uma posição: ");
					posicao = ler.next();
					valida = 0;
				}
				jogo.minhaJogada(posicao, "O");
				valida = 1;
			} while(valida == 0);

			Jogadas++;
			valida = 0;
			jogo.mostraTabuleiro();
			if(!jogo.vencedor(Jogadas).equals("null")) {
				break;
			}
			
		}
		
		System.out.println("O "+jogo.vencedor(Jogadas)+" venceu!");	
	}

}
