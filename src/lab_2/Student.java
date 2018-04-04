package lab_2;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	@SuppressWarnings("unused")
	private double GPA;
	List<Course> courses = new ArrayList<Course>();

	public List<Course> getCourses() {
		return courses;
	}

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		GPA = gpa;
	}
	
	public boolean addCourse(Course c){
		return courses.add(c);
	}
}
