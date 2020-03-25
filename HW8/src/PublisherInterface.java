
public interface PublisherInterface 
{
	public void registerObserver(Observer O);
	public void removeObserver(Observer O);
	public void notifyObservers(Observer O);
	
}
