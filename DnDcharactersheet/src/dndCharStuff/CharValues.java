
package dndCharStuff;

public class CharValues {

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

//setters
	
	public void setStr(int i){
		strength = i;
	}
	public void setCon(int i){
		constitution = i;
	}
	public void setInt(int i){
		intelligence = i;
	}
	public void setWis(int i){
		wisdom = i;
	}
	public void setCha(int i){
		charisma = i;
	}
	public void setDex(int i){
		dexterity = i;
	}
}
