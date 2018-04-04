package lab_2;


import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
	private double salary;
	List<Course> courses = new ArrayList<Course>();
	
	public Faculty(String name, String phone, int i, double salary) {
		super(name, phone, i);
		this.salary = salary;
	}

	public boolean addCourse(Course c){
		return courses.add(c);
	}
	
	@Override
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	int getTotalUnits() {
		return courses.stream().map(x -> x.getUnits()).reduce(0, (x, y) -> x + y);
	}
}
