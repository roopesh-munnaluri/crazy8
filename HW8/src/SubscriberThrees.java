
public class SubscriberThrees implements Observer {

	public boolean notifyobserver(Event E) {
		// TODO Auto-generated method stub
		Observer Threes = new SubscriberThrees();
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
			pub.removeObserver(Threes);
			three_count = 0;
		}	

		return false;
	}

}
