package uriMath;

public class ExercicioMathUri02 {

	int numero1, numero2, resultado = 0, contador = 0;

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		
		while (numero1 <= numero2){
				resultado = resultado + numero1;
				numero1++;
		}
		return resultado;
	}
	
}
