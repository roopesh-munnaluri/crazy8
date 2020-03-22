package hw7;

public class hw7 {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Tyrannosaur clarence = new Tyrannosaur();
		if (qa.testAnimalObject((Object) clarence)) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		
		Penguin opus = new Penguin();
		if (qa.testAnimalObject((Object)opus)) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		
		Cow mrsolearys = new Cow();
		if (qa.testAnimalObject(mrsolearys)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}		
		
	}

}
