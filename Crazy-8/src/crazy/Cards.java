package crazy;

public class Cards {
	
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

		  public String toString() {
		    return Ranks[rank] + " of " + Suits[suit]; 
		  }

		  public boolean equals(Cards that) {
		    return rank == that.rank
		        && suit == that.suit;
		  }

		  public static void printDeck(Cards[] cards) {
		    for (int i = 0; i < cards.length; i++) {
		      System.out.println(cards[i]);
		    }
		  }
		}

