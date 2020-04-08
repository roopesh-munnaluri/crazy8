public class Brownie implements BakedGoods 
{
	private int price;
	private String Description;
	private String sellByDate;
	
	public Brownie(int price, String Description, String sellByDate)
	{
		this.price = price;
		this.Description = Description;
		this.sellByDate = sellByDate;	
		
	}

	public int getPrice() 
	{
		return price;
	}
	public String getDescription() 
	{
		return Description;
	}
	public String getSellByDate() 
	{
		return sellByDate;
	}
}