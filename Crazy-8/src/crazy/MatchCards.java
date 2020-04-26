package crazy;

import java.util.Scanner;

public class MatchCards extends Cards {
	Scanner in = new Scanner(System.in);

	  public MatchCards(int rank, int suit) {
	    super(rank, suit);
	  }
	  
	  public boolean cardMatches(MatchCards match) 
	  {
		  System.out.println(getRank());
		  if (getSuit() == match.getSuit() || getRank() == match.getRank())
		  {
			    return true;
		}
		  if (getRank() == 8) {
		    	System.out.println("Enter the suit you want to choose");
		    	System.out.println("1. Clubs 2. Diamonds 3. Hearts, 4. Spades");
		    	suit = in.nextInt()-1;
		    	System.out.println(Suits[getSuit()]);
		    	new Cards(getRank(),getSuit());
		    	return true;
		    }
		  else {
			  return false;
		  }	  
	  }  
	  public int scoreCard() {

		    int rank = getRank();
		    if (rank == 8) {
		      return 0;
		    } else if (rank > 10) {
		      return 10;
		    } else {
		      return rank;
		    }
		  }
	  public MatchCards convert(Cards card) {
	    if (card != null) {
	    MatchCards result = new MatchCards(card.getRank(), card.getSuit());
	    return result;
	    } 
	    return null;
	  }
	}