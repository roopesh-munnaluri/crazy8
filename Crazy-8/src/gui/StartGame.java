package gui;

import java.io.IOException;
import java.util.Scanner;


public class StartGame {

	  static int players;
	    GameSteps game = new GameSteps();
	    Scanner in = new Scanner(System.in);


	  public void enterPlayers() throws IOException {
		    players = ChoosePlayer.players;
		    System.out.println(players);
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
		    	    System.out.println(Cards.ar);
		        	game.takeTurn(player);
		          player = game.nextPlayer(player);
		        }

		        for (int x = 0; x < players; x++) {
		            game.getPlayer(x).displayScore();
		          }
		        
		        in.close();

		  
	  }
	  
	  public static void main(String[] args) throws IOException {
		  
	    new Board_Welcome();
	    System.out.println("Hello1");
	    
		/*
		 * boolean check_number = true; boolean re_check_number = true;
		 * 
		 * System.out.println(" CRAZY 8'S"); System.out.println(); while(check_number ==
		 * true) { try { System.out.println("Enter number of players: "); String
		 * player_number = in.next(); System.out.println(player_number); players =
		 * Integer.parseInt(player_number); check_number = false; } catch
		 * (NumberFormatException e) { System.out.println("Try Again!!"); } }
		 * 
		 * while (players > 8 || players < 2) { while(re_check_number == true) {
		 * System.err.println("Players must be more than 2 less than 8");
		 * System.out.println(); try {
		 * System.out.println("Re-Enter number of players: "); String player_number =
		 * in.next(); players = Integer.parseInt(player_number); re_check_number =
		 * false; } catch (NumberFormatException e) { System.out.println("Try Again!!");
		 * } } }
		 */
	        
	}

}
