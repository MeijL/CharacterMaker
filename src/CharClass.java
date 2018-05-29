
import java.util.ArrayList;

public class CharClass {
	
	String name;
	int level;
	ArrayList<String> skills;
	
// Constructor to initialize the class
	
	public CharClass(String n) {
		name = n;
		level = 0;
		skills = new ArrayList<>();
	}
	
// Getters
	
	public String getName() {
		return name;
	}
	public int getLevel(){
		return level;
	}
	
	public ArrayList<String> getSkillList() {
		return skills;
	}
	
// Methods to add or remove skills
	
	public void addSkill(String thing) {
		thing.toLowerCase();
		skills.add(thing);
	}
	public void removeSkill(String thing){
		thing.toLowerCase();
		skills.remove(thing);
	}
	
// Method to get skills
	
	public String getSkill(String thing) {
		thing.toLowerCase();
		for (int i = 0; i <= skills.size(); i++) {
			if (thing.equals(skills.get(i))) {
				return skills.get(i);
			}
		}
		return null;
	}

}
