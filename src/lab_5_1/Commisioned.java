package lab_5_1;

import java.util.ArrayList;


public class Commisioned extends Employee{
	double comission;
	double baseSalary;
	
	private ArrayList<Order> orders;
	
	public void addOrder(Order o) {
		orders.add(o);
	}

	public Commisioned(String empId, double com, double bs) {
		super(empId);
		orders = new  ArrayList<Order>();
		comission = com;
		baseSalary = bs;
	}

	
	public double calcGrossPay(DateRange dr) {
		double ordersSum =  orders.stream().filter(o->dr.isInRange(o.getOrderDate())).map(x->x.getOrderAmmount()).reduce(.0,(x, y)-> x+y);
		return baseSalary + ordersSum*comission;
	}


}
