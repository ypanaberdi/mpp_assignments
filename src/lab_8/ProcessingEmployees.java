package lab_8;

import java.util.ArrayList;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static int countWords(List<String> words, char c, char d, int len) {

		Predicate<String> lpr = word -> word.length() == len; // gives boolean
		Predicate<String> cpr = word -> word.contains(Character.toString(c)); // gives boolean
		Predicate<String> ncpr = word -> !word.contains(Character.toString(d)); // gives boolean

		return (int) words.stream().filter(lpr).filter(cpr).filter(ncpr).count();
	}

	public static void main(String[] args) {

		System.out.println(
				countWords(Arrays.asList(new String[] { "cup", "hat", "map", "gap", "clap", "big", "small" }), 'a', 't', 3));


		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// 1) Count the number of last names that begin with the letter ‘B’. Print out
		// this number.
		long c = list.stream().filter(e -> e.getLastName().startsWith("B")).count();
		System.out.println(String.format("The number of last names that begin with the letter  ‘B’: %s", c));

		// 2) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ in sorted order.
		Util.sop(
				"Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order. ");
		Function<Employee, String> byLN = Employee::getLastName;
		list.stream().sorted(Comparator.comparing(byLN)).filter(e -> e.getLastName().startsWith("B"))
				.forEach(e -> Util.sop(e.toString()));

		// 3) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ and change their first name and last name to be All capital
		// letters.
		Util.sop(
				"Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.");
		list.stream().forEach(e -> {
			if (e.getLastName().startsWith("B")) {
				// e.setFirstName(e.getFirstName().toUpperCase()); // uncomment to check
				// e.setLastName(e.getLastName().toUpperCase());
			}
		});
		list.stream().forEach(e -> Util.sop(e.toString()));

		// Print out All of the employee objects, but if the last name begins with the
		// letter ‘B’, then capitalize all the letters in the last name.
		Util.sop(
				"Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.");
		list.stream().forEach(e -> {
			if (e.getLastName().startsWith("B"))
				e.setLastName(e.getLastName().toUpperCase()); // uncomment to check
		});
		list.stream().forEach(e -> Util.sop(e.toString()));

		Util.sop("4.1)  Use the  Collectors.joining  method to print out All Employee objects");
		Util.sop(list.stream().map(Employee::toString).collect(Collectors.joining(", ")));

		Util.sop(
				"4.2)  Use the  Collectors.joining  method to print out All Employee objects, and separate each one with a delimeter of  “---\n---“ ");
		Util.sop(list.stream().map(Employee::toString).collect(Collectors.joining("---\n---")));

		Util.sop(
				"Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order, and get rid of all the duplicates.  Print out only the last names.");
		list.stream().filter(e -> e.getLastName().startsWith("I")).sorted(Comparator.comparing(Employee::getLastName))
				.map(Employee::getLastName).distinct().forEach(e -> Util.sop(e));

		Util.sop("Print out the average of all the salaries.");
		Util.sop(String.format("First method %.2f",
				list.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage()));

		Util.sop(String.format("Second method %.2f", list.stream().map(e -> e.getSalary())
				.collect(Collectors.summarizingDouble(Double::valueOf)).getAverage()));

		Util.sop("7)  Use the  ‘reduce’  method to print out the total salary of all employees.");
		Util.sop(String.format("Total salary: %.2f",
				list.stream().map(x -> x.getSalary()).reduce(.0, (x, y) -> (x + y))));

		Util.sop(
				"8)  Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.");
		list.stream().map(x -> x.getFirstName()).forEach(x -> Util.sop(x));

		Util.sop(
				"9)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream.");
		Stream.iterate(0, i -> i + 2).limit(20).forEach(x -> Util.sop(x.toString()));

		Util.sop(
				"9-1)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream.");
		Stream.iterate(0, i -> i + 1).filter(x -> x % 2 == 0).limit(20).forEach(x -> Util.sop(x.toString()));

		System.exit(0);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// Predicate (boolean-valued function) that returns true for salaries
		// in the range $4000-$6000
		Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

		// Display Employees with salaries in the range $4000-$6000
		// sorted into ascending order by salary
		System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary:%n");

		list.stream().filter(fourToSixThousand).sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		// Display first Employee with salary in the range $4000-$6000
		System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
				list.stream().filter(fourToSixThousand).findFirst().get());

		// Functions for getting first and last names from an Employee
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;

		// Comparator for comparing Employees by first name then last name
		Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

		// sort employees by last name, then first name
		System.out.printf("%nEmployees in ascending order by last name then first:%n");
		list.stream().sorted(lastThenFirst).forEach(System.out::println);

		// sort employees in descending order by last name, then first name
		System.out.printf("%nEmployees in descending order by last name then first:%n");
		list.stream().sorted(lastThenFirst.reversed()).forEach(System.out::println);

		// display unique employee last names sorted
		System.out.printf("%nUnique employee last names:%n");
		list.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);

		// display only first and last names
		System.out.printf("%nEmployee names in order by last name then first name:%n");
		list.stream().sorted(lastThenFirst).map(Employee::getName).forEach(System.out::println);

		// group Employees by department
		System.out.printf("%nEmployees by department:%n");
		Map<String, List<Employee>> groupedByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		groupedByDepartment.forEach((department, employeesInDepartment) -> {
			System.out.println(department);
			employeesInDepartment.forEach(employee -> System.out.printf("   %s%n", employee));
		});

		// count number of Employees in each department
		System.out.printf("%nCount of Employees by department:%n");

		Map<String, Long> employeeCountByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));

		employeeCountByDepartment
				.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));

		/*
		 * Output looks something like :
		 * 
		 * HR 4 IT 8 Sales 12
		 */
		/*
		 * // sum of Employee salaries with DoubleStream sum method
		 * System.out.printf("%nSum of Employees' salaries (via sum method): %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).sum());
		 * 
		 * // calculate sum of Employee salaries with Stream reduce method
		 * System.out.printf("Sum of Employees' salaries (via reduce method): %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) ->
		 * value1 + value2));
		 * 
		 * // average of Employee salaries with DoubleStream average method
		 * System.out.printf("Average of Employees' salaries: %.2f%n",
		 * list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
		 */
	} // end main

} // end class ProcessingEmployees
