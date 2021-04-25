package model;

import java.util.Comparator;

public class PetBreed implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getBreed().compareTo(o2.getBreed());
	}
	
}
