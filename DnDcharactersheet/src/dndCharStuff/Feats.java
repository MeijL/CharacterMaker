
public class Feats {
	
	private String name;
	private int modifier;
	
	public Feats(String n, int m) {
		name = n;
		modifier = m;
	}
	
	public String getName() {
		return name;
	}
	
	public int getModifier() {
		return "+" + modifier;
	}

}
