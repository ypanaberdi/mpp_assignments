package lab_2;


public class Staff extends Person {
	private double salary;

	public Staff(String name, String phone, int i, double salary) {
		super(name, phone, i);
		this.salary = salary;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
