package mpp_standart_1.launch;

public class SavingsAccount extends Account {
	private double interestRate;
	private double balance;
	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		balance = startBalance;
		this.interestRate = interestRate;
	}

	@Override
	public double computeUpdatedBalance() {
		// balance + (interestRate * balance).
		return balance + (interestRate*balance);
	}

}
