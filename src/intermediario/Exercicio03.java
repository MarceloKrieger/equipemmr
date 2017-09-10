package intermediario;

import java.util.Arrays;

public class Exercicio03 {
	public String frase;

	public String getFrase() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == ' ') {
				builder.append( "" );
			} else {
				builder.append( letra );
			}
		}
		return builder.toString();
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
}