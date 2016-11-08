package exerciseTwo;

public class MammalFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if ("canine".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}