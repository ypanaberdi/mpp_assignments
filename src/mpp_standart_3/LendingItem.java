package mpp_standart_3;

public class LendingItem {
	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}

	private int numCopiesInLib;

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null)
			return false;
		
		// simple class check
		if((this.getClass()!=(obj.getClass())))
			return false;
		
		// true copies should have same amount of copies in it;
		if(getNumCopiesInLib()!=((LendingItem)obj).getNumCopiesInLib())
				return false;
		
		return true;
	}
}
