package nastya.multythred;

public class Main {

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		
		Thread producerThread = new Thread(new Producer(warehouse));
		Thread consumerThread = new Thread(new Consumer(warehouse));
		
		producerThread.start();
		consumerThread.start();

	}

}
