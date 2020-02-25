package entities;

public class JogoDaVelha {

	private String[][] mat = { { "1", "2", "3" }, { "4", "5", "6", }, { "7", "8", "9" } };

	public void tabuleiro() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("     " + mat[i][j] + "   ");

			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

	public boolean valido(String escolha) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j].equals(escolha))
					return true;
			}
		}
		return false;
	}

	public void jogada(String escolha, String jogador) {
		if (escolha.equals("1"))
			mat[0][0] = jogador;
		else if (escolha.equals("2"))
			mat[0][1] = jogador;
		else if (escolha.equals("3"))
			mat[0][2] = jogador;
		else if (escolha.equals("4"))
			mat[1][0] = jogador;
		else if (escolha.equals("5"))
			mat[1][1] = jogador;
		else if (escolha.equals("6"))
			mat[1][2] = jogador;
		else if (escolha.equals("7"))
			mat[2][0] = jogador;
		else if (escolha.equals("8"))
			mat[2][1] = jogador;
		else if (escolha.equals("9"))
			mat[2][2] = jogador;
	}

	public String Ganhou(int jogadas) {
		String[] T = new String[8];
		String vencedor = "null";
		if (jogadas == 9) {
			vencedor = "EMPATE";
		}

		T[0] = mat[0][0] + mat[0][1] + mat[0][2];
		T[1] = mat[1][0] + mat[1][1] + mat[1][2];
		T[2] = mat[2][0] + mat[2][1] + mat[2][2];

		T[3] = mat[0][0] + mat[1][0] + mat[2][0];
		T[4] = mat[0][1] + mat[1][1] + mat[2][1];
		T[5] = mat[0][2] + mat[1][2] + mat[2][2];

		T[6] = mat[0][0] + mat[1][1] + mat[2][2];
		T[7] = mat[0][2] + mat[1][1] + mat[2][0];

		for (int i = 0; i < T.length; i++) {
			if (T[i].equals("XXX")) {
				vencedor = "JOGADOR 1";
			} else if (T[i].equals("OOO")) {
				vencedor = "JOGADOR 2";
			}
		}
		
		return vencedor;

	}

}
