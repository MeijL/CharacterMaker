

public class Character {
  
  	private String name;
  	private int level;
	private CharRace race;
	private CharStatus status;
	private CharValues values;
	private Inventory inv;
	
	private CharClass class1;
	private CharClass class2;
	private CharClass class3;
	private CharClass class4;
	
	// Constructors for character
	
	public Character() {
		name = "Generic_Hero";
		level = 0;
	}
	
	public Character(String n, int l) {
		name = n;
		level = l;
	}
	
  // increment for the level
  
	public void levelUp() {
		level++;
	}
  
  // getters
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public CharRace getRace() {
		return race;
	}
	public CharStatus getStatus() {
		return status;
	}
	public CharValues getValues() {
		return values;
	}
	public Inventory getInv() {
		return inv;
	}
	public CharClass getClass1(){
		return class1;
	}
	public CharClass getClass2(){
		return class2;
	}
	public CharClass getClass3(){
		return class3;
	}
	public CharClass getClass4(){
		return class4;
	}
	
	// Setters
	
	public void setName(String n){
		name = n;
	}
	public void setLevel(int l){
		level = l;
	}
	public void setRace(CharRace r){
		race = r;
	}
	
	//Class setting
	
	public void setClass1(CharClass c){
		class1 = c;
	}
	public void setClass2(CharClass c){
		class2 = c;
	}
	public void setClass3(CharClass c){
		class3 = c;
	}
	public void setClass4(CharClass c){
		class4 = c;
	}
}
