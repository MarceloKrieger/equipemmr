package test;

import static org.junit.Assert.*;
import iniciante.Exercicio03;

import org.junit.Test;
public class TestExercicio3 {

	@Test
	public void test_raio2() {
		final double CORRETO = 12.5664;
		Exercicio03 calculo = new Exercicio03();
		calculo.setR(2);
		double resultado = (double) calculo.getArea();		
		
		int precision = 10000; //keep 4 digits
		resultado = Math.floor(resultado * precision +.5 ) / precision;	
		assertTrue(resultado == CORRETO);
	}

}
