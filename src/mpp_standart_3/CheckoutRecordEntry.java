package mpp_standart_3;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType type;

	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.type = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public ItemType getLendingItemType() {
		return type;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

}
