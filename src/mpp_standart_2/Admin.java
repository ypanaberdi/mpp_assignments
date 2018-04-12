package mpp_standart_2;

public class Admin {
	Department[] departments;
	
	public Admin(Department[] departments) {
		this.departments = departments;
	}

	//implement // todo try catch
	public String hourlyCompanyMessage(){
		String conString = "";
		for (int i = 0; i < departments.length; i++) {
			try {
				conString += format(departments[i].getName(), departments[i].nextMessage());
			} catch (EmptyQueueException e) {}
		}
		
		return conString;
	}
	
	public String format(String name, String msg){
		return name + ":" + msg + "\n";
	}
}
