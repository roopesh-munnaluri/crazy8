package crazy;

public class MatchCards extends Cards {

	  public MatchCards(int rank, int suit) {
	    super(rank, suit);
	  }
	  public boolean cardMatches(MatchCards match) {
	    if (getSuit() == match.getSuit()) {
	      return true;
	    }
	    if (getRank() == match.getRank()) {
	      return true;
	    }
	    if (getRank() == 8) {
	      return true;
	    }
	    return false;
	  }

	  public MatchCards convert(Cards card) {
	    if (card != null) {
	    MatchCards result = new MatchCards(card.getRank(), card.getSuit());
	    return result;
	    } 
	    return null;
	  }
	}