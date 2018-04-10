package lab_5_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class  DateRange {
	private LocalDate startDate;
	private LocalDate endDate;

	public boolean isInRange(LocalDate date) {
		return ((date.isAfter(startDate)) && (date.isBefore(endDate))) ? true : false;

	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yy");
		return startDate.format(f) + " – " + endDate.format(f);
	}

	public DateRange(int m, int y) {
		startDate = getFirstDayOfMonth(LocalDate.of(y, m, 1));
		endDate = getLastDayOfMonth(LocalDate.of(y, m, 1));
	}

	public static LocalDate getFirstDayOfMonth(LocalDate ld) {
		return ld.withDayOfMonth(1);
		
	}

	public static LocalDate getLastDayOfMonth(LocalDate ld) {
		return ld.withDayOfMonth(ld.lengthOfMonth());
	}
}
