package crazy;
import java.util.ArrayList;
import java.util.Random;

public class CollectionOfCards {

  private String label;
  private ArrayList<Cards> cards;

 
  public CollectionOfCards(String label) {
    this.label = label;
    this.cards = new ArrayList<Cards>();
  }

  public String getLabel() {
    return label;
  }

 
  public Cards getCard(int i) {
    return cards.get(i);
  }

  public void addCard(Cards card) {
    cards.add(card);
  }

  public Cards popCard(int i) {
    return cards.remove(i);
  }


  public Cards popCard() {
    int i = size() - 1;
    return popCard(i);
  }

  
  public int size() {
    return cards.size();
  }

  // return true if cards is empty 
  
  public boolean empty() {
    return cards.size() == 0;
  }

  // create duplicate collection
  public void deal(CollectionOfCards c, int n) {
    for (int i = 0; i < n; i++) {
      Cards card = popCard();
      c.addCard(card);
    }
  }

  public void dealAll(CollectionOfCards that) {
    int n = size();
    deal(that, n);
  }



  public Cards last() {
    int i = size() - 1;
    return cards.get(i);
  }

  public void swap(int i, int j) {
    Cards temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
  }
   
  public void shuffle() {
    Random random = new Random();
    for (int i = size() - 1; i > 0; i--) {
      int j = random.nextInt(i);
      swap(i, j);
    }
  }

  
  public String toString() {
    return label + ": " + cards.toString();
  }
  
  public void display() {
    System.out.println(label + ": ");
    for (Cards card: cards) {
      System.out.println(card);
    }
    System.out.println();
  }

}