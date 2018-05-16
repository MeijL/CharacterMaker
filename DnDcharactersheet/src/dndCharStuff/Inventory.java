package dndCharStuff;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<String> items;
	
	public Inventory(){
		items = new ArrayList<>();
	}
	
	public void addItem(String thing){
		items.add(thing);
	}
	public void removeItem(String thing){
		items.remove(thing);
	}
	public String getItem(String thing) {
		for (int i = 0; i < items.size() - 1; i++) {
			if (thing.equals(items.get(i))) {
				return items.get(i);
			}
		}
		return "Item not found";
	}
}
