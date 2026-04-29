package nastya.multythred;

public class Warehouse {
	private int item;
	private boolean isEmpty = true;
	
	public synchronized void put (int value) {
		while (!isEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		item = value;
		isEmpty = false;
		System.out.println("Produced: "+ item);
		notify();
	}
	public synchronized int get() {
		while (isEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		isEmpty = true;
		System.out.println("Consumed: "+ item);
		
		notify();
		return item;
	}

}
