public class SubscriberOdds implements ObserverInterface {
	int odd_count = 0;
	
	public boolean notifyObserver(Event E) {
		// TODO Auto-generated method stub
		PublisherImplementation pub =new PublisherImplementation();
		ObserverInterface Odds= new SubscriberOdds();
		int eventdata = E.getEventData();
		if(eventdata%2 == 1)
		{
			System.out.printf("Event Number - %d Event Data - %d \n",E.getEventNumber(),  eventdata);
			System.out.println("This Event is assigned to Subscriber Odds \n");
			odd_count = odd_count + 1;
			System.out.println(odd_count);
			if(odd_count > 15)
			{
				pub.unregisterMe(Odds);
				odd_count = 0;
			}
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
