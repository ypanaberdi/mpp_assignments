package lab_2;


import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Department dept = new Department("ComputerScience");

		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
		Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
		Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

		dept.addPerson(frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);

		// Create student objects
		Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
		Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
		Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

		dept.addPerson(johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);

		// Create staff objects
		Person frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
		Person adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
		Person davidHeck = new Staff("David Heck", "472-8890", 29, 3600);
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);

		// Create course objects

		Course cs201 = new Course("cs201", "programming", 4);// , johnDoodle);
		Course cs360 = new Course("cs360", "database", 3);// , samHoward);
		Course cs404 = new Course("cs404", "compiler", 4);// , johnDoodle);
		Course cs240 = new Course("cs240", "datastructure", 2);// , johnDoodle);
		Course cs301 = new Course("cs301", "Software engg", 3);// , samHoward);
		Course cs450 = new Course("cs450", "Advanced architecture", 5);// ,
																		// frankMoore);

		// Faculties courses
		((Faculty) johnDoodle).addCourse(cs201);
		((Faculty) samHoward).addCourse(cs360);
		((Faculty) johnDoodle).addCourse(cs404);
		((Faculty) johnDoodle).addCourse(cs240);
		((Faculty) samHoward).addCourse(cs301);
		((Faculty) frankMoore).addCourse(cs450);

		Course[] johnDoeCourses = new Course[] { cs201, cs360, cs404, cs301 };
		Arrays.asList(johnDoeCourses).forEach(course -> ((Student) johnDoe).addCourse(course));

		Course[] maryJonesCourses = new Course[] { cs201, cs404, cs450 };
		Arrays.asList(maryJonesCourses).forEach(course -> ((Student) maryJones).addCourse(course));

		Course[] leeJohnsonCourses = new Course[] { cs201, cs360, cs240, cs450 };
		Arrays.asList(leeJohnsonCourses).forEach(course -> ((Student) leeJohnson).addCourse(course));

		// Create staffStudents objects *** PLEASE UNCOMMENT TO TEST
		// staffStudent class
		/*
		 * Person sammyFo = new staffStudent("Sammy Fo", "472-3321", 30, 3.5,
		 * 2000); Person dixonMa = new staffStudent("Dixon Ma", "472-7552", 30,
		 * 3.9, 2500); dept.addPerson(sammyFo); dept.addPerson(dixonMa);
		 * 
		 * Arrays.asList(leeJohnsonCourses).forEach(course -> ((Student)
		 * sammyFo).addCourse(course));
		 * Arrays.asList(leeJohnsonCourses).forEach(course -> ((Student)
		 * dixonMa).addCourse(course));
		 */
		double totsalary = 0;

		while (true) {
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty, findStudentsByFaculty or quit : ");
			int choice;
			try {
				choice = getChar();

				switch (choice) {
				case 'g':
					totsalary = dept.getTotalSalary();
					putText(String.format("Total sum of all salaries is: $%.2f", totsalary));
					break;
				case 's':
					dept.showAllMembers();
					break;
				case 'u':
					dept.unitsPerFaculty();
					break;
				case 'f':
					// creating a List
					Person[] facultyPersons = dept.persons.stream().filter(p -> p instanceof Faculty)
							.toArray(Person[]::new);

					if (facultyPersons.length > 0) {
						int i = 0;
						for (Person p : facultyPersons) {
							System.out.println(i++ + ". " + p.getName());
						}

						System.out.println("Choose faculty by number:");
						choice = getInt();
						System.out.println("You have chosen " + facultyPersons[choice].getName() + ", his students:");
						dept.facultyMemberStudents((Faculty) facultyPersons[choice]); // downcasting to Faculty														// Faculty
					}

					break;
				case 'q':
					return;
				default:
					putText("Invalid entry\n");
				} // end switch
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end while
	} // end main()
		// -------------------------------------------------------------

	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	public static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException // reads a character from
													// the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the
													// keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
} // end class
