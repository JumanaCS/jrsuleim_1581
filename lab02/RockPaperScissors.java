import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();

		for(int i =0; i<cases; i++){
			String player1 = input.next();
			String player2 = input.next();
				if(player1.equals("rock") == true){
					switch(player2){
						case "rock": System.out.println("Tie!"); break;
						case "paper": System.out.println("Player 2 wins!"); break;
						case "scissors": System.out.println("Player 1 wins!"); break;
					}
				}
				else if(player1.equals("paper")==true){
					switch(player2){
						case "rock": System.out.println("Player 1 wins!"); break;
						case "paper": System.out.println("Tie!"); break;
						case "scissors": System.out.println("Player 2 wins!"); break; 
					}
				}
				else if(player1.equals("scissors")==true){
					switch(player2){
						case "rock": System.out.println("Player 2 wins!"); break;
						case "paper": System.out.println("Player 1 wins!"); break;
						case "scissors": System.out.println("Tie!"); break; 
					}
				}

		}
	}
}