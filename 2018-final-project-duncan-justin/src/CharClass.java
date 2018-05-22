
import java.util.List;

public class CharClass {
	
	String name;
	int level;
	List<String> skills;
	
// Constructor to initialize the class
	
	public CharClass(String n) {
		name = n;
	}
	
// Method to add class
	
	public void addClass(String thing) {
		name += " " + thing;
		
	}
	
// Method to get class
	
	public String getCharClass() {
		return name;
	}
	
// Method to add skills
	
	public void addSkills(String thing) {
		skills.add(thing);
	}
	
// Method to get skills
	
	public String getSkill(String thing) {
		for (int i = 0; i < skills.size() - 1; i++) {
			if (thing.equals(skills.get(i))) {
				return skills.get(i);
			}
		}
		return "No such skill exists";
	}

}
