package extracredit1;

import java.util.ArrayList;

public class Library {
	ArrayList<Imember> members = new ArrayList<Imember>();
	ArrayList<IitemCopy> itemCopies = new ArrayList<IitemCopy>();
	public static void main(String[] args) {
		Library l = new Library(); 

		// creating books
		Book b1 = new Book("Java for dummies in 3 days", 7);
		Book b2 = new Book("Java Core", 3);
		Book b3 = new Book("Java OOP", 2);
		Book b4 = new Book("Understanding Java", 3);
		Book b5 = new Book("Java and coffee", 7);
		Magazine mag1 = new Magazine(5, 7);
		
		// creating copies of the books
		IitemCopy ic1 = new ItemCopy("01", true, b1);
		IitemCopy ic2 = new ItemCopy("021", true, b2);
		IitemCopy ic3 = new ItemCopy("022", true, b2);
		IitemCopy ic4 = new ItemCopy("031", true, b3);
		IitemCopy ic5 = new ItemCopy("032", true, b4);
		IitemCopy ic6 =new ItemCopy("033", true, b5);
		IitemCopy im7 = new ItemCopy("091", true, mag1);
		
		// adding reference to the books
		b1.addItemCopy(ic1);
		b2.addItemCopy(ic2);
		b2.addItemCopy(ic3);
		b3.addItemCopy(ic4);
		b4.addItemCopy(ic5);
		b5.addItemCopy(ic6);
		mag1.addItemCopy(im7);
		
		// adding to the library
		l.itemCopies.add(ic1);
		l.itemCopies.add(ic2);
		l.itemCopies.add(ic3);
		l.itemCopies.add(ic4);
		l.itemCopies.add(ic5);
		l.itemCopies.add(ic6);
		l.itemCopies.add(im7);
				
		Member m1 = new Member("986319", "Carl", "IA 525", "1641 232 880");
		Member m2 = new Member("986327", "Sammy", "IA 525", "1641 111 882");
		Member m3 = new Member("986324", "Innocent", "IA 525", "1641 238 882");
		
		
		// Book borrow process;
		if(b1.checkAvailability())
			m1.borrow(b1);
		else // reservation
			m1.reserve(b1);
		
		//return process
		m1.returnItem(ic1);
		
		// magazine borrow process;
		if(b1.checkAvailability())
			m1.borrow(b1);
		else
			m1.reserve(b1);
		
		m1.returnItem(ic1);
		
		
		
		//TODO: interaction with user and books;
		
	}

}
