package nastya.multythred;

public class Consumer implements Runnable {
	private final Warehouse warehouse;
	
	public Consumer (Warehouse warehouse) {
		this.warehouse = warehouse;
		}
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			warehouse.get();
			try { Thread.sleep(800); } catch (InterruptedException e) {}
		}
	}
}
