public class SubscriberOdds implements Observer {
	int odd_count = 0;
	
	public boolean notifyobserver(Event E) {
		// TODO Auto-generated method stub
		PublisherImplementation pub =new PublisherImplementation();
		Observer Odds= new SubscriberOdds();
		int eventdata = E.getEventData();
		if(eventdata%2 == 1)
		{
			System.out.printf("Event Number - %d Event Data - %d \n",E.getEventNumber(),  eventdata);
			System.out.println("This Event is assigned to Subscriber Odds \n");
			odd_count = odd_count + 1;
			System.out.println(odd_count);
			if(odd_count > 15)
			{
				pub.removeObserver(Odds);
				odd_count = 0;
			}
		}
		return false;
	}

}
