package model;

import processing.core.PApplet;

public class Pet implements Comparable<Pet> {
	
	private PApplet app;
	
	private int id;

	private String  name, breed, date;
	
	
	public Pet(PApplet app, int id, String name, String breed, String date) {
		
		this.app=app;
		
		this.id=id;
		this.name=name;
		this.breed=breed;
		this.date=date;
		
	}
	
	//skills pets
	public void drawInfo(int x, int y) {

		app.text("Id:" + id, x, y);
		app.text("Name:" + name, x, y + 20);
		app.text("Breed:" + breed, x, y + 40);
		app.text("Date:" + date, x, y + 60);

	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int compareTo(Pet nextPet) {
		return this.id-nextPet.getId();
	}
}

	
	