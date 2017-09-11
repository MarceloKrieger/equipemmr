package uriString;

public class ExercicioStringUri02 {
	
	int Pedra = 1,Papel = 2,Tesoura = 3,Lagarto = 4,Spock = 5 ,player1, player2,JOGO;

	public int getPlayer1() {
		return player1;
	}

	public void setPlayer1(int player1) {
		this.player1 = player1;
	}

	public int getPlayer2() {

		return player2;
	}
	
	public void setPlayer2(int player2) {
		this.player2 = player2;
	}

	public int getJOGO() {
	
	//----------------------------------- COMPARATIVO ENTRE PEDRA E PAPEL -------------------------------------------------------------//
		
		if(player1 == Pedra && player2 == Papel) {
			System.out.print("Papel cobre Pedra!");
			System.out.print("Player 2 wins!");
			
		}
		if(player1 == Papel && player2 == Pedra) {
			System.out.print("Papel cobre Pedra!");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Pedra && player2 == Pedra || player1 == Papel && player2 == Papel) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PEDRA E TESOURA -------------------------------------------------------------//
		
		if(player1 == Pedra && player2 == Tesoura) {
			System.out.print("Pedra esmaga Tesoura!\n\n");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Tesoura && player2 == Pedra) {
			System.out.print("Pedra esmaga Tesoura!\n\n");
			System.out.print("Player 2 wins!");
		}
		if(player1 == Pedra && player2 == Pedra || player1 == Tesoura && player2 == Tesoura) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PEDRA E LAGARTO -------------------------------------------------------------//		
		
		if(player1 == Pedra && player2 == Lagarto) {
			System.out.print("Pedra derruba Lagarto!\n\n");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Lagarto && player2 == Pedra) {
			System.out.print("Pedra derruba Lagarto!\n\n");
			System.out.print("Player 2 wins!");
		}
		if(player1 == Pedra && player2 == Pedra || player1 == Lagarto && player2 == Lagarto) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PEDRA E SPOCK -------------------------------------------------------------//
		
		if(player1 == Pedra && player2 == Spock) {
			System.out.print("Spock vaporiza Pedra!\n\n");
			System.out.print("Player 2 wins!");
			
		}
		if(player1 == Spock && player2 == Pedra) {
			System.out.print("Spock vaporiza Pedra!\n\n");
			System.out.print("Player 1 wins!");
		}
		if(player1 == Pedra && player2 == Pedra || player1 == Spock && player2 == Spock) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PAPEL E TESOURA -------------------------------------------------------------//
		
		if(player1 == Papel && player2 == Tesoura) {
			System.out.print("Tesoura corta Papel!\n\n");
			System.out.print("Player 2 wins!");
			
		}
		if(player1 == Tesoura && player2 == Papel) {
			System.out.print("Tesoura corta Papel!\n\n");
			System.out.print("Player 1 wins!");
		}
		if(player1 == Papel && player2 == Papel || player1 == Tesoura && player2 == Tesoura) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PAPEL E LAGARTO -------------------------------------------------------------//
		
		if(player1 == Papel && player2 == Lagarto) {
			System.out.print("Lagarto come Papel!\n\n");
			System.out.print("Player 2 wins!");
			
		}
		if(player1 == Lagarto && player2 == Papel) {
			System.out.print("Lagarto come Papel!\n\n");
			System.out.print("Player 1 wins!");
		}
		if(player1 == Papel && player2 == Papel || player1 == Lagarto && player2 == Lagarto) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE PAPEL E SPOCK -------------------------------------------------------------//
		
		if(player1 == Papel && player2 == Spock) {
			System.out.print("Papel refuta Spock!\n\n");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Spock && player2 == Papel) {
			System.out.print("Papel refuta Spock!\n\n");
			System.out.print("Player 2 wins!");
		}
		if(player1 == Papel && player2 == Papel || player1 == Spock && player2 == Spock) {
			System.out.print("Empate!");
		}
		
	//----------------------------------- COMPARATIVO ENTRE TESOURA E LAGARTO -------------------------------------------------------------//
		
		if(player1 == Tesoura && player2 == Lagarto) {
			System.out.print("Tesoura prende Lagarto!\n\n");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Lagarto && player2 == Tesoura) {
			System.out.print("Tesoura prende Lagarto!\n\n");
			System.out.print("Player 2 wins!");
		}
		if(player1 == Tesoura && player2 == Tesoura || player1 == Lagarto && player2 == Lagarto) {
			System.out.print("Empate!");
		}	
		
	//----------------------------------- COMPARATIVO ENTRE TESOURA E SPOCK -------------------------------------------------------------//
		
		if(player1 == Tesoura && player2 == Spock) {
			System.out.print("Spock derrete Tesoura!\n\n");
			System.out.print("Player 2 wins!");
			
		}
		if(player1 == Spock && player2 == Tesoura) {
			System.out.print("Spock derrete Tesoura!\n\n");
			System.out.print("Player 1 wins!");
		}
		if(player1 == Tesoura && player2 == Tesoura || player1 == Spock && player2 == Spock) {
			System.out.print("Empate!");
		}	
		
	//----------------------------------- COMPARATIVO ENTRE LAGARTO E SPOCK -------------------------------------------------------------//	
		
		if(player1 == Lagarto && player2 == Spock) {
			System.out.print("Lagarto adormece Spock!\n\n");
			System.out.print("Player 1 wins!");
			
		}
		if(player1 == Spock && player2 == Lagarto) {
			System.out.print("Lagarto adormece Spock!\n\n");
			System.out.print("Player 2 wins!");
		}
		if(player1 == Lagarto && player2 == Lagarto || player1 == Spock && player2 == Spock) {
			System.out.print("Empate!");
		}	
		return JOGO;
	}
}
