package lab_5_1;

public class Hourly extends Employee{
	double hourlyWage;
	int hoursPerWeek;
	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;		
	}

	public double calcGrossPay(DateRange dr) {
		
		
		
		return hourlyWage * hoursPerWeek*4;
	}

}
