package iniciante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio04 {
	private String dataInicial;
	private String dataFinal;
	
	private Date converterData(String strData) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date data = dateFormat.parse(strData);
		return data;
	}

	
	public double getDiferencaEmDias() throws ParseException {
		final int MILISECONDS    =   1000;
		final int MIN_PER_HOUR   =   60;
		final int SEC_PER_MIN    =   60;
		final int HOURS_PER_DAY  =   24;
		
		final Date INI = converterData(dataInicial);
		final Date FIM = converterData(dataFinal);
		
		final long TEMPO_INICIAL    = INI.getTime();
		final long TEMPO_FINAL      = FIM.getTime();
		
		final long DIFERENCA  = (TEMPO_FINAL - TEMPO_INICIAL);
	
		final double DIFERENCA_EM_DIA = (double) (DIFERENCA / (MILISECONDS * MIN_PER_HOUR * SEC_PER_MIN * HOURS_PER_DAY));

		return DIFERENCA_EM_DIA;
	}

	public String getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	
}
