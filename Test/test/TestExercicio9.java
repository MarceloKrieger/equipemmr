package test;

import static org.junit.Assert.*;
import iniciante.Exercicio09;
import org.junit.Test;

public class TestExercicio9 {

	@Test
	public void test() {
		final int CORRETO100 = 1;
		final int CORRETO50 = 0;
		final int CORRETO20 = 1;
		final int CORRETO10 = 0;
		final int CORRETO5 = 1;
		final int CORRETO2 = 0;
		final int CORRETO1 = 0;
		Exercicio09 saque = new Exercicio09();
		saque.setValorSaque(125);
		double resultado = (int) saque.getAUXILIAR();
	}

}

