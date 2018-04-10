package lab_5_1;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}

	public void print() {
		System.out.println(String.format("	in date range: %s, NET payment is: $%.2f, GROSS payment is: $%.2f", payPeriod, getNetPay(), grossPay));
	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}
}
