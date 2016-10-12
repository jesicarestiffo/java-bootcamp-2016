package exerciseTwo;

import exerciseTwo.Animal;
import exerciseTwo.Cat;
import exerciseTwo.Dog;
import exerciseTwo.SpeciesFactory;

public class Factory extends SpeciesFactory 
{

	public Animal getAnimal(String type) 
	{
		if ("canine".equals(type)) 
		{
			return new Dog();
		} else 
		{
			return new Cat();
		}
	}

}
