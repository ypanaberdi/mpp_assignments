package lab_3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company("Booking.com");
		Employee arthur = new Employee(1, "Arthur", "", "Samishour", LocalDate.of(1980, 4, 9), "125-598-156", 150000);
		Employee anne = new Employee(2, "Anne", "", "Shmidt", LocalDate.of(1980, 4, 9), "155-598-156", 150300);
		Employee john = new Employee(3, "John", "", "wu", LocalDate.of(1980, 4, 9), "155-698-156", 120000);
		Employee sam = new Employee(4, "Sam", "", "Fo", LocalDate.of(1979, 4, 9), "105-598-156", 50000);
		Employee ashton = new Employee(5, "Ashton", "", "Kim", LocalDate.of(1980, 4, 9), "955-598-156", 65000);

		Department marketingDep = c.createDepartment("Marketing");
		marketingDep.addPosition((new Position("Marketing Department Director", "Main position in department")).setEmp(arthur));
		marketingDep.addPosition((new Position("Marketing manager", "Managerial position")).setEmp(anne));
		marketingDep.addPosition(new Position("Marketing manager", "Managerial position"));

		Department itDep = c.createDepartment("IT Department");
		itDep.addPosition(new Position("IT Department Director", "Main position in department"));
		itDep.addPosition((new Position("Senior programmer", "Senior programmer position")).setEmp(john));
		itDep.addPosition((new Position("Junior programmer", "Junior programmer position")).setEmp(sam));
		itDep.addPosition((new Position("Middle programmer", "Middle programmer position")).setEmp(ashton));

		// hierarchy
		System.out.println(c.print());
		System.out.println();
		// total salary
		System.out.println(String.format("Total salary of the %s company is $%.2f", c.getName(), c.getSalary()));
	}
}
