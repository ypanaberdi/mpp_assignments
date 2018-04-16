package lab_threads_1;

import java.util.ArrayList;

public class MainThreadPrime implements Runnable {
	
	int threadNumber = 0;
	int start, range;
	static ArrayList<Integer> arrPrime = new ArrayList<Integer>();
	
	public MainThreadPrime(int x, int start, int range) {
		super();
		this.threadNumber = x;
		this.start = start;
		this.range = range;
	}

	public void run() {
		System.out.println("Start thread:" + threadNumber);
		
		
		for(int i = start; i<(start + range); i++) {
			//System.out.println("Thread: " + threadNumber + "["+ i + "] " + (isPrime(i)?" prime":" not Prime"));
			if(isPrime(i)) {
				System.out.println("Thread: " + threadNumber + "["+ i + "]");
				synchronized (MainThreadPrime.arrPrime){ // synchronized keyword on block of  code
					MainThreadPrime.arrPrime.add(i);
				}
			}
		}
		
		System.out.println(arrPrime);
		
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if ((n % i) == 0)
				return false;
		
		return true;
	}

}
