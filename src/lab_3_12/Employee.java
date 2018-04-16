package lab_3_12;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String firstName, middleInitial, lastName;

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee t = (Employee) obj;

		if (this.employeeId != t.employeeId)
			return false;
		if (this.firstName != t.firstName)
			return false;
		if (this.middleInitial != t.middleInitial)
			return false;
		if (this.SSN != t.SSN)
			return false;
		if (this.salary != t.salary)
			return false;
		if (this.birthDate != null)
			if (!this.birthDate.equals(t.birthDate))
				return false;

		if (t.birthDate != null)
			if (!t.birthDate.equals(this.birthDate))
				return false;

		return true;
	}

	private LocalDate birthDate;
	private String SSN;
	private double salary;

	public Employee(int employeeId, String firstName, String miggleInitial, String lastName, LocalDate birthDate,
			String SSN, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = miggleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.SSN = SSN;
		this.salary = salary;
	}

	public String print() {
		return String.format("     id:%d. %s %s %s, birthdate: %s, SSN:%s, Salary: $%.2f", employeeId, firstName,
				middleInitial, lastName, birthDate, SSN, salary);
	}

	public double getSalary() {
		return salary;
	}
}
