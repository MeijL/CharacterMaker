

public class Armor extends InvItem{
	
	private String type;
	private String armorClass;
	private int modifier;
	private int magicId;
	
	public Armor(String t, String a, int m, int id) {
		type = t;
		armorClass = a;
		modifier = m;
		magicId = id;
		
	}
	
	public String getType(){
		return type;
	}
	public String getArmClass(){
		return armorClass;
	}
	public int getModifier(){
		return modifier;
	}
	public int getMagic(){
		return magicId;
	}
}
