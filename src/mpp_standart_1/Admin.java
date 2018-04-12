package mpp_standart_1;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double  updatedBalance = 0;
		updatedBalance = list.stream().map(x->x.computeUpdatedBalanceSum()).reduce(.0, (x, y) -> x+y);
		
		return updatedBalance;
	}
}
