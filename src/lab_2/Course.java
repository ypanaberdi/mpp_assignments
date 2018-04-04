package lab_2;


public class Course implements Comparable<Course>{
	private int units;
	private String title, number;

	public Course(String title, String number, int units) {
		this.title = title;
		this.number = number;
		this.units = units;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public int compareTo(Course c) {
		// TODO Auto-generated method stub
		 
		return title.compareTo(c.title);
	}

}
