package model;

import java.util.Comparator;

public class PetDate implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getDate().compareTo(o2.getDate());
		
	}
	
}
