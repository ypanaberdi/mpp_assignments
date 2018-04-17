package lab_7_L4;

import java.io.*;
import java.util.Arrays;

public class Main {
	public enum enumC {
		FIRST, SECOND
	};

	public enum enumClass {

		OURFIRSTVAL(1), OURSECONDVAL(2);

		int v;

		enumClass(int v) {
			this.v = v;
		}

		public int getValue() {
			return v;
		}
	};

	public static void main(String[] args) {

		// Create student objects
		Person johnDoe = new Person("John Doe", "472-1121", 22); // it's an
																	// immutable
																	// class
																	// Person,
																	// no
																	// setters,
																	// final and
																	// returns
																	// objects
																	// copies

		johnDoe.myDefault();
		johnDoe.myAbstract();
		IPerson.myStatic(); // static called from an Interfaces

		System.out.println(enumC.FIRST); // ordinary enum
		System.out.println(enumClass.OURFIRSTVAL.getValue()); // functions and
																// other types
																// as a
																// Constants
		System.out.println(enumClass.OURSECONDVAL.getValue());
	}

}
