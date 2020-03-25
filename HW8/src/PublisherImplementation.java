import java.util.ArrayList;
import java.util.List;

public class PublisherImplementation implements PublisherInterface{
	public PublisherImplementation()
	{}
	
	private List<Observer> subscribers = new ArrayList<Observer>();

	public void registerObserver(Observer O) {
		// TODO Auto-generated method stub
		 subscribers.add(O);
		 System.out.println("The observer is added");
		
		
	}
	
	public void notifyObservers(Observer O) {
		// TODO Auto-generated method stub
		
	}


	public void removeObserver(Observer O) {
		// TODO Auto-generated method stub
		
		subscribers.remove(O);
		System.out.println("Observer removed");
		
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
		Observer Odds= new SubscriberOdds();
		Observer Evens = new SubscriberEvens();
		Observer Threes = new SubscriberThrees();
		
		pub.registerObserver(Odds);
		pub.registerObserver(Evens);
		pub.registerObserver(Threes);		
		for(int i=1;i<201;i++)
		{
			Event event_random = pub.generateevent(i);
			if(pub.subscribers.contains(Odds))
			{	
			 Odds.notifyobserver(event_random);
			}
			
			if(pub.subscribers.contains(Threes))
			{	
			 Threes.notifyobserver(event_random);
			} 
			if(pub.subscribers.contains(Evens))
			{	
			 Evens.notifyobserver(event_random);
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
}
