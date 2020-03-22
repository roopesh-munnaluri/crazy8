package hw7;

public class CowTester extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
		if (animal instanceof Cow)
		{
			Cow c = (Cow) animal;
			if (c.aboutMe().equals("Cow")) 
			{
				if (c.foodIEat().equals("grass, hay, and corn")) 
				{
					if (c.produces().equals("milk and cheese")) 
					{
						return true;
					}
				}
			}	
		}
		return false;
	}
}
	
