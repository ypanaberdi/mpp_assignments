package 
lab_5_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		LocalDate dateCalendarApril = LocalDate.of(1998, 4, 12);
		LocalDate dateCalendarMay = LocalDate.of(1998, 5, 12);
		
		Order o1 = new Order("1", dateCalendarApril, 50); //
		Order o2 = new Order("2", dateCalendarApril, 50); //
		
		Order o3 = new Order("3", dateCalendarMay, 100);
		Order o4 = new Order("4", dateCalendarMay, 100);
		
		Salaried sal_john = new Salaried("s111", 50100.90);
		Salaried sal_beck = new Salaried("s222", 50500.8);
		
		Hourly hour_stas = new Hourly("h151", 35.5, 25);
		Hourly hour_dima = new Hourly("h991", 25, 30);
		
		Commisioned com_baur = new Commisioned("c445", 0.07, 100); //
		Commisioned com_iman = new Commisioned("c895", 0.07, 30);
		
		com_baur.addOrder(o1); //
		com_baur.addOrder(o2); //
		com_iman.addOrder(o3);
		com_iman.addOrder(o4);
		
		ArrayList<Employee> empArr = new ArrayList<Employee>(Arrays.asList(new Employee[]{sal_john,sal_beck, hour_dima, hour_stas, com_baur, com_iman}));
		
		empArr.stream().forEach(emp->emp.calcAddPaycheck(4, 1998)); // April polymorphism
		empArr.stream().forEach(emp->emp.calcAddPaycheck(5, 1998)); // May
		empArr.stream().forEach(emp->emp.print());
	}

}
