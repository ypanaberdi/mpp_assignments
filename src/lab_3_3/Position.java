package lab_3_3;

import java.util.ArrayList;

public class Position {
	private String title, description;
	private Employee emp;
	private Position superior;
	private ArrayList<Position> inferior = new ArrayList<Position>();

	public String print() {
		return String.format("\n   Position title: %s\n   Position Description: %s\n%s", getTitle(), getDescription(),
				emp == null ? "     =  vacant" : emp.print());
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

	public Position(String title, String description, Position superior) {
		this.title = title;
		this.description = description;

		if (superior != null) {
			this.superior = superior;
			this.superior.addInferior(this);
		}
	}

	public String printDownLine(String pre) {
		return String.format("\n%sPosition title: %s. hold by %s %s. %s ", pre, getTitle(), emp.getFirstName() , emp.getLastName(),
				getInferior().isEmpty() ? ""
						: getInferior().stream().map(pos -> pos.printDownLine(pre + "  ")).reduce("Inferiors:", (x, y) -> x + y));

	}

	/**
	 * 
	 * @return Boolean
	 */
	public Boolean isManager() {
		if (getInferior().isEmpty()) {
			return false;
		}

		return true;
	}

	public void addInferior(Position p) {
		inferior.add(p);
	}

	public ArrayList<Position> getInferior() {
		return inferior;
	}

	public double getSalary() {
		return emp == null ? .0 : emp.getSalary();
	}

	public Position getSuperior() {
		return superior;
	}

	
}
