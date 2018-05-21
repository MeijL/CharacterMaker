package dndCharStuff;

public class Character {
	
	private CharStats stats;
	private CStatus status;
	private Inventory inv;
	
	public Character(CharStats c, int h){
		stats = c;
		status = new CStatus(h);
		inv = new Inventory();
	}
}
