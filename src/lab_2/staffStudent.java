package lab_2;


import java.time.LocalDateTime;

public class staffStudent extends Student {
	private double salary;
	private LocalDateTime startDateOfTheFirstCourse;
	
	public LocalDateTime getStartDate() {
		return startDateOfTheFirstCourse;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDateOfTheFirstCourse = startDate;
	}

	public staffStudent(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);
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
