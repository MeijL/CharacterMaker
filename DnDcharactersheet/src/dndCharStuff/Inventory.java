package dndCharStuff;

import java.util.List;

public class Inventory {
	
	private List<String> items;
	
	public Inventory(){
		items = new List<>();
	}
	
	public void addItem(InvItem thing){
		items.add(thing);
	}
	public void removeItem(InvItem thing){
		items.remove(thing);
	}
	public boolean hasItem(InvItem thing) {
		for (int i = 0; i < items.size() - 1; i++) {
			if (thing.equals(items.get(i))) {
				return true
			}
		}
		return false;
	}
}
