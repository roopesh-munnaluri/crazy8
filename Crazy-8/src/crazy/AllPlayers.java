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
		  
		  Cards card = null;
		  System.out.println(getName() + " Enter index of the card to discard");
		  System.out.println("PRESS 0(zero) To pic a card");
		  int i = in.nextInt();
		  while(card == null) {
		  if(i == 0 )
		  { return null;}
		  else
		  {
		   i= i-1;
		   card = collectioncards.getCard(i);
	      
		  }
		  }
	      MatchCards duplicate = new MatchCards(0,0);
	      duplicate = duplicate.convert(card);
	      if (duplicate.cardMatches(prev)) {
	        return collectioncards.popCard(i);
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
	  
	  public int score() {
		    int sum = 0;
		    for (int i = 0; i < collectioncards.size(); i++) {
		      Cards card = collectioncards.getCard(i);
		      int rank = card.getRank();
		      if (rank == 8) {
		        sum += 0;
		      } else if (rank > 10) {
		        sum += 10;
		      } else {
		        sum += rank;
		      }
		    }
		    return sum;
		  }

		  
		  public void displayScore() {
		    System.out.println(getName() + " has " + score() + " points");
		  }
	  
	  public void display() {
	    getHand().display();
	  }
	}