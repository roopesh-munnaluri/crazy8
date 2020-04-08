import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {

	public static void main(String[] args) 
	{	
		List<BakedGoods> bakedgood= new ArrayList<BakedGoods>();
		Cookie cookie = new Cookie(1,  "cookie - oats and chocolate chips" , "01/01/2020");
		bakedgood.add(cookie);
		CinnamonRoll cinnamonroll = new CinnamonRoll(2, "cinnamonroll - corn and flour", "02/01/2020");
		bakedgood.add(cinnamonroll);
		Brownie brownie = new Brownie(3, "brownie - dark chocolate ", "03/01/2020");
		bakedgood.add(brownie);
		Cookie cookie2 = new Cookie(4, "cookie - oats and choco chips" , "04/01/2020");
		bakedgood.add(cookie2);
		CinnamonRoll cinnamonroll2 = new CinnamonRoll(5, "cinnamonroll - corn and flour", "05/01/2020");
		bakedgood.add(cinnamonroll2);
		Brownie brownie2 = new Brownie(6, "brownie - dark chocolate ", "06/01/2020");
		bakedgood.add(brownie2);
		Cookie cookie3 = new Cookie(7, "cookie - oats and chocolate chips" , "07/01/2020");
		bakedgood.add(cookie3);
		CinnamonRoll cinnamonroll3 = new CinnamonRoll(8, "cinnamonroll - corn and flour", "08/01/2020");
		bakedgood.add(cinnamonroll3);
		Brownie brownie3 = new Brownie(9, "brownie - contains dark choclate ", "09/01/2020");
		bakedgood.add(brownie3);
		for(BakedGoods goods :bakedgood)
		{
			System.out.println("Price: " + goods.getPrice());
			System.out.println("Description:  " + goods.getDescription());
			System.out.println("SellByDate:  " + goods.getSellByDate());			
		}
	}
}