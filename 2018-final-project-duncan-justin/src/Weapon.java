
public class Weapon extends InvItem{

	private String type;
	private String weaponClass;	
	private int modifier;
	private int magicId;

	public Weapon(String t, String w, int m, int id) {
		type = t;
		weaponClass = w;
		modifier = m;
		magicId = id;
	}
	
	public String getType(){
		return type;
	}
	public String getWepClass(){
		return weaponClass;
	}
	public int getModifier(){
		return modifier;
	}
	public int getMagic(){
		return magicId;
	}

}
