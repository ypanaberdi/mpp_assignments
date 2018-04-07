package lab_3_3;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	public String printReportingHierarchy() {
		return getDepartmentHead().printDownLine(" ");
	}
	
	/**
	 * Assume that superior of that department contains in positions of that department.
	 * 
	 * @return
	 */
	public Position getDepartmentHead() {
		Position headPositionsInDepartment = null;
		
		for (Iterator<Position> iterator = positions.iterator(); iterator.hasNext();) {
			Position position = iterator.next();
			if(!positions.contains(position.getSuperior())){
				headPositionsInDepartment =  position;
			}
		}
		
		return headPositionsInDepartment;
	}
}
