import java.util.List;

public class Weapons {
	
	private String name;
	private int modifier;
	private String weaponType;
	private String weaponDescription;
	List<String> weaponList = new ArrayList<String>();
	
	public Weapons() {
		name = "generic weapon";
		modifier = 0;
		weaponType = "generic type";
		weaponDescription = "does nothing, deal with it";
	}
	
	public Weapons(String n, int m, String w, String d) {
		name = n;
		modifier = m;
		weaponType = w;
		weaponDescription = d;
		addWeapons(n, m, w);
		
	}
	
	public void addWeapons(String n, int m, String w) {
		String weapon = "name: " + n + ", modifier: " + m + ", weapon type: " + w;
		weaponList.add(weapon);
	}

}
