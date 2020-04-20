package crazy;

public class Player {

		  private String name;
		  private CollectionOfCards hand;

		  public Player(String name) {
		    this.name = name;
		    this.hand = new CollectionOfCards(name);
		  }

		  
		  public String getName() {
		    return name;
		  }

		  
		  public CollectionOfCards getHand() {
		    return hand;
		  }


		 
		  public void display() {
		    hand.display();
		  }

}
