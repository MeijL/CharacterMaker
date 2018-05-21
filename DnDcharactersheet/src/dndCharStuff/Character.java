package dndCharStuff;

public class Character {
  
  	private String name;
  	private int level;
	private CharRace race;
	private CharStatus status;
	private CharValues values;
	private Inventory inv;
	
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
	
	public void getRace() {
		return race;
	}
	
	public void getStatus() {
		return status;
	}
	
	public void getValues() {
		return values;
	}
	
	public void getInv() {
		return inv;
	}

}
