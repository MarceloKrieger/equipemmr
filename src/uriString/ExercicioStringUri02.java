package uriString;

public class ExercicioStringUri02 {
	int jogador1, jogador2;
	String resultado;
	int partidas;
	public int getPartidas() {
		return partidas;
	}
	public void setPartidas(int partidas) {
		this.partidas = partidas;
	}
	public int getJogador1() {
		return jogador1;
	}
	public void setJogador1(int jogador1) {
		this.jogador1 = jogador1;
	}
	public int getJogador2() {
		return jogador2;
	}
	public void setJogador2(int jogador2) {
		this.jogador2 = jogador2;
	}
	public String getResultado() {
		int pedra = 1, papel = 2, tesoura = 3, lagarto = 4, spock = 5;
		for (int i = 0; i <= partidas; i++){
			if (jogador1 == pedra){
				if (jogador2 == pedra){
					System.out.println("Resultado: EMPATE");
				}
					if (jogador2 == papel){
						System.out.println("Resultado: JOGADOR2");
					}
						if (jogador2 == tesoura){
							System.out.println("Resultado: JOGADOR1");
						}
							if (jogador2 == lagarto){
								System.out.println("Resultado: JOGADOR1");
							}		
								if (jogador2 == spock){
									System.out.println("Resultado: JOGADOR2");
								}		
			}
	

		
		}
		return resultado;
	}
}







