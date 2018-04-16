package lab_threads_1;

public class Main {

	public static void main(String[] args) {
		//System.out.println(MainThreadPrime.isPrime(15));
		int processNum =0;
		int theadsNumber = 5;
		int limit = 1000000;
		int step = limit/theadsNumber;
		
		//Lab 1 level
		/*for(int t = 0; t<theadsNumber;t++) {
			MainThreadPrime p = new MainThreadPrime(processNum++, t*step+1, step);
			new Thread(p).start();
		}*/
		
		processNum =0;
		theadsNumber = 10;
		limit = 1000000;
		step = limit/theadsNumber;
		
		// Lab 2 level
		for(int t = 0; t<theadsNumber;t++) {
			MainThreadPrime p = new MainThreadPrime(processNum++, t*step+1, step);
			new Thread(p).start();
		}
				
		
	}

}
