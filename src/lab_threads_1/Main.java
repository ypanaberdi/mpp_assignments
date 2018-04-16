package lab_threads_1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static ArrayList<Integer> arrPrime = new ArrayList<Integer>();
	public static void main(String[] args) {
		//System.out.println(MainThreadPrime.isPrime(15));
		int processNum =0;
		int theadsNumber = 5;
		int limit = 1000000;
		int step = limit/theadsNumber;
		ArrayList<Thread> tArray = new  ArrayList<Thread>();
		
		
		// Lab 1 level // uncomment if you want to check, also comment below code
		/*for(int t = 0; t<theadsNumber;t++) {
			MainThreadPrime p = new MainThreadPrime(processNum++, t*step+1, step);
			new Thread(p).start();
		}*/
		
		// Lab 2 level
		processNum =0;
		theadsNumber = 10;
		step = limit/theadsNumber;
		
		
		for(int t = 0; t<theadsNumber;t++) {
			MainThreadPrime p = new MainThreadPrime(processNum++, t*step+1, step);
			tArray.add(new Thread(p));
			tArray.get(tArray.size()-1).start(); //start
		}
		
		
		tArray.forEach(t->{
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
		
		Collections.sort(arrPrime);
		System.out.println(arrPrime);		
		
	}

}
