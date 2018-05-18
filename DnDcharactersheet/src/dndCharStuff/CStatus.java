package dndCharStuff;

import java.util.ArrayList;

public class CStatus {
	
	private int hitpoints;
	private int nonlethal;
	private boolean active;
	private ArrayList<Integer> effectIdList;
	
	public CStatus(int h){
		hitpoints = h;
		nonlethal = 0;
		active = true;
		effectIdList = new ArrayList<>();
	}
	
//getters
	
	public int getHealth(){
		return hitpoints;
	}
	public int getNonlethal(){
		return nonlethal;
	}
	public boolean getActive(){
		return active;
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
		if (hitpoints <= 0) {
			setActive(false);
		}
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
