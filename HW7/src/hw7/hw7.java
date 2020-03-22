package hw7;
public class hw7 {
	public static void main(String[] args) {
		Cow mrsolearys = new Cow();
		Tyrannosaur clarence = new Tyrannosaur();
		Penguin opus = new Penguin();
		Octopus octo = new Octopus();
		CowTester ct = new CowTester();
		OctopusTester ot = new OctopusTester();
		PenguinTester pt = new PenguinTester();
		TyrannosaurTester tt = new TyrannosaurTester();
		if (ct.testAnimalObject(mrsolearys))
		{
			System.out.println("Cow class passes");
		} 
		else 
		{
			System.out.println(">>>>Cow class Failed!<<<<");
		}
		if (tt.testAnimalObject((clarence))) 
		{ 
			System.out.println("Tyrranosaur class passes"); 
		}
		else 
		{
			System.out.println(">>>>Tyrranosaur class Failed!<<<<"); 
		}
		if (pt.testAnimalObject((opus))) 
		{ 
			System.out.println("Penguin class passes"); 
		}
		else 
		{
			System.out.println(">>>>Penguin class Failed!<<<<"); 
		}
		if (ot.testAnimalObject((octo))) 
		{ 
			System.out.println("Octopus class passes"); 
		}
		else 
		{
			System.out.println(">>>>Octopus class Failed!<<<<"); 
		}
	}
}
