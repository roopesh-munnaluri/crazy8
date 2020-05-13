package gui;

import java.util.ArrayList;

public class Cards {
	static ArrayList<String> ar = new ArrayList<String>();
	
	String[] Ranks = {
		      "","Ace", "2", "3", "4", "5", "6", "7",
		      "8", "9", "10", "Jack", "Queen", "King"};
	public String[] Suits = {
		      "Clubs", "Diamonds", "Hearts", "Spades"};

	int rank;
	int suit;

		  public Cards(int rank, int suit) {

		    this.rank = rank;
		    this.suit = suit;
		  }

		  public int getRank() {
		    return rank;
		  }

		  public int getSuit() {
		    return suit;
		  }  

		  public void tostring() {
			  String card_names = Ranks[rank] + " of " + Suits[suit];
			  ar.add(card_names);
		  }


		  public static void printDeck(Cards[] cards) {
		    for (int i = 0; i < cards.length; i++) {
		      System.out.println(cards[i]);
		    }
		  }
		}

