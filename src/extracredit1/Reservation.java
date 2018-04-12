package extracredit1;

import java.time.LocalDate;

public class Reservation {
	public Reservation(LocalDate reservationDate, Iitem item) {
		super();
		this.reservationDate = reservationDate;
		this.item = item;
	}

	private LocalDate reservationDate;
	private Iitem item;
	
	public boolean checkAvailability() {
		return false;
		
	}
}
