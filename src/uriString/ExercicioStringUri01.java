package uriString;

public class ExercicioStringUri01 {

	int posicao1, auxPosicao, Auxiliar;

	public int getposicao1() {
		return posicao1;
	}

	public void setPosicao1(int posicao) {
		this.posicao1 = posicao;
	}

	public String getArvore() {
		StringBuilder arvore = new StringBuilder();
		for (int i = 1; i <= posicao1; i++) {
			for (int j = 1; j <= posicao1; j++)
				if (j == posicao1) {
					for (int i2 = 1; i2 < auxPosicao; i2++)
						arvore.append('*');

					auxPosicao = auxPosicao + 2;
					posicao1--;

				} else {
					arvore.append(' ');

				}
			arvore.append("\n");

		}
		for (int i = 1; i <= posicao1 * 2 - 1; i++) {

			arvore.append(" ");
		}
		arvore.append("*\n");
		for (int i = 1; i <= posicao1 * 2 - 2; i++) {
			arvore.append(" ");
		}
		arvore.append("***\n");

		return arvore.toString();
	}

}