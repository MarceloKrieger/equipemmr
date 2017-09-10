package iniciante;

public class Exercicio09 {
	
	int Nota100Count,Nota50Count,Nota20Count,Nota10Count,
	Nota5Count,Nota2Count,Nota1Count,AUXILIAR;
	
	int ValorSaque;


		public int getValorSaque() {
		return ValorSaque;
	}


	public void setValorSaque(int ValorSaque) {
		this.ValorSaque = ValorSaque;
	}

	public int getAUXILIAR() {
		if(ValorSaque < 3000){

			{
				   	while (ValorSaque >= 100)
					{
						ValorSaque = ValorSaque - 100;
						Nota100Count++;
					}
					while (ValorSaque >= 50)
					{
						ValorSaque = ValorSaque - 50;
						Nota50Count++;
					}
					while (ValorSaque >= 20)
					{
						ValorSaque = ValorSaque - 20;
						Nota20Count++;				
					}
					while (ValorSaque >= 10)
					{
						ValorSaque = ValorSaque - 10;
						Nota10Count++;
					}
					while (ValorSaque >= 5)
					{
						ValorSaque = ValorSaque - 5;
						Nota5Count++;
					}
					while (ValorSaque >= 2)
					{
						ValorSaque = ValorSaque - 2;
						Nota2Count++;
					}
					while (ValorSaque == 1)
					{
						ValorSaque = ValorSaque - 1;
						Nota1Count++;
					}
					System.out.println("Notas de R$100 sacadas:  " + Nota100Count+ ".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$50  sacadas:  " + Nota50Count +".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$20  sacadas:  " + Nota20Count +".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$10  sacadas:  " + Nota10Count +".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$5   sacadas:  " + Nota5Count + ".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$2   sacadas:  " + Nota2Count + ".");
					System.out.println("-----------------------------------------");
					System.out.println("Notas de R$1   sacadas:  " + Nota1Count + ".");
					System.out.println("-----------------------------------------");	
				}
		}
		return AUXILIAR;
	}
}