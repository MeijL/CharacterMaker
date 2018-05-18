package dndCharStuff;

public class Character {
  
  	private String name;
	private int level;
	private int exp;
	
	// Constructors for character
	
	public Character() {
		name = "Generic Hero";
		level = 0;
		exp = 0;
	}
	
	public Character(String n, int l) {
		name = n;
		level = l;
		exp = 0;
	}
	
  // increment for the level
  
	public void incrementLevel() {
		level++;
	}
	
  // ability to add a certain amount of exp to exp
	
	public void increaseEXP(int value) {
		exp += value;
	}
	
   // reset the exp when a level up has occurred
	
	public void setToZero() {
		exp = 0;
	}
	
  
  // getters
	
	public void getName() {
		return name;
	}
	
	public void getLevel() {
		return level;
	}
	
	public void getEXP() {
		return exp;
	}

}
