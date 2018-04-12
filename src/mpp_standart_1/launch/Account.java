package mpp_standart_1.launch;

public abstract class Account {
	private double balance;

	private String acctId;

	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public abstract double computeUpdatedBalance();
}
