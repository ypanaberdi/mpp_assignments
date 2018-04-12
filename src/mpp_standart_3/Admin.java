package mpp_standart_3;

import java.util.*;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have
	// ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();

		for (LibraryMember member : members) {
			ArrayList<CheckoutRecordEntry> searchList = member.getCheckoutRecord().getCheckoutEntryList();

			for (CheckoutRecordEntry li : searchList) {
				if (li.getLendingItem().equals(item)) {
					phoneNums.add(member.getPhone());
					break;
				}
			}

		}

		Collections.sort(phoneNums);
		return phoneNums;
	}
}
