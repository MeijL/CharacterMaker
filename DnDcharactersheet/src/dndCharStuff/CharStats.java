package dndCharStuff;

public class CharStats {

//Classic DnD stats
	
	private int strength;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int dexterity;
	
	
	public CharStats(int s, int c, int i, int w, int ch, int d){
		strength = s;
		constitution = c;
		intelligence = i;
		wisdom = w;
		charisma = ch;
		dexterity = d;
	}
	
//getters
	
	public int getStr(){
		return strength;
	}
	public int getCon(){
		return constitution;
	}
	public int getInt(){
		return intelligence;
	}
	public int getWis(){
		return wisdom;
	}
	public int getCha(){
		return charisma;
	}
	public int getDex(){
		return dexterity;
	}

//levelers
	
	public void lvlStr(){
		strength++;
	}
	public void lvlCon(){
		constitution++;
	}
	public void lvlInt(){
		intelligence++;
	}
	public void lvlWis(){
		wisdom++;
	}
	public void lvlCha(){
		charisma++;
	}
	public void lvlDex(){
		dexterity++;
	}
}
