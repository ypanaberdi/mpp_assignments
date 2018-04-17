package lab_7_L4;

public interface IPerson {
	default void myDefault(){
		System.out.println("In default method");
	}
	
	static void myStatic(){
		System.out.println("In static method");
	}
	
	abstract void myAbstract();
}
