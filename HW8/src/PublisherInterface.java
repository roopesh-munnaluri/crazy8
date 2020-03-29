
public interface PublisherInterface 
{
	public String registerObserver(ObserverInterface O);
	public String removeObserver(ObserverInterface O);
	public String notifyObservers(ObserverInterface O);
	
}
