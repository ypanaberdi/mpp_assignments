package mpp_standart_2;

public abstract class Department {
	private StringQueue queue = new StringQueue();

	public StringQueue getQueue() {
		return queue;
	}

	abstract String getName();

	public void addMessage(String s) {
		queue.enqueue(s);
	}

	public String nextMessage() throws EmptyQueueException {
		return queue.dequeue();
	}
}