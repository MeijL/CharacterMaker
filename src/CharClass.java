
import java.util.List;

public class CharClass {
	
	String name;
	int level;
	List<String> skills;
	
// Constructor to initialize the class
	
	public CharClass(String n) {
		name = n;
		level = 0;
	}
	
// Getters
	
	public String getName() {
		return name;
	}
	public int getLevel(){
		return level;
	}
	
	public void levelUp() {
		level++;
	}
	
// Methods to add or remove skills
	
	public void addSkill(String thing) {
		skills.add(thing);
	}
	public void removeSkill(String thing){
		skills.remove(thing);
	}
	
// Method to get skills
	
	public String getSkill(String thing) {
		for (int i = 0; i <= skills.size(); i++) {
			if (thing.equals(skills.get(i))) {
				return skills.get(i);
			}
		}
		return null;
	}

}
