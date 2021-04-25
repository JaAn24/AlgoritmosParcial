package controller;

import java.util.LinkedList;
import model.Logic;
import model.Pet;
import processing.core.PApplet;

public class Controller {
	
	private PApplet app;
	
	private Logic logic;
	
	public Controller(PApplet app) {
		
		this.app = app;
		
		logic = new Logic(app);
		
		logic.createtext(app);
		
	}

	public void sortList(char key) {
		
		logic.sortList(key);
	}

	public LinkedList <Pet> pet(){
		
		return logic.getPet();
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	
	

}