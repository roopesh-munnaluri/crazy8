package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			if (c.aboutMe().equals(ex.expectedName())) {
				if (c.diet().equals(ex.expectedFood())) {
					if (c.produces().equals(ex.expectedInfo())) {
						return true;
					}
				}
			}
		} else if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.getName().contentEquals("Tyrannosaurus Rex")) {
				if (t.roar().equals("Roarrr!")) {
					if (t.myFood().equals("other dinosaurs")) {
						return true;
					}
				}
			}
		} else if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.flightless().equals("Penguin")) {
				if (p.IEat().equals("mostly fish")) {
					if (p.movement().equalsIgnoreCase("waddle and swim")) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
