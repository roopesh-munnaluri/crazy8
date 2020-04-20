package crazy;

import java.util.Scanner;

public class AllPlayers extends Player {
	Scanner in = new Scanner(System.in);
    public CollectionOfCards collectioncards;
	public AllPlayers(String name) {
	    super(name);
	    collectioncards = new CollectionOfCards(name);
	}
	public CollectionOfCards getHand() {
	    return collectioncards;
	}
	public MatchCards play(GameSteps eights, MatchCards prev) {
		MatchCards ecard = new MatchCards(0, 0);
	    ecard = ecard.convert(searchForMatch(prev));
	    if (ecard == null) {
	      ecard = drawForMatch(eights, prev);
	      return ecard;
	    }
	    return ecard;
	  }

	  public Cards searchForMatch(MatchCards prev) {
		  
		  System.out.println(getName() + " Enter index of the card to discard");
		  System.out.println("PRESS 9 To pic a card");
		  int i = in.nextInt();
		  if(i == 9 )
		  { return null;}
		  else
		  {
		   i= i-1;
	      Cards card = collectioncards.getCard(i);
	      MatchCards duplicate = new MatchCards(0,0);
	      duplicate = duplicate.convert(card);
	      if (duplicate.cardMatches(prev)) {
	        return collectioncards.popCard(i);
	    }
	      }
	    return null;
	  }

	  public MatchCards drawForMatch(GameSteps eights, MatchCards prev) {
	    while (true) {
	    	MatchCards card = eights.draw();
	      System.out.println(getName() + " draws " + card);
	      if (card.cardMatches(prev)) {
	        return card;
	      }
	      else
	      {	  
	    	  collectioncards.addCard(card);
	      return null;
	    }
	   }
	  }
	  
	  public void display() {
	    getHand().display();
	  }
	}