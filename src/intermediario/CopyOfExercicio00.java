package intermediario;

import java.util.LinkedList;

public class CopyOfExercicio00 {
	
	String frase, AUXILIAR;
		
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public LinkedList<Character> getAUXILIAR() {
		LinkedList<Character> retorno = new LinkedList<Character>();
		
		for (int i = 0; i < frase.length(); i++) {
			
			char elemento = frase.charAt(i);
			
			if (frase.charAt(i) == (char) 120) {
				 elemento = (char) 94;
				 retorno.add ( elemento );
			}
			if (frase.charAt(i) == (char) 121) {
				 elemento = (char) 95;
				 retorno.add ( elemento );
			}
			if (frase.charAt(i) == (char) 122) {
				 elemento = (char) 96;
				 retorno.add ( elemento );
			}
			elemento = (char) (elemento + 3);
			retorno.add ( elemento );			
		}
		return retorno;
	}
}