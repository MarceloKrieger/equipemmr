package iniciante;

import java.util.LinkedList;

public class Exercicio07 {
	
	int numeroDigitado, AUXILIAR;

	public int getNumeroDigitado() {
		return numeroDigitado;
	}

	public void setNumeroDigitado(int numeroDigitado) {
		this.numeroDigitado = numeroDigitado;
	}

	public LinkedList<Integer> getAUXILIAR() {
		LinkedList<Integer> retorno = new LinkedList<Integer>();
		int i = 0,j = 0,s = 0;
		
		while(j < 1000){
			j++;
			i++;
			s++;
			if(i > numeroDigitado){
				i = 0;
			}
			retorno.add( i );
		}
		return retorno;
	}

}