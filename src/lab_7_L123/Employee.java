package lab_7_L123;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Cloneable{
	private int employeeId;
	private String firstName, middleInitial, lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;

	@Override
	public Object clone() throws CloneNotSupportedException{
		Employee ec = (Employee) super.clone();
		return ec;
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(employeeId, firstName, lastName, middleInitial, birthDate, SSN, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleInitial == null) {
			if (other.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(other.middleInitial))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", SSN=" + SSN + ", salary=" + salary + "]";
	}

	public String print() {
		return String.format("     id:%d. %s %s %s, birthdate: %s, SSN:%s, Salary: $%.2f", employeeId, firstName,
				middleInitial, lastName, birthDate, SSN, salary);
	}

	public double getSalary() {
		return salary;
	}
}
