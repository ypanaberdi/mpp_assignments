package lab_3_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
 
public class Company {
	private String name;
	public String getName() {
		return name;
	}

	private ArrayList<Department> departments;

	public String print() {
		return String.format("Company name %s%s", this.name, departments.stream().map(dep->dep.print()).reduce("",(d1,d2)->d1.toString() + d2.toString()));
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public Company(String name) {
		super();
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public Department createDepartment(String name) {
		Department d = new Department(name);
		departments.add(d);
		
		return d;
	}
	
	public double getSalary(){
		return departments.stream().map(dep->dep.getSalary()).reduce(.0, (x,y)->x+y);
	}
	
	public void printReportingHierarchy() {
		
		
		Position hp = departments.get(0).getDepartmentHead().getSuperior();
		
		
		System.out.println(hp.printDownLine(" ")); 
	}
	
}
