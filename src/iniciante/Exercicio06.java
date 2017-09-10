package iniciante;

public class Exercicio06 {
	
	public int valorInicial, valorFinal, total = 0;

	public int getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}

	public int getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(int valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getTotal() {
		if(valorInicial == valorFinal) {
			total = 0;
			System.out.println("Soma impares = " +total);
	}	
	
		if(valorInicial != valorFinal) {
			for (int i = valorInicial; i <= valorFinal; i++) {
				if (i % 2 != 0) {
					total += i;
					}
				}
		}
	
		return total;
}
}