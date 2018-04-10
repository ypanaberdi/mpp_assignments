package lab_5_1;

import java.util.ArrayList;

public abstract class Employee {
	private String empId;
	private ArrayList<Paycheck> paychecks;
	public void print() {
		
	}
	
	public Employee(String empId) {
		this.empId = empId;
		
		paychecks = new  ArrayList<Paycheck>();
	}

	public Paycheck calcCompensation(int month, int year) {
		
		
		return null;
	};
	
	public abstract DateRange calcGrossPay();
	
}
