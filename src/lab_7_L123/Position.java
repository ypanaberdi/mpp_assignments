package lab_7_L123;

import java.util.Objects;

public class Position implements Cloneable{
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

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (emp == null) {
			if (other.emp != null)
				return false;
		} else if (!emp.equals(other.emp))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + ", emp=" + emp + "]";
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
	
	@Override
	public int hashCode() {
		return Objects.hash(title, description, emp);
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Position c = (Position) super.clone();
		c.emp = (Employee) emp.clone();
		
		return c;
	}
	
}
