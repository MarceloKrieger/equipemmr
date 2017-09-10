package test;

import static org.junit.Assert.*;
import iniciante.Exercicio01;

import org.junit.Test;

public class TestExercicio1 {

	@Test
	public void testpositivos() {
		final int CORRETO = 10;
		Exercicio01 somador = new Exercicio01();
		somador.setTermo1(3);
		somador.setTermo2(7);
		int resultado = somador.getResultado();
		assertEquals(CORRETO, resultado);
	}
	@Test
	public void testnegativos() {
		final int CORRETO = -10;
		Exercicio01 somador = new Exercicio01();
		somador.setTermo1(-3);
		somador.setTermo2(-7);
		int resultado = somador.getResultado();
		assertEquals(CORRETO, resultado);
	}
	@Test
	public void testpositivosnegativos() {
		final int CORRETO = -45;
		Exercicio01 somador = new Exercicio01();
		somador.setTermo1(100);
		somador.setTermo2(-145);
		int resultado = somador.getResultado();
		assertEquals(CORRETO, resultado);
	}
}