package uriOnline;

import java.util.Scanner;
import java.math.*;

public class Exerciciouri04 {

	private long numero, num = numero;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public boolean numero�Par() {
		return (numero % 2) == 0;
	}

	public boolean numero�DivisivelPorPrimeirosPrimos() {
		return (numero % 3) == 0 || ((numero != 5) && (numero % 5) == 0);
	}


	public boolean �OLDPrimo() {
		if (numero�Par()) {
			return false;
		} else {
			if (numero�DivisivelPorPrimeirosPrimos()) {
				return false;
			} else {
				return divididoPorAntecessores();
			}
		}
	}

	private boolean divididoPorAntecessores() {
		for (long valor = numero - 1; valor > 7; valor--) {
			long restoDivisao = numero % valor;
			if (restoDivisao == 0) { // Conseguiu dividir
				return false;
			}
		}
		return true;
	}

	public String mensagem() {
		String positivo = "Este n�mero � primo!";
		String negativo = "Este n�mero N�O � primo!";
		if (this.�Primo()) {
			return positivo;
		} else {
			return negativo;
		}
		// return this.�Primo() ? positivo : negativo;
	}

	public boolean �Primo() {
		long n = numero;
		long numChecks = 0;
		if (n == 2 || n == 3)
			return true;
		if ((n & 1) == 0 || n % 3 == 0)
			return false;
		long limit = (long) Math.sqrt(n) + 1;
			for (long i = 5, w = 2; i <= limit; i += w, w = 6 - w) {
				if (n % i == 0)
					return false;
					numChecks++;
			}
					return true;
	}	
}






