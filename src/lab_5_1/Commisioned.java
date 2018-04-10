package lab_5_1;

import java.util.ArrayList;


public class Commisioned extends Employee{
	
	private ArrayList<Order> orders;
	
	public Commisioned(String empId) {
		super(empId);
		orders = new  ArrayList<Order>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public DateRange calcGrossPay() {
		// TODO Auto-generated method stub
		return null;
	}

}
