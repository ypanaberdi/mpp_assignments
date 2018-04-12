package mpp_standart_3;

import java.util.ArrayList;

public class CheckoutRecord {
	ArrayList<CheckoutRecordEntry> checkoutEntryList = new ArrayList<CheckoutRecordEntry>();

	public ArrayList<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}

	public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry) {
		this.checkoutEntryList.add(checkoutRecordEntry);
	}
	
}
