//Desenvolvido por Raphaell Maciel de Sousa
//12/04/2020

package meuJogo;

import java.util.Scanner;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		//instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();
		
		String[][] tabuleiro = {{"1","2","3"},
				{"4","5","6"},{"7","8","9"}};
		
		//Definição de variáveis e construção dos objtos 
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		Tabuleiro jogo = new Tabuleiro();
		Jogador jogador = new Jogador();
		//Computador computadorX = new Computador();
		PrimeiroComputador comp1 = new PrimeiroComputador();
		SegundoComputador comp2 = new SegundoComputador(); 
		TerceiroComputador comp3 = new TerceiroComputador(); 
		
		String posicao;
		String computador = null;
		int valida = 0, Jogadas = 0;
			
		//Impressão de intruções
		System.out.println("JOGO DA VELHA V.1.0");
		System.out.println();
		
		System.out.println("Vamos escolher aleatoriamente quem começa...");
		
		int primeiroJogador = gerador.nextInt(2); //Para escolha aleatória de quem inicia a partida
		
		//Início do loop
		while(true) {			
			
			//Impressão de instruções
			if (primeiroJogador == 0) {
				System.out.println("Jogador Humano inicia");
				System.out.println();
			}
			else if (primeiroJogador == 1) {
				System.out.println("Computador inicia");
				System.out.println();
			}
						
			if(computador == null){
				do {
					System.out.println("SELECIONE O COMPUTADOR 1, 2 OU 3");
					computador = ler.next();
					
					//Seleciona o computador que será seu oponente
					if(computador.equals("1") || computador.equals("2") || computador.equals("3")) {
						System.out.println("Ok, você selecionou o computador "+computador);
						System.out.println("Vamos começar o nosso jogo!");
						System.out.println();	
					}
					else {
						System.out.println("Opção Inválida, tente novamente!");
						computador = null;
					}
					
				} while(computador == null);		
				
			}		
			
			//Istruções para o jogador humano
			if (primeiroJogador == 0 || primeiroJogador == 20) {
				
				System.out.println("Humano Jogando");
				primeiroJogador = 10;
							
				do {
					jogo.mostraTabuleiro(tabuleiro);
					System.out.println("Jogador 1, informe uma posição: ");
					posicao = ler.next();
					while(!jogador.verificaValidadeDaJogada(posicao, tabuleiro)) {
						System.out.println("Jogada inválida, teste novamente!");
						System.out.println("Jogador 1, informe uma posição: ");
						posicao = ler.next();
						valida = 0;						
					}
					jogador.minhaJogada(posicao, "X", tabuleiro);
					valida = 1;
					
				} while(valida == 0);
				
				Jogadas++;
				valida = 0;
				if(!jogo.vencedor(Jogadas, tabuleiro).equals("null")) {
					break;
				}
			}	
			
			//Intruções para o computador
			else if (primeiroJogador == 1 || primeiroJogador == 10) {
			
				System.out.println("Computador Jogando");
				primeiroJogador = 20;
								
				do {
					jogo.mostraTabuleiro(tabuleiro);
					System.out.println("Computador: "+computador);
					if(computador.equals("1")) {
						comp1.primeiroComputador(tabuleiro);
					}
					else if(computador.equals("2")) {
						comp2.segundoComputador(tabuleiro);
					}
					else if(computador.equals("3")) {
						comp3.terceiroComputador(tabuleiro);
					}
										
					valida = 1;					
					
				} while(valida == 0);

				Jogadas++;
				valida = 0;
				if(!jogo.vencedor(Jogadas, tabuleiro).equals("null")) {
					break;
				}
			}			
			
		}
		//Impressão de instruções
		if(jogo.vencedor(Jogadas, tabuleiro).equals("Humano")) {
			System.out.println("");
			System.out.println("Parabéns, vc venceu!");	
			jogo.mostraTabuleiro(tabuleiro);
		}
		else if(jogo.vencedor(Jogadas, tabuleiro).equals("Computador")) {
			System.out.println("");
			System.out.println("Lamento, mas o computador "+computador+" venceu!");	
			jogo.mostraTabuleiro(tabuleiro);
		}
		else if(jogo.vencedor(Jogadas, tabuleiro).equals("EMPATE")) {
			System.out.println("");
			System.out.println("Houve um EMPATE!");	
			jogo.mostraTabuleiro(tabuleiro);
		}
		
	}
}
