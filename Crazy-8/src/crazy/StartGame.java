package crazy;

import java.util.Scanner;


public class StartGame {


	  public static void main(String[] args) {
		  
		  int k = 1;

	    GameSteps game = new GameSteps();
	    Scanner in = new Scanner(System.in);
	    while(k == 1) {
	        System.out.println(" CRAZY 8'S");
	        System.out.println();
	        System.out.println("Enter number of players: ");

	        int players = in.nextInt();
	        while (players > 8 || players < 2) {
	          System.err.println("Players must be more than 2 less than 8");
	          System.out.println();
	          System.out.println("Re-enter number of players: ");
	          players = in.nextInt();
	        }

	        if(players==2) {
	        for (int i = 0; i < players; i++) {
	        	game.twoPlayers();
	        }
	        }
	        else {
	        	for (int i = 0; i < players; i++) {
		        	game.morePlayers();
		        }	
	        }
	        AllPlayers player = game.getPlayer(0);
	        while (!game.isDone()) {
	        	game.displayState();
	        	game.takeTurn(player);
	          player = game.nextPlayer(player);
	        }

	        for (int x = 0; x < players; x++) {
	            game.getPlayer(x).displayScore();
	          }
	        
	        System.out.println("------------------------------------ ");
	        
	        System.out.println("Press 1 to play new game ");
	        System.out.println("press 2 to exit");
	        k = in.nextInt();

	  }
	    System.out.println("Thanks for playing");
        
	    in.close();
	}

}
