
public class SubscriberThrees implements ObserverInterface {

	public boolean notifyObserver(Event E) {
		// TODO Auto-generated method stub
		ObserverInterface Threes = new SubscriberThrees();
		PublisherImplementation pub =new PublisherImplementation();
		int three_count=0;
		int eventdata = E.getEventData();
		if(eventdata%3 == 0)
		{
			System.out.printf("Event Number - %d Event Data - %d \n",E.getEventNumber(),  eventdata);
			System.out.println("This Event is assigned to Subscriber Threes \n");
			three_count= three_count + 1;
			return true;	
		}
		
		if(three_count>=12)
		{
			pub.unregisterMe(Threes);
			three_count = 0;
		}	

		return false;
	}

	public boolean unregisterMe(PublisherImplementation P) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean test(boolean tree) {
		// TODO Auto-generated method stub
		return false;
	}

}
