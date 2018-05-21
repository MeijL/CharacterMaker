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
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public CharRace getRace() {
		return race;
	}
	
	public CharStatus getStatus() {
		return status;
	}
	
	public CharValues getValues() {
		return values;
	}
	
	public Inventory getInv() {
		return inv;
	}
}
