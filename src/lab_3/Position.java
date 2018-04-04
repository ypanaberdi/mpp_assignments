package lab_3;

public class Position {
	private String title, description;
	private Employee emp;

	public String print(){
		return String.format("\n   Position title: %s\n   Position Description: %s\n%s", getTitle(), getDescription(), emp==null?"     =  vacant":emp.print());
	}

	public Position setEmp(Employee emp) {
		this.emp = emp;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Position(String title, String description) {

		this.title = title;
		this.description = description;

	}
	
	public double getSalary(){
		return emp==null?.0:emp.getSalary();
	}
}
