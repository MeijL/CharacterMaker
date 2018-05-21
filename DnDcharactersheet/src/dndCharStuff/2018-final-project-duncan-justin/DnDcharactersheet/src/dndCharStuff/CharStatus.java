package dndCharStuff;

import java.util.ArrayList;

public class CharStatus {
	
	private int hitpoints;
	private int nonLethal;
	private boolean conscious;
	private ArrayList<Integer> effectIdList;
	
	public CharStatus(int h){
		hitpoints = h;
		nonLethal = 0;
		conscious = true;
		effectIdList = new ArrayList<>();
	}
	
//getters
	
	public int getHealth(){
		return hitpoints;
	}
	public int getNonlethal(){
		return nonLethal;
	}
	public boolean getConscious(){
		return conscious;
	}
	public boolean effectActive(int e){
		for(int id: effectIdList){
			if(id == e){
				return true;
			}
		}
		return false;
	}
	
//setters
	
	public void changeHitPoints(int h){
		hitpoints -= h;
	}
	public void changeNonlethal(int n){
		nonlethal += n;
		if (nonlethal = hitpoints) {
			setActive(false);
		}
	}
	public void setActive(boolean a){
		active = a;
	}
	public void startEffect(int id){
		effectIdList.add(id);
	}
	public void endEffect(int id){
		effectIdList.remove(id);
	}
}
