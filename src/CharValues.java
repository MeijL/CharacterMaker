

public class CharValues {

//Classic DnD stats
	
	private int strength;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int dexterity;
	
	
	public CharValues(){
		strength = 1;
		constitution = 1;
		intelligence = 1;
		wisdom = 1;
		charisma = 1;
		dexterity = 1;
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
