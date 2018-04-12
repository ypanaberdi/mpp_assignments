package mpp_standart_1.launch;

public class CheckingAccount extends Account {
	private double monthlyFee;
	private double balance;
	public CheckingAccount(String acctId, double monthlyFee, double startBalance) {
		balance = startBalance;
		this.monthlyFee = monthlyFee;
	}

	@Override
	public double computeUpdatedBalance() {
		// balance – monthlyFee.
		return balance - monthlyFee;
	}

}
