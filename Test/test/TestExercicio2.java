package test;

import static org.junit.Assert.*;
import iniciante.Exercicio02;

import org.junit.Test;

public class TestExercicio2 {

	@Test
	public void test1000() {
		final int CORRETO = 150;
		Exercicio02 vendedor = new Exercicio02();
		vendedor.setTotalVendasMes(1000);
		int resultado = (int) vendedor.getPercentualVendas();
		assertEquals(CORRETO, resultado);
	}
	
	@Test
	public void testvirgula() {	
		final double CORRETO = 184.545;
		Exercicio02 vendedor = new Exercicio02();
		vendedor.setTotalVendasMes(1230.30);
		double resultado = (double) vendedor.getPercentualVendas();
		assertTrue(CORRETO == resultado);
	}
}
