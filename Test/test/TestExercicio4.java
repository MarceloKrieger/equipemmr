package test;

import static org.junit.Assert.*;
import iniciante.Exercicio01;
import iniciante.Exercicio04;

import org.junit.Test;

public class TestExercicio4 {

	
	// ESTA DANDO ERRO
	@Test
	public void testdata_grande() {
		final String CORRETO = "24388";
		Exercicio04 data = new Exercicio04();
		data.setDataInicial(15/05/1991);
		data.setDataFinal(20/02/2058);
		String resultado = data.getDiferencaEmDias();
		assertEquals(CORRETA, resultado);
	}	
}
