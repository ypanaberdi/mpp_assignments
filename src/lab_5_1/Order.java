package lab_5_1;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmmount;
	public Order(String orderNo, LocalDate orderDate, double orderAmmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmmount = orderAmmount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmmount() {
		return orderAmmount;
	}
	
	 
}
