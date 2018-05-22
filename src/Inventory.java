
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private List<InvItem> items;
	
	public Inventory(){
		items = new ArrayList<InvItem>();
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
				return true;
			}
		}
		return false;
	}
}
