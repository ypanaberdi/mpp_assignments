package inClassThreadLab0;

public class mainThreadClass {

	public static void main(String[] args) {

		System.out.println("Inside main  ");
		int i;
		for (i = 1; i <= 10; i++) {
			PrimeThread p = new PrimeThread(i);
			// Now, to take up some CPU time ...
			double temp = 10;
			double temp2;
			for (int z = 0; z < 30000; z++) {
				temp = temp + 0.1;
				temp2 = temp / 4.6; // Wasting time.
				temp = temp - 0.1;
			}
			p.start();
		}

	}
}
