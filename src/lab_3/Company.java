package lab_3;

import java.util.ArrayList;
 
public class Company {
	private String name;
	public String getName() {
		return name;
	}

	private ArrayList<Department> departments;

	public String print() {
		return String.format("Company name %s%s", this.name, departments.stream().map(dep->dep.print()).reduce("",(d1,d2)->d1.toString() + d2.toString()));
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
	
}
