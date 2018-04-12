package extracredit1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Member implements Imember {
	private String id;
	private String name;
	private String address;
	private String phone;
	private ArrayList<Loan> loans = new ArrayList<Loan>();
	private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

	public void reserve(Aitem item) {
		
		Reservation r = new Reservation(LocalDate.now(), item);
		this.reservations.add(r);
	};

	public void borrow(Aitem item) {
		ItemCopy ic = item.getItemCopy();
		ic.setAvailable(false);
		LocalDate n = LocalDate.now();
		Loan l = new Loan(n, n.plusDays(item.getLimit()), ic);
		this.loans.add(l);
	};

	
	public void returnItem(IitemCopy itemCopy) {
		((ItemCopy)itemCopy).setAvailable(true);
		loans.remove(itemCopy);
	}

	public Member(String id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	};
}
