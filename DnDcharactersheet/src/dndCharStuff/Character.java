package dndCharStuff;

public class Character {
  
  	private String name;
	private int level;
	
	// Constructors for character
	
	public Character() {
		name = "Generic Hero";
		level = 0;
	}
	
	public Character(String n, int l) {
		name = n;
		level = l;
	}
	
  // increment for the level
  
	public void incrementLevel() {
		level++;
	}
  
  // getters
	
	public void getName() {
		return name;
	}
	
	public void getLevel() {
		return level;
	}

}
