

public class Tool extends InvItem {
	
	private int uses;
	
	public Tool(String n, int u) {
		super(n);
		uses = u;
	}
	
	// decrease the number of uses
	public void dropUses() {
		uses--;
	}
	
	// getter
	
	public int getUses() {
		return uses;
	}
	
	// reset the uses
	public void setUses(int u) {
		uses = u;
	}
}
