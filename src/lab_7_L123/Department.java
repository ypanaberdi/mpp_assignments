package lab_7_L123;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Position> positions;

	public String print() {
		return String.format("\n + Department: %s%s", name, positions.stream().map(pos->pos.print()).reduce("", (pos1, pos2)->pos1 + pos2));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (positions == null) {
			if (other.positions != null)
				return false;
		} else if (!positions.equals(other.positions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", positions=" + positions + "]";
	}

	public void addPosition(Position p) {
		positions.add(p);
	}

	public ArrayList<Position> getPositions() {
		return positions;
	}

	public Department(String name) {
		this.name = name;
		positions = new ArrayList<Position>();

	}
	
	public double getSalary(){
		return positions.stream().map(pos->pos.getSalary()).reduce(.0,(x,y)->x+y);
	}
	
	public boolean equals(Department d){
		if(name!=d.name)
			return false;
		
		return true;
	}
}
