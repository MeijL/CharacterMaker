
public class InvItem {
	
	private String name;
	private int value;
	
	public InvItem(String n) {
		name = n;
		value = 0;
	}
	
//Getter
	
	public String getName(){
		return name;
	}
	public int getValue(){
		return value;
	}
	
//Setter
	
	public void setName(String n){
		name = n;
	}
	public void setValue(int i){
		value = i;
	}
	
}
