package lab_3_3;

import java.net.DatagramPacket;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company("Hotel Victory Plaza");
		Employee lyle = new Employee(1, "Lyle", "", "Samishour", LocalDate.of(1980, 4, 9), "125-598-156", 150000);
		Employee anne = new Employee(2, "Anne", "", "Shmidt", LocalDate.of(1980, 4, 9), "155-598-156", 150300);
		Employee gary = new Employee(3, "Gary", "", "Wu", LocalDate.of(1980, 4, 9), "155-698-156", 120000);
		Employee ron = new Employee(4, "Ron", "", "Fo", LocalDate.of(1979, 4, 9), "105-598-156", 50000);
		Employee stan = new Employee(5, "Stan", "", "Kim", LocalDate.of(1980, 4, 9), "955-598-156", 65000);
		Employee tom = new Employee(2, "Tom", "", "Shmidt", LocalDate.of(1980, 4, 9), "155-598-156", 150300);
		Employee peter = new Employee(3, "Peter", "", "wu", LocalDate.of(1980, 4, 9), "155-698-156", 120000);
		Employee sue = new Employee(4, "Sue", "", "Fo", LocalDate.of(1979, 4, 9), "105-598-156", 50000);
		Employee mark = new Employee(5, "Mark", "", "Kim", LocalDate.of(1980, 4, 9), "955-598-156", 65000);
		Employee dan = new Employee(4, "Dan", "", "Fo", LocalDate.of(1979, 4, 9), "105-598-156", 50000);
		Employee bill = new Employee(5, "Bill", "", "Kim", LocalDate.of(1980, 4, 9), "955-598-156", 65000);
		// creating positions
		
		Position top = new Position("Top Executive", "CEO", null); // null because there is no more superior than Lyle
		top.setEmp(lyle);
		Position marketingHead = new Position("Marketing Department Director", "Marketing director", top); //Anne
		Position marketingManager = new Position("Manager", "Manager", marketingHead); // Gary
		Position salesHead = new Position("Sales Department", "Sales Director", top); // Ron
		Position salesManager = new Position("Sales manager", "Sales manager", salesHead); // Stan
		Position salesManager2 = new Position("Sales manager 2", "Sales manager", salesHead); // Peter
		Position salesIntern = new Position("Sales Intern", "Sales Intern", salesManager); // Tom
		Position salesIntern2 = new Position("Sales Intern 2", "Sales Intern 2", salesManager); //Sue
		Position salesIntern3 = new Position("Sales Intern 3", "Sales Intern 3", salesManager); // Marks
		Position salesIntern4 = new Position("Sales Intern 4", "Sales Intern 4", salesManager2); // Dan
		Position salesIntern5 = new Position("Sales Intern 5", "Sales Intern 5", salesManager2);
		
		Department marketingDep = c.createDepartment("Marketing");
		marketingDep.addPosition(marketingHead.setEmp(anne));
		marketingDep.addPosition(marketingManager.setEmp(gary));
		
		Department salesDep = c.createDepartment("Sales");
		salesDep.addPosition(salesHead.setEmp(ron));
		salesDep.addPosition(salesManager.setEmp(stan));
		salesDep.addPosition(salesManager2.setEmp(peter));
		salesDep.addPosition(salesIntern.setEmp(tom));
		salesDep.addPosition(salesIntern2.setEmp(sue));
		salesDep.addPosition(salesIntern3.setEmp(mark));
		salesDep.addPosition(salesIntern4.setEmp(dan));
		salesDep.addPosition(salesIntern5.setEmp(bill));
		

		
		// Hierarchy from the top
		System.out.println(String.format("Hierarhy for %s: %s",c.getName(), top.printDownLine("  ")));
		
		// Printing through all departments
		String outV = c.getDepartments().stream().map(dep->dep.printReportingHierarchy()).reduce("", (s1, s2)-> s1+s2);
		System.out.println(outV);
		
		// from the company
		c.printReportingHierarchy();
	}
}
