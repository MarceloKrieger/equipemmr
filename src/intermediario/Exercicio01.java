package intermediario;

public class Exercicio01 {
	public String frase;
	public int quantidadecaracteres = 0;
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public int getQuantidadecaracteres() {
		for(int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) >= 97 && frase.charAt(i) <= 122){
				quantidadecaracteres++;
			}
			if (frase.charAt(i) == 32) {
				System.out.print(""+ quantidadecaracteres);
				System.out.print(" ");
				quantidadecaracteres = 0;
			}
		}
		return quantidadecaracteres;
	}
	public void setQuantidadecaracteres(int quantidadecaracteres) {
		this.quantidadecaracteres = quantidadecaracteres;
	}
	
}

