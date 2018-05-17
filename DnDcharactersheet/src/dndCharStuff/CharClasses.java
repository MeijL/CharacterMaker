package DnDcharactersheet;

import java.util.List;

public class CharClasses {
	
	List<String> classes;
	List<String> skills;
	
	// Constructor to initialize the list that will contain names of all classes
	
	public CharClasses() {
		classes = new ArrayList<String>();
	}
	
	// Method to add class
	
	public void addClass(String thing) {
		classes.add(thing);
	}
	
	// Method to get class
	
	public void getClass(String thing) {
		for (int i = 0; i < classes.size() - 1; i++) {
			if (thing.equals(classes.get(i))) {
				return classes.get(i);
			}
		}
		return "No class found.";
	}
	
	public void addSkills(String thing) {
		skills.add(thing);
	}

}
