package DnDcharactersheet;

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
	
	public void getClass() {
		return name;
	}
	
	
	public void addSkills(String thing) {
		skills.add(thing);
	}

}
