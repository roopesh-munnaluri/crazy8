package crazy;
import java.util.ArrayList;
import java.util.Scanner;

public class GameSteps {

  public CollectionOfCards drawPile;
  public CollectionOfCards discardPile;
  public Scanner in;
  public ArrayList<AllPlayers> players;

  public GameSteps() {
	DeckOfCards deck = new DeckOfCards("Deck");
    deck.shuffle();
    this.players = new ArrayList<AllPlayers>();
    discardPile = new CollectionOfCards("Discards");
    deck.deal(discardPile, 1);
    drawPile = new CollectionOfCards("Draw pile");
    deck.dealAll(drawPile);
    in = new Scanner(System.in);
  }
   
  public void createPlayer(AllPlayers player) {
    players.add(player);
  }

  public String playerName() {
    System.out.println("Enter player name: ");
    String name = in.next();
    while (name == "") {
      name = in.nextLine();
    }
    return name;
  }

  public void twoPlayers() {
	  AllPlayers player = new AllPlayers(playerName());
    createPlayer(player);
    drawPile.deal(player.getHand(), 7);
  }
  
  public void morePlayers() {
	  AllPlayers player = new AllPlayers(playerName());
    createPlayer(player);
    drawPile.deal(player.getHand(), 5);
  }

  public AllPlayers getPlayer(int i) {
    return players.get(i);
  }

  public int getPlayerIndex(AllPlayers player) {
    return players.indexOf(player);
  }

  public boolean isDone() {
    for (int x = 0; x < players.size(); x++) {
      if (getPlayer(x).getHand().empty()) {
        return true;
      }
    }
    return false;
  }
  public void reshuffle() {

    Cards con = discardPile.popCard();
    MatchCards prev = new MatchCards(0, 0);
    prev = prev.convert(con);
    discardPile.dealAll(drawPile);
    discardPile.addCard(prev);
    drawPile.shuffle();
  }

  public MatchCards draw() {
    if (drawPile.empty()) {
      reshuffle();
    }
    Cards convert = drawPile.popCard();
    MatchCards prev = new MatchCards(0, 0);
    return prev.convert(convert);
  }
  
  public AllPlayers nextPlayer(AllPlayers current) {
    if (getPlayerIndex(current) < players.size() - 1) {
      return getPlayer(getPlayerIndex(current) + 1);
    }
    if (getPlayerIndex(current) == players.size() - 1) {
      return getPlayer(getPlayerIndex(current) + 1 - players.size());
    }
    return null;
  }
  
  public void displayState() {
    for (int x = 0; x < players.size(); x++) {
      getPlayer(x).display();
    }
    discardPile.display();
    System.out.print("Draw pile: ");
    System.out.println(drawPile.size() + " cards");
  }
  
  public void waitForUser() {
    in.nextLine();
  }

  public void takeTurn(AllPlayers player) {
    Cards convert = discardPile.last();
    MatchCards prev = new MatchCards(0, 0);
    prev = prev.convert(convert);    
    MatchCards next = player.play(this, prev);
    if(next != null)
    {
    discardPile.addCard(next);
    }
    System.out.println(player.getName() + " plays " + next);
    System.out.println();
  }  
}