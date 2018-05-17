import java.util.List;

public class Armor extends Inventory{
	
	private String name;
	private int modifier;
	private String armorType;
	private String armorDescription;
	List<String> armor = new ArrayList<String>();
	
	public Armor() {
		name = "generic name";
		modifier = 0;
		armorType = "generic type";
		armorDescription = "none";
	}
	
	public Armor(String n, int m, String a, String d) {
		name = n;
		modifier = m;
		armorType = a;
		armorDescription = d;
	}
	
	public void addArmor(String n, int m, String a) {
		String armorPiece = "Name: " + n + ", Modifier: " + m + ", Armor Type: " + a;
		armor.add(armorPiece);
	}
	
	public void getName() {
		return name;
	}
	
	public void getArmorType() {
		return armorType;
	}

	public void getArmorDescription() {
		return armorDescription;
	}
}
