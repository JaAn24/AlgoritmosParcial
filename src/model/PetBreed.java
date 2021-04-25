package model;

import java.util.Comparator;

public class PetBreed implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		// TODO Auto-generated method stub
		return o1.getBreed().compareTo(o2.getBreed());
	}
	
}
