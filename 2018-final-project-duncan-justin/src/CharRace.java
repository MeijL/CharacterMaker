
public class CharRace {
	
	private String name;
	
	private int strMod;
	private int conMod;
	private int intMod;
	private int wisMod;
	private int chaMod;
	private int dexMod;
	
	public CharRace(String n){
		name = n;
		strMod = 0;
		conMod = 0;
		intMod = 0;
		wisMod = 0;
		chaMod = 0;
		dexMod = 0;
	}
	
//getters
	
	public String getName(){
		return name;
	}
	public int getStrMod(){
		return strMod;
	}
	public int getConMod(){
		return conMod;
	}
	public int getIntMod(){
		return intMod;
	}
	public int getWisMod(){
		return wisMod;
	}
	public int getChaMod(){
		return chaMod;
	}
	public int getDexMod(){
		return dexMod;
	}
	
//setters
	
	public void setStrMod(int i){
		strMod = i;
	}
	public void setConMod(int i){
		conMod = i;
	}
	public void setIntMod(int i){
		intMod = i;
	}
	public void setWisMod(int i){
		wisMod = i;
	}
	public void setChaMod(int i){
		chaMod = i;
	}
	public void setDexMod(int i){
		dexMod = i;
	}
}
