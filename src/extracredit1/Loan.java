package extracredit1;

import java.time.LocalDate;

public class Loan {
	public IitemCopy getItemCopy() {
		return itemCopy;
	}
	private LocalDate checkOutDate;
	private LocalDate returnDate;
	private IitemCopy itemCopy;
	public Loan(LocalDate checkOutDate, LocalDate returnDate, IitemCopy itemCopy) {
		super();
		this.checkOutDate = checkOutDate;
		this.returnDate = returnDate;
		this.itemCopy = itemCopy;
	}
}
