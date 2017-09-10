package iniciante;

public class Exercicio02 {

	String Nome;
	int SalarioFixo;
	double TotalVendasMes;
	double PercentualVendas, j=0.15;
	double PercentualVendas2;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
		
	}
	public int getSalarioFixo() {
		return SalarioFixo;
	}
	public void setSalarioFixo(int salarioFixo) {
		SalarioFixo = salarioFixo;
	}
	public double getTotalVendasMes() {
		return TotalVendasMes;
	}
	public void setTotalVendasMes(double totalVendasMes) {
		TotalVendasMes = totalVendasMes;
	}
	
	public double getPercentualVendas() {
		return PercentualVendas = (TotalVendasMes*j);
	}
		
		}
