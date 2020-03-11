package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			expectedAnimal(c, ex);
		} else if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			ExpectedTyrannosaur ex = new ExpectedTyrannosaur();
			expectedAnimal(c, ex);
		} else if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			ExpectedPenguin ex = new ExpectedPenguin();
			expectedAnimal(c, ex);
		}
		return false;
	}
	public String expectedAnimal(Object real, Object test) {
		String result = "Failed test";
		if (real.name().equals(test.expectedName())) {
			if (real.food().equals(test.expectedFood())) {
				if (real.info().equalsIgnoreCase(test.expectedInfo())) {
					result = "Passed test";
				}
			}
		}
		return result;
	}

}
