package model;

import java.util.Comparator;

public class PetName implements Comparator<Pet> {
	
	@Override
	public int compare(Pet o1, Pet o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
