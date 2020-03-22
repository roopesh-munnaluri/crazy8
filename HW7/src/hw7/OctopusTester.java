package hw7;

public class OctopusTester extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
		if (animal instanceof Octopus) 
		{
			Octopus o = (Octopus) animal;
			if (o.aboutMe().equals("octopus")) 
			{
				if (o.foodIEat().equals("mollusks, fish, snails")) 
				{
					return true;
				}
			}
		}
		return false;
	}
}
