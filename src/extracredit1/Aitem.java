package extracredit1;

import java.util.ArrayList;

public class Aitem implements Iitem {
	public Aitem(int limit) {
		super();
		this.limit = limit;
	}

	private String title; 
	private int limit; 
	ArrayList<IitemCopy> itemCopies = new ArrayList<IitemCopy>();
	@Override
	public boolean checkAvailability() {
		if(itemCopies.stream().map(x->(ItemCopy)x).filter(c->c.isAvailable()).count()>0)
			return true;
		
		return false;
	}
	
	public void addItemCopy(IitemCopy ic) {
		 itemCopies.add(ic);
	}
	
	public ItemCopy getItemCopy() {
		return itemCopies.stream().map(x->(ItemCopy)x).filter(c->c.isAvailable()).findFirst().get();
 	}

	public int getLimit() {
		return limit;
	}
}
