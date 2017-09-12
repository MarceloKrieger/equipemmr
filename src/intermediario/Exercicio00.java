package intermediario;

/**
 * Transforma uma frase para seu equivalente na cifra de César
 * @author marcelo.krieger
 *
 */
public class Exercicio00 {
	
	String frase, AUXILIAR;
		
	public String getFrase() {
		return frase;
	}

	/**
	 * Frase original
	 * @param frase
	 */
	public void setFrase(String frase) {
		this.frase = frase;
	}

	/**
	 * Frase criptografada
	 * @return
	 */
	public String getAUXILIAR() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < frase.length(); i++) {
			
			char elemento = frase.charAt(i);
			
			if (frase.charAt(i) == (char) 120) {
				 elemento = (char) 94;
			}
			if (frase.charAt(i) == (char) 121) {
				 elemento = (char) 95;
			}
			if (frase.charAt(i) == (char) 122) {
				 elemento = (char) 96;
			}
			elemento = (char) (elemento + 3);
			builder.append(elemento);			
		}
		return builder.toString();
	}
}
