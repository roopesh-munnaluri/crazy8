package hw7;

public class PenguinTester extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
		if (animal instanceof Penguin) 
		{
			Penguin p = (Penguin) animal;
			if (p.aboutMe().equals("penguin")) 
			{
				if (p.foodIEat().equals("mostly fish")) 
				{
					if (p.movement().equalsIgnoreCase("waddle and swim"))
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
