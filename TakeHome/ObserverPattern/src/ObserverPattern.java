import java.util.ArrayList;

class Worker {
	long workerId;
	
	public Worker(long workerId) 
	{
		this.workerId = workerId;
	}
	public long getWorkerID()
	{ 
		return workerId; 
	}
	public String  notify(WorkItem event) 
	{
		if(event.getItemID().equals(Long.toString(workerId))) 
		{
			String s = ("Worker:" + workerId + " processed WorkItem" + event.getItemID() + " message " + event.getmessage());
			int id = Integer.parseInt(event.itemId) + 1;
			event.setItemID(Integer.toString(id));
			System.out.println(s);
			return s;
		}
		else 
			return null;
	}
}

class WorkItem 
{
	String itemId;
	String message;
	long workerId;
	
	public WorkItem(String id,String msg) 
	{
		this.itemId = id;
		this.message = msg;		
	}
	public void setItemID(String itemID) 
	{ 
		this.itemId = itemID;
	}
	public String getItemID() 
	{
		return(itemId); 
	}
	public String getmessage() 
	{
		return(message);
	}
	public long getworkerId() 
	{
		return(workerId);
	}
}

class WorkManager 
{
	ArrayList<Worker> subscribers = new ArrayList<Worker>(4);
	
	public void subscribe(Worker worker) 
	{
		subscribers.add(worker);
	}
	public void unsubscribe(Worker worker) 
	{
		subscribers.remove(worker);
	}
	
	public void notify(WorkItem event) 
	{
		for(Worker worker: subscribers) 
		{
			if(worker.getWorkerID()<=4) 
			{
				String  result = worker.notify(event);
				if(result != null)
				{
					System.out.println(worker.getWorkerID() + ": Completed work on item " + event.getItemID());
				}
			}
		}
		
	}

}

public class ObserverPattern 
{
	
	public static void main(String[] args) 
	{
		WorkManager publisher = new WorkManager();
		Worker worker_1 = new Worker(1);
		Worker worker_2 = new Worker(2);
		Worker worker_3 = new Worker(3);
		Worker worker_4 = new Worker(4);
		
		publisher.subscribe(worker_1);
		publisher.subscribe(worker_2);
		publisher.subscribe(worker_3);
		publisher.subscribe(worker_4);
		
		WorkItem workitem_1 = new WorkItem("1","sleep");
		publisher.notify(workitem_1);
		WorkItem workitem_2 = new WorkItem("3","work");
		publisher.notify(workitem_2);
		WorkItem workitem_3 = new WorkItem("5","coding");
		publisher.notify(workitem_3);
	}
}