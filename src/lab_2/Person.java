package lab_2;


public class Person {
	protected String name, phone;
	protected int age;

	public Person(String name, String phone, int i) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return 0;
	}
}
