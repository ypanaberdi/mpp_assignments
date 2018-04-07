package lab_3_12;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Position> positions;

	public String print() {
		return String.format("\n + Department: %s%s", name, positions.stream().map(pos->pos.print()).reduce("", (pos1, pos2)->pos1 + pos2));
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
