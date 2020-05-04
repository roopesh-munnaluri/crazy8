package gui;


public class MatchCards extends Cards {

	  public MatchCards(int rank, int suit) {
	    super(rank, suit);
	  }
	  
	  public boolean cardMatches(MatchCards match) 
	  {
		  if (getRank() == 8) {
		    	return true;
		    }
		  if (getSuit() == match.getSuit() || getRank() == match.getRank())
		  { 
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