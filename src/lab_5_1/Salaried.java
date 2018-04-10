package lab_5_1;

public class Salaried  extends Employee{
	private double salary; 
	public Salaried(String empId, double sal) {
		super(empId);
		salary = sal;
	}

	public double calcGrossPay(DateRange dr) {
		
		
		return salary;
	}

}
