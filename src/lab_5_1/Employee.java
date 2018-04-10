package lab_5_1;

import java.util.ArrayList;

public abstract class Employee {
	private String empId;
	final double FICA = 0.23;
	final double STATE = 0.05;
	final double LOCAL = 0.01;
	final double MEDICARE = 0.03;
	final double SS = 0.0075;
	ArrayList<Paycheck> paychecks;

	public void print() {
		System.out.println(String.format("Paychecks for Employee ID: %s, type:%s" , empId, this.getClass().getSimpleName()));
		if (paychecks.isEmpty())
			System.out.println("no paychecks entries.");
		else
			paychecks.stream().forEach(p -> p.print());
	}

	public Employee(String empId) {
		this.empId = empId;

		paychecks = new ArrayList<Paycheck>();
	}

	public Paycheck calcCompensation(int month, int year) {
		DateRange dateRange = new DateRange(month, year);
		double grossPay = calcGrossPay(dateRange);
		return new Paycheck(grossPay, grossPay * FICA, grossPay * STATE, grossPay * LOCAL, grossPay * MEDICARE,
				grossPay * SS, dateRange);
	};

	public void calcAddPaycheck(int month, int year) {
		paychecks.add(calcCompensation(month, year));
	};

	public abstract double calcGrossPay(DateRange dr);

}
