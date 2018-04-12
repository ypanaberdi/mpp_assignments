package mpp_standart_1;

import java.util.ArrayList;

import mpp_standart_1.launch.Account;

public class Employee {
	private String name;
	private ArrayList<Account> accounts;
	
	public String getName() {
		return name;
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double  updatedBalance = 0;
		
		updatedBalance = accounts.stream().map(x->x.computeUpdatedBalance()).reduce(.0, (x, y) -> x+y);
		
		return updatedBalance;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public Employee(String name) {
		super();
		this.accounts = new ArrayList<Account>();
		this.name = name;
	}
}
