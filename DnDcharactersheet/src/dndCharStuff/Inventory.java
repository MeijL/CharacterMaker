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
}
