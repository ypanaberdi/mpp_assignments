package extracredit1;

public class ItemCopy implements IitemCopy {
	private String copyId;
	private boolean available;
	private Loan loan;
	private Iitem item;
	public ItemCopy(String copyId, boolean available, Iitem item) {
		super();
		this.copyId = copyId;
		this.available = available;
		this.item = item;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
