package hw7;

public class TyrannosaurTester extends AnimalClassTester
{
	@Override
	public boolean testAnimalObject(Object animal) 
	{
	if (animal instanceof Tyrannosaur) 
	{
		Tyrannosaur t = (Tyrannosaur) animal;
		if (t.aboutMe().contentEquals("Tyranosaurus Rex")) 
		{
			if (t.roar().equals("Roarrrr!")) 
			{
				if (t.foodIEat().equals("other dinosaurs")) 
				{
					return true;
				}
			}
		}
	}
	return false;
	}
}
