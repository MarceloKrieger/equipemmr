package intermediario;
/**
 * Converte um número decimal para binário
 * @author marcelo.krieger
 *
 */
public class Exercicio04 {
	
	private int entrada,aux = 1,resultado, decimalParaBinario;
	
	/**
	 * Retorna o valor que será convertido
	 * @return
	 */
	public int getEntrada() {
		return entrada;
	}

	/**
	 * Define o valor que será convertido
	 * @param entrada
	 */
	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	/**
	 * Executa divisões consecutivas para gerar um número binário
	 * Usa a classe StringBuilder para evitar estouro de memória 
	 * (que poderia ser causado pelo uso direto da classe string)
	 * A reversão do valor em binário é feito pelo método reverse
	 * do StringBuilder
	 * @return
	 */
	public String getDecimalParaBinario() {
		StringBuilder builder = new StringBuilder();
		resultado = entrada;
		while(resultado >= 1) {	
			aux = resultado % 2;
			builder.append(aux);
			resultado = resultado / 2;
		}
		return builder.reverse().toString();
	}
