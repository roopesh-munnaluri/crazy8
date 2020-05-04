package crazy;

import java.io.IOException;
import java.util.Scanner;


public class StartGame {


	  public static void main(String[] args) throws IOException {
		  
		  int k = 1;
		  int players = 0;

		boolean check_number = true;
		boolean re_check_number = true;
		
	    GameSteps game = new GameSteps();
	    Scanner in = new Scanner(System.in);
	    

	    while(k == 1) {
	        System.out.println(" CRAZY 8'S");
	        System.out.println();
	        while(check_number == true) {
	        try 
	        { 
		        System.out.println("Enter number of players: ");
		        String player_number = in.next();
		        System.out.println(player_number);
	        	players = Integer.parseInt(player_number);
	        	check_number = false;
	        }  
	        catch (NumberFormatException e)  
	        { 
	            System.out.println("Try Again!!"); 
	        }
	        }
	        
	        while (players > 8 || players < 2) {
	        while(re_check_number == true) {
	          System.err.println("Players must be more than 2 less than 8");
	          System.out.println();
	  	        try 
	  	        { 
	  		        System.out.println("Re-Enter number of players: ");
	  		        String player_number = in.next();
	  	        	players = Integer.parseInt(player_number);
	  	        	re_check_number = false;
	  	        }  
	  	        catch (NumberFormatException e)  
	  	        { 
	  	            System.out.println("Try Again!!"); 
	  	        }
	  	        }	  	        
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
