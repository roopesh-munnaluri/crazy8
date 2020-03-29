import java.util.ArrayList;
import java.util.List;

public class PublisherImplementation implements PublisherInterface{
	public PublisherImplementation()
	{}
	
	private List<ObserverInterface> subscribers = new ArrayList<ObserverInterface>();

	public String registerObserver(ObserverInterface O) {
		// TODO Auto-generated method stub
		 subscribers.add(O);
		 System.out.println("The observer is added");		
		 return "The observer is added";
	}
	
	
	public String notifyObservers(ObserverInterface O) {
		
		return "Observer is notified";
	}


	public String removeObserver(ObserverInterface O) {
		// TODO Auto-generated method stub
		return "Observer Removed";
	}


	
	private Event generateevent(int i)
	{   
	    int data = (int)(Math.random() * 5000 + 1);	
		Event e = new Event(i, data);
		return e;
	}
		
	public void runsimulation()
	{
		PublisherImplementation pub =new PublisherImplementation();
		ObserverInterface Odds= new SubscriberOdds();
		SubscriberEvens Evens = new SubscriberEvens();
		SubscriberThrees Threes = new SubscriberThrees();
		
		pub.registerObserver(Odds);
		pub.registerObserver(Evens);
		pub.registerObserver(Threes);		
		for(int i=1;i<201;i++)
		{
			Event event_random = pub.generateevent(i);
			if(pub.subscribers.contains(Odds))
			{	
			 Odds.notifyObserver(event_random);
			}
			
			if(pub.subscribers.contains(Threes))
			{	
			 Threes.notifyObserver(event_random);
			} 
			if(pub.subscribers.contains(Evens))
			{	
			 Evens.notifyObserver(event_random);
			} 
	
			if(i==40 || i==80 || i==120 || i==160 || i==200)
			 {
					if(!pub.subscribers.contains(Odds))
					{
						pub.registerObserver(Odds);
			        }			
					if(!pub.subscribers.contains(Threes))
					{
						pub.registerObserver(Threes);
					}
			    }
		}		
	}

	public void unregisterMe(ObserverInterface O) {
		// TODO Auto-generated method stub
		subscribers.remove(O);
		System.out.println("Observer removed");
		
	}
}
