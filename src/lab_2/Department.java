package lab_2;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
	String name;
	List<Person> persons = new ArrayList<Person>();

	public Department(String string) {
		name = string;
	}

	double getTotalSalary() {
		return persons.stream().map(x -> x.getSalary()).reduce(.0, (x, y) -> x + y);
	}

	public void showAllMembers() {
		persons.forEach(p -> System.out.println(String.format("Name: %s, age: %d, phone:%s, member type: %s",
				p.getName(), p.getAge(), p.getPhone(), p.getClass().getSimpleName())));

	}

	public void unitsPerFaculty() {
		persons.stream().filter(p -> (p instanceof Faculty)).map(x -> (Faculty) x).forEach(p -> System.out
				.println(String.format("Name: %s, units per faculty: %d", p.getName(), p.getTotalUnits())));
	}

	public void addPerson(Person p) {
		persons.add(p);

	}

	public void facultyMemberStudents(Faculty f) {
		
		List<Student>  facultyMemberStudents = persons.stream().filter(p->p instanceof Student).map(s->(Student)s)
		.filter(s->s.getCourses().stream().anyMatch(course->f.getCourses().contains(course)))
		.collect(Collectors.toList());
		
		facultyMemberStudents.forEach(student -> {
			System.out.print(student.getName() + ", courses: ");
			student.getCourses().stream().filter(f.getCourses()::contains)
			.forEach(c->System.out.print(c.getTitle() + " ") );
			System.out.println();
			});
			
		
	}
}
