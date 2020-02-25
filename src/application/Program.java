package application;

import java.util.Scanner;

import entities.JogoDaVelha;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		JogoDaVelha jogo = new JogoDaVelha();

		String posicao;
		int valida = 0, jogadas = 0;

		while (true) {
			System.out.println("* * * JOGO DA VELHA * * *");
			System.out.println();

			jogo.tabuleiro();
			
			do {
				System.out.print("JOGADOR 1: ");
				posicao = sc.next();
				while(!jogo.valido(posicao)) {
					System.out.println("jogada invalida, digite novamente!");
				System.out.print("JOGADOR 1: ");
				posicao = sc.next();
				valida = 0;
				}
				jogo.jogada(posicao, "X");
				valida = 1;				
			}while(valida == 0);

			jogadas++;
			valida = 0;
			jogo.tabuleiro();
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
			
			do {
				System.out.print("JOGADOR 2: ");
				posicao = sc.next();
				while(!jogo.valido(posicao)) {
					System.out.println("jogada invalida, digite novamente!");
				System.out.print("JOGADOR 2: ");
				posicao = sc.next();
				valida = 0;
				}
				jogo.jogada(posicao, "O");
				valida = 1;
				jogo.tabuleiro();
			}while(valida == 0);
			
			jogadas++;
			valida = 0;
			jogo.tabuleiro();
			if(!jogo.Ganhou(jogadas).equals("null")) {
				break;
			}
			
		}
		
		System.out.println("O " + jogo.Ganhou(jogadas) + " venceu!");

	}

}
