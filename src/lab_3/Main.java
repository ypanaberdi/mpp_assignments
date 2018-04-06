package lab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import lab_3.Package;
import lab_3.Utils.Zones;

public class Main {
	private ArrayList<Package> packages = new ArrayList<Package>();
	private Sender who = null;

	public static void main(String[] args) throws IOException {
		Main mp = new Main();

		while (true) {
			putText("welcome, please choose (S)tudent, s(E)nior, (O)rdinary:");
			switch (getChar()) {
			case 'S':
				mp.who = new Student();
				break;
			case 'E':
				mp.who = new Senior();
				break;
			default:
				break;
			};
			
			 
			putText("please enter number of packages:");
			int current;
			try {
				int all = getInt();
				current = 0;
				while (current++ != all) {
					putText("great!\nEnter description");
					String desc = getString();
					putText("great!\nEnter weight");
					double weight = getDouble();
					putText("great!\nEnter zone, 2 symbols, for example TX for Texas");
					String txtzone = getString();
					Zones zone = Zones.valueOf(txtzone.toUpperCase());

					putText(String.format("Package %d out of %d, %s, %.2f, %s", current, all, desc, weight, zone));
					mp.addPackage(desc, weight, zone);
				}

				mp.printCosts();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	public static String getString() throws IOException // reads a string from
														// the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static double getDouble() throws IOException // reads an double from the keyboard input
	{
		String s = getString();
		return (Double.valueOf(s)).doubleValue();
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException // reads a character from
													// the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the
													// keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}

	public void addPackage(String desc, double weight, Zones zone) {
		packages.add(new Package(desc, weight, zone));
	}

	public void printCosts() {
		
		packages.stream().forEach(pkg -> {
			double min = 0.0;
			ArrayList<Carrier> carriers = new ArrayList<Carrier>();
			carriers.add(new FedEx("Fedex operator"));
			carriers.add(new UPS("UPS operator"));
			carriers.add(new USmail("USmail national operator"));
			// carriers.add(new DHL("DHL operator")); // uncomment this to check another
			// type of carrier

			carriers.stream().forEach(c -> c.setPackage(pkg));
			carriers.stream().forEach(c -> c.setSender(who));
			
			min = carriers.get(0).calcCost();
			String name = carriers.get(0).getName();

			for (Carrier carrier : carriers) {
				if (min > carrier.calcCost()) {
					min = carrier.calcCost();
					name = carrier.getName();
				}
			}

			putText(String.format("for package: %s best option is: %s with price $%.2f, discount: %.2f%%", pkg.getDescription(), name, min, who==null?0:who.calcDiscount()*100));

			// remove before using again for different package
			carriers.removeAll(carriers);
		});
	}

}