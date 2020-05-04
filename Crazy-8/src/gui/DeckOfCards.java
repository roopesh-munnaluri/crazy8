package gui;

public class DeckOfCards extends CollectionOfCards {
	
	 public DeckOfCards(String label) {
		    super(label);
		    
		    for (int suit = 0; suit <= 3; suit++) 
		    {
		      for (int rank = 1; rank <= 12; rank++) 
		      {
		          Cards card = new Cards(rank, suit);
		    	  addCard(card);
		      }
		    }
	
	
	
	 }
} 
