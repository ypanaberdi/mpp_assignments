package lab_7_L4;


public final class Person implements IPerson{
	private String name, phone;
	private int age;

	public Person(String name, String phone, int i) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = i;
	}

	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}


	public int getAge() {
		return age;
	}

	
	@Override
	public void myAbstract() {
		System.out.println("in Abstract method in:" +this.getClass().getSimpleName());
	}
}
