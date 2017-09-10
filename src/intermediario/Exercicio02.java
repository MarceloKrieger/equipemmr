package intermediario;

public class Exercicio02 {
	public String frase;
	public String resultado;
	
	
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public String getResultado() {
		StringBuilder builder = new StringBuilder();
		frase = frase.replaceAll(" ", "");
		frase = frase.replaceAll("-", "");
		String resultado ="";
		for (int i = frase.length()-1; i >=0; i--){
			resultado+= frase.charAt(i);
		}
		if(resultado.equals(frase)){
			System.out.println("A frase é um palindromo.");
		}
		else {
			System.out.println("A frase não é um palindromo.");
		}
		return builder.toString();
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
	