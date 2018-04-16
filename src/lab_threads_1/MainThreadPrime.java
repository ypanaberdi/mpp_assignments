package lab_threads_1;

public class MainThreadPrime implements Runnable {

	int threadNumber = 0;
	int start, range;

	public MainThreadPrime(int x, int start, int range) {
		super();
		this.threadNumber = x;
		this.start = start;
		this.range = range;
	}

	public void run() {
		System.out.println("Start thread:" + threadNumber);

		for (int i = start; i < (start + range); i++) {
			// System.out.println("Thread: " + threadNumber + "["+ i + "] " +
			// (isPrime(i)?" prime":" not Prime"));
			if (isPrime(i)) {
				System.out.println("Thread: " + threadNumber + "[" + i + "]");
				synchronized (Main.arrPrime) { // synchronized keyword on block  of code
					Main.arrPrime.add(i);
				}
			}
		}

	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if ((n % i) == 0)
				return false;

		return true;
	}

}
